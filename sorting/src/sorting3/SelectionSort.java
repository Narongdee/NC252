package sorting3;

public class SelectionSort {
	private int [] element;
	private int eSize;
	
	public SelectionSort(int size) {
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
		int out, in, min;
		
		for(out = 0; out < eSize-1; out++) {
			min = out;
			for(in = out+1; in < eSize; in++) {
				if(this.element[in] < this.element[min]) {
					min = in;
				}
			}
			this.swap(out, min);
		}
	}
	
	private void swap(int left, int right) {
		int temp = this.element[left];
		this.element[left] = this.element[right];
		this.element[right] = temp;
	}
	
	public static void main(String[] args) {
		// 
		int max = 2000;
		SelectionSort selection = new SelectionSort(max);
		
		for(int i = 0; i<max;i++) {
			selection.insert((int)(Math.random()*100));
		}
		/*
		selection.insert(87);
		selection.insert(43);
		selection.insert(95);
		selection.insert(32);
		selection.insert(91);
		selection.insert(78);
		selection.insert(26);
		selection.insert(12);
*/
		// show original order
		System.out.print("Original Order: ");
		selection.show();
		
		// sort and then show the result
		selection.sort();
		System.out.print("  Sorted Order: ");
		selection.show();
	}
}