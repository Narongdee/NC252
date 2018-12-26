package ThreeAlgorithm;

public class SelectionSort {
	/**
	 * Swaps the elements at indexes i and j 
	 */
	public static void swapElements(int[] array,int i,int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;

	}
	/**
	 * Finds the index of the lowest value
	 * starting from the index at start (inclusive)
	 * and going to the end of the array.
	 */
	public static int indexLowest(int[] array, int start) {
		int lowIndex = start;
		for (int i = start; i < array.length; i++) {
			if (array[i] < array[lowIndex]) {
				lowIndex = i;
			}
		}
		return lowIndex;
	}
	/**
	 *  Sorts the elements (in place) using selection sort.
	 */
	public static void selectionSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int j = indexLowest(array,i);
			swapElements(array, i, j);

		}
	}
	public static void main(String[] args) {
		 long startTime = System.nanoTime();
	    int arr[] ={3,6,4,7,1,8,2,5};  

	    System.out.println("Before Selection Sort");  
	    for(int i=0; i < arr.length; i++){  
	            System.out.print(arr[i] + " ");  
	    }  
	    System.out.println();  

	    selectionSort(arr);//sorting array elements using bubble sort  

	    System.out.println("After Selection Sort");  
	    for(int i=0; i < arr.length; i++){  
	            System.out.print(arr[i] + " ");  
	    } 
	    System.out.println();

	  //code
	  long endTime = System.nanoTime();
	  System.out.println("Took "+(endTime - startTime) + " Time"); 
	}
}
