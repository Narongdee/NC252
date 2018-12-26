package ThreeAlgorithm;

public class BubbleSort {
	/**
	 * Swaps the elements at indexes i and j using bubbleSort
	 */

	public static void bubbleSort(int[] array) {
		int n = array.length;
		int temp = 0;
		for (int i = 0 ; i < n; i++) {
			for (int j = 1; j < (n-i); j++) {
				if(array[j-1] > array[j]) {
					temp = array[j-1];
					array[j-1] = array[j];
					array[j] = temp;


				}

			}

		}

	}


public static void main(String[] args) {  
	long startTime = System.nanoTime();
    int arr[] ={3,6,4,7,1,8,2,5};  

    System.out.println("Before Bubble Sort");  
    for(int i=0; i < arr.length; i++){  
            System.out.print(arr[i] + " ");  
    }  
    System.out.println();  

    bubbleSort(arr);//sorting array elements using bubble sort  

    System.out.println("After Bubble Sort");  
    for(int i=0; i < arr.length; i++){  
            System.out.print(arr[i] + " ");  
    } 
    System.out.println();

  //code
  long endTime = System.nanoTime();
  System.out.println("Took "+(endTime - startTime) + " Time");

}  
}  
