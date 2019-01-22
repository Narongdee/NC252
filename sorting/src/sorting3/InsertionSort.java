package sorting3;

public class InsertionSort {
	private int [] element;
	private int eSize;
	
	public InsertionSort(int size) {
		if(size > 0)
			this.element = new int[size];
		else
			// default element.length == 10
			this.element = new int[10];
		
		eSize = 0;
	}
	
	public void insert(int e) {
		this.element[eSize] = e;
		eSize++;
	}
	
	public void show() {
		for(int i=0; i < eSize; i++) {
			System.out.print(this.element[i] + " ");
		}
		
		System.out.println("");
	}
	
	public void sort() {
		int out, in, temp;
		
		for(out = 1; out < eSize; out++) {
			temp = this.element[out];
			for(in = out; in > 0 && this.element[in-1] >= temp; in--) {
				this.element[in] = this.element[in - 1];
			}
			this.element[in] = temp;
		}
	}
	
/*	private void swap(int left, int right) {
		int temp = this.element[left];
		this.element[left] = this.element[right];
		this.element[right] = temp;
	}*/
	
	public static void main(String[] args) {
		// 
		int max = 2000;
		InsertionSort insertionSort = new InsertionSort(max);
		
		for(int i = 0; i<max;i++) {
			insertionSort.insert((int)(Math.random()*100));
		}
		/*
		insertionSort.insert(87);
		insertionSort.insert(43);
		insertionSort.insert(95);
		insertionSort.insert(32);
		insertionSort.insert(91);
		insertionSort.insert(78);
		insertionSort.insert(26);
		insertionSort.insert(12);
		 */
		// show original order
		System.out.print("Original Order: ");
		insertionSort.show();
		
		// sort and then show the result
		insertionSort.sort();
		System.out.print("  Sorted Order: ");
		insertionSort.show();
	}
}