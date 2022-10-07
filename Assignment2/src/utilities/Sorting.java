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
				if( compare.compare( (T) array[i], (T) array[i+1] ) < 0)// array[0] > array[1];
				{
					temp = array[i];
					array[i] = array[i + 1];
					array[i + 1]= temp;
					sorted = false;
					
					
				}
			}
		}
	}
	
	// bubble sort based on height
	public static <T> void bubbleSortHeight(Comparable<T>[] array)
	{
		boolean sorted = false;
		Comparable<T> temp;
		while(!sorted)
		{
			sorted = true;
			for ( int i = 0; i < array.length - 1 ; i++)
			{
				if(  array[i].compareTo((T) array[i + 1]) < 0) 
				{
					temp = array[i];
					array[i + 1]= temp;
					sorted = false;
					
					
				}
			}
		}
	}
	/*
	 * Method to sort shapeArray in insertion sort algorithm.
	 * This version of insertionSort() can sort the shape array with height.
	 * @param <T> array
	 * 
	 */
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
	/*
	 * Method to sort shapeArray in insertion sort algorithm.
	 * This version of insertionSort() can sort the shape array with area or volume.
	 * @param <T> array
	 * @param compare class
	 */
	public static <T> void bavinsertionSort(Comparable<T> [] array, Comparator<? super T> compare) {

		for (int i = 1; i < array.length; i++) {
			Comparable<T> key = array[i]; //at second index as i (step)= 1 [1]([2])[3]
			int j = i - 1; //at first index [0]            ([1])[2][3]
			while (j >= 0 && compare.compare((T) key, (T)array[j]) > 0) { //j is 0 and key(1) is greater than 0
		
				array[j + 1] = array[j];
			--j;
			}
			array[j + 1] = key;
			}
	}
	
	
	// merge sort to compare height
	
	
	 
	 public static Comparable[] mergeSortHeight(Comparable[] list) 
	  {
	    //If list is empty; no need to do anything
	        if (list.length <= 1) {
	            return list;
	        }
	         
	        //Split the array in half in two parts
	        Comparable[] first = new Comparable[list.length / 2];
	        Comparable[] second = new Comparable[list.length - first.length];
	        System.arraycopy(list, 0, first, 0, first.length);
	        System.arraycopy(list, first.length, second, 0, second.length);
	         
	        //Sort each half recursively
	        mergeSortHeight(first);
	        mergeSortHeight(second);
	         
	        //Merge both halves together, overwriting to original array
	        merge(first, second, list);
	        return list;
	    }
	     
	  @SuppressWarnings({ "rawtypes", "unchecked" }) 
	    private static void merge(Comparable[] first, Comparable[] second, Comparable[] result) 
	  {
	        //Index Position in first array - starting with first element
	        int iFirst = 0;
	         
	        //Index Position in second array - starting with first element
	        int iSecond = 0;
	         
	        //Index Position in merged array - starting with first position
	        int iMerged = 0;
	         
	        //Compare elements at iFirst and iSecond, 
	        //and move smaller element at iMerged
	        while (iFirst < first.length && iSecond < second.length) 
	        {
	            if (first[iFirst].compareTo(second[iSecond]) < 0) 
	            {
	                result[iMerged] = second[iSecond];
	                iSecond++;
	            } 
	            else
	            {
	                result[iMerged] = first[iFirst];
	                iFirst++;
	            }
	            iMerged++;
	        }
	        //copy remaining elements from both halves - each half will have already sorted elements
	        System.arraycopy(first, iFirst, result, iMerged, first.length - iFirst);
	        System.arraycopy(second, iSecond, result, iMerged, second.length - iSecond);
	    }
	  
	  
	  
	  
	  @SuppressWarnings("unchecked")
	public static <T> Comparable[] mergeSort(Comparable<T>[] list, Comparator< T> comparee) 
	  {
	    //If list is empty; no need to do anything
	        if (list.length <= 1) {
	            return list;
	        }
	         
	        //Split the array in half in two parts
	        Comparable[] first = new Comparable[list.length / 2];
	        Comparable[] second = new Comparable[list.length - first.length];
	        System.arraycopy(list, 0, first, 0, first.length);
	        System.arraycopy(list, first.length, second, 0, second.length);
	         
	        //Sort each half recursively
	        mergeSort(first, comparee);
	        mergeSort(second, comparee);
	         
	        //Merge both halves together, overwriting to original array
	        merge2(first, second, list, comparee);
	        return list;
	    }

	  
	

	@SuppressWarnings({ "rawtypes", "unchecked" }) 
	    private static <T> void  merge2(Comparable [] first, Comparable [] second, Comparable [] result, Comparator< T> compare) 
	  {
	        //Index Position in first array - starting with first element
	        int iFirst = 0;
	   
	         
	        //Index Position in second array - starting with first element
	        int iSecond = 0;
	         
	        //Index Position in merged array - starting with first position
	        int iMerged = 0;
	         
	        //Compare elements at iFirst and iSecond, 
	        //and move smaller element at iMerged
	       
	      do {
	        
	            if ( compare.compare(  (T) first[iFirst],  (T) second[iSecond]) < 0) // compare.compare( (T) array[i], (T) array[i+1] ) < 0
	            {
	                result[iMerged] = second[iSecond];
	                iSecond++;
	            } 
	            else
	            {
	                result[iMerged] = first[iFirst];
	                iFirst++;
	            }
	            iMerged++;
	      } while (iFirst < first.length && iSecond < second.length);
	        
	        //copy remaining elements from both halves - each half will have already sorted elements
	        System.arraycopy(first, iFirst, result, iMerged, first.length - iFirst);
	        System.arraycopy(second, iSecond, result, iMerged, second.length - iSecond);
	    }
	

  
   
   
   
   public static void selectionSortHeight(Comparable[] a) { 
	   
	    int N = a.length;
	   
	    for (int i = 0; i < N; i++) { 
	 
	        int maxIndex = i;
	        for (int j = i + 1; j < N; j++)
	        if ( a[j].compareTo(a[maxIndex]) > 0 )
	             maxIndex = j;
	 
	        if (maxIndex != i) {
	            Comparable temp = a[i];
	            a[i] = a[maxIndex];
	            a[maxIndex] = temp;
	        }
	    }
}
   public static <T> void selectionSort(Comparable[] a , Comparator<T> comparee) { 
	   
	    int N = a.length;
	    
	    for (int i = 0; i < N; i++) { 
	    	 int maxIndex = i;
	        
	        for (int j = i + 1; j < N; j++)
	        if ( comparee.compare(  (T) a[j],  (T) a[maxIndex]) > 0 )
	             maxIndex = j;
	 
	        if (maxIndex != i) {
	            Comparable temp = a[i];
	            a[i] = a[maxIndex];
	            a[maxIndex] = temp;
	        }
	    }
}
   
}

