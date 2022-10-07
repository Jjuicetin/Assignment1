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
	

	
	public static <T> void insertionSort(Comparable<T> [] array, Comparator<? super T> compare) {

		int size = array.length;
		for (int i = 1; i < size; i++) {
		Comparable<T> key = array[i];
		int j = i - 1; //0
		while (j >= 0 && compare.compare( (T) array[i], (T) array[j] ) > 0) {
		
			array[j + 1] = array[j];
		--j;
		}
		array[j + 1] = key;
		}
		}
	
	

	}
	
	
  
	
	
	
	
	
	
	
	
	
	
	

	  
  
      
	
	
	
	
	
	
	
	
	
	
	
	
	// merge sort 

