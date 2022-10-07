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
	
	public static <T> void insertionSort(Comparable<T> [] array) {

		for (int i = 1; i < array.length; i++) {
			Comparable<T> key = array[i]; //at second index as i (step)= 1 [1]([2])[3]
			int j = i - 1; //at first index [0]            ([1])[2][3]
			while (j >= 0 && key.compareTo((T) array[j]) > 0) { //j is 0 and key(1) is greater than 0
			// For ascending order, change key> arr[j] to key< arr[j].
				array[j + 1] = array[j];
			--j;
			}
			array[j + 1] = key;
			}
	}
	

	}
