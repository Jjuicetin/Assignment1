package driver;


import java.io.BufferedReader;
import utilities.Sorting;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

import Compare.areaCompare;
import Compare.volumeCompare;
import Objects.Cone;
import Objects.Cylinder;
import Objects.OctagonPrism;
import Objects.PentagonPrism;
import Objects.Pyramids;
import Objects.Shape;
import Objects.SquarePrism;
import Objects.TriangularPrism;




public class Driver {
   
	
	public static void main(String[] args) throws IOException
	{    
		    int count = 0;
		    
		    Scanner scan = new Scanner(System.in);  // Create a Scanner object
		    System.out.println("Enter file you want to choose");
		    String file = scan.nextLine();
		    String filePath = "res/" + file;
		    File fileObj = new File(filePath);
		    if (file.equals("polyfor1.txt"))
		    {
		    	count = 20237;
		    }
		    if (file.equals("polyfor3.txt"))
		    {
		    	count = 472956;
		    }
		    if (file.equals("polyfor5.txt"))
		    {
		    	count = 1078499;
		    }
		    if (file.equals("polyNameBIG.txt"))
		    {
		    	count = 8388608;
		    }
		    
		    Shape[] shapeArray = new Shape[count];
		    String line = " ";
		   
		    try {
			BufferedReader br = new BufferedReader( new FileReader(filePath));
			
			line = br.readLine();
			StringTokenizer st = new StringTokenizer(line, " ");
		    int ignore ; // dummy variable
			String shape ;
		    double num1;
		    double num2;
		    int position = 0;
		    //move the pointer to the second element of the text file
		    if(st.hasMoreTokens())
			{
		    	
				ignore =  (int) Double.parseDouble(st.nextToken());
			
			}
		    
		  //  Shape[] shapeArray = new Shape[];
			
			while(st.hasMoreTokens())
			{
			  
				shape = st.nextToken();
				num1 = Double.parseDouble(st.nextToken());
				num2 = Double.parseDouble(st.nextToken());
				  
				//System.out.println(shape + " " + num1 + " " + num2);
				
				
			if (shape.equals("Cone"))
			   {
				   Cone cone = new Cone (shape, num1, num2);
				   shapeArray[position] = cone;
				 // System.out.println("Cone" + " " + num1 + " " + num2);
				   
			   }
			   
			   else if (shape.equals("Cylinder")) 
			   {
				   Cylinder cylinder = new Cylinder(shape, num1, num2);
				   shapeArray[position] = cylinder;
				// System.out.println("Cylinder" + " " + num1 + " " + num2);
			   }
			   
			   else if (shape.equals("Pyramid")) 
			   {
				   Pyramids pyramid = new Pyramids(shape, num1, num2);
				   shapeArray[position] = pyramid;
				//  System.out.println("Pyramid" + " " + num1 + " " + num2);
			   }
			   
			   else if (shape.equals("SquarePrism")) 
			   {
				   SquarePrism squarePrism = new SquarePrism ( shape, num1, num2);
				   shapeArray[position] = squarePrism;
				  // System.out.println("SquarePrism" + " " + num1 + " " + num2);
			   }
			   else if (shape.equals("TriangularPrism")) 
			   {
				   TriangularPrism triangularPrism = new TriangularPrism (shape, num1, num2);
				   shapeArray[position] = triangularPrism;
				//  System.out.println("TriangularPrism" + " " + num1 + " " + num2);
			   }
			   
			   else if (shape.equals("PentagonalPrism")) 
			   {
				   PentagonPrism pentagonPrims = new PentagonPrism ( shape, num1, num2);
				   shapeArray[position] = pentagonPrims;
				  // System.out.println("PentagonalPrism" + " " + num1 + " " + num2);
			   }
			   
			   else if (shape.equals("OctagonalPrism")) 
			   {
				   OctagonPrism octagonPrism = new OctagonPrism (shape, num1, num2);
				   shapeArray[position] = octagonPrism;
				  // System.out.println("OctagonalPrism" + " " + num1 + " " + num2);
			   }
			   
                
				//System.out.println(shapeArray[position].getHeight());
				position++;
				
				
				
		}
			//System.out.println(shapeArray[1]);
			
		
		    }catch (FileNotFoundException e) {
		
			e.printStackTrace();
		    
		
		
			}
		   // Shape s = new Shape();
		 //  volumeCompare vc = new volumeCompare();
		  // Sorting.bubbleSort(shapeArray, vc);
		  // for(int i = 0; i < shapeArray.length; i = i + 1000)// print each element thoudsand value in between 
		 // {
		  // 	System.out.println( shapeArray[i].getShape() + " " + shapeArray[i].calcVolume());
		  // }
		    
		    Arrays.sort(shapeArray);
		    for(int i = 0; i < shapeArray.length; i = i + 1000)// print each element thoudsand value in between 
				  {
				   	System.out.println( shapeArray[i].getShape() + " " + shapeArray[i].getHeight());
				   }
		  
		   
		   // areaCompare ac = new areaCompare();
		  //  Sorting.bubbleSort(shapeArray, ac);
            //   for(int i = 0; i < shapeArray.length ; i = i + 1000	)
             //  {
            //	   System.out.println(shapeArray[i].getShape() + " " + shapeArray[i].calcBaseArea() );
            	    
            //   }
            
		    //System.out.println();
			
		   // System.out.println("Sort by grade: ");
			//volumeCompare gc = new volumeCompare();
			//Collections.sort(shapeArray);
			
          
	}
		    
	
		
		
		

	}


