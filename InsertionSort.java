package ThreeAlgorithm;

public class InsertionSort {
	 public static void insertionSort(int[] arr) 
	    { 
	        int n = arr.length; 
	        for (int i=1; i<n; ++i) 
	        { 
	            int key = arr[i]; 
	            int j = i-1; 

	            /* Move elements of arr[0..i-1], that are 
	               greater than key, to one position ahead 
	               of their current position */
	            while (j>=0 && arr[j] > key) 
	            { 
	                arr[j+1] = arr[j]; 
	                j = j-1; 
	            } 
	            arr[j+1] = key; 
	        } 
	    } 

	    /* A utility function to print array of size n*/

	    // Driver method 
	    public static void main(String args[]) 
	    {        
	    	   long startTime = System.nanoTime();
	    	int arr[] ={3,6,4,7,1,8,2,5};  
	    	 System.out.println("Before Insertion Sort");  
	        for(int i=0; i < arr.length; i++){  
	                System.out.print(arr[i] + " ");  
	        }  

	        System.out.println(); 

	    	insertionSort(arr); 
	    	System.out.println("After Insertion Sort");
	      int n = arr.length; 
	        for (int i=0; i<n; ++i) {
	            System.out.print(arr[i] + " "); 
	        }
	        System.out.println();
		  long endTime = System.nanoTime();
		  System.out.println("Took "+(endTime - startTime) + " Time");

	    } 
	} 
