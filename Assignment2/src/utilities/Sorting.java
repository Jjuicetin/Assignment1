package utilities;
import java.util.Comparator;

import Objects.Shape;
public final class Sorting {
     // bubble sort
	public static <T> void bubbleSort(Comparable<T> [] array, Comparator<? super T> compare)
	{
		boolean sorted = false;
		Comparable<T> temp;
		while(!sorted)
		{
			sorted = true;
			for ( int i = 0; i < array.length - 1 ; i++)
			{
				if( compare.compare( (T) array[i], (T) array[i+1] ) > 0)// array[0] > array[1];
				{
					temp = array[i];
					array[i] = array[i + 1];
					array[i + 1]= temp;
					sorted = false;
					
					
				}
			}
		}
	}
	

	}
	
	// merge sort 
	
	
  
	
	
	
	
	
	
	
	
	
	
	

	  
  
      
	
	
	
	
	
	
	
	
	
	
	
	
	// merge sort 

