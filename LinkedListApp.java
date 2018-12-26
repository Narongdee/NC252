package th.ac.utcc.eng.cpe.nc252.linkedlist;

public class LinkedListApp {

	public LinkedListApp() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		LinkedList l = new LinkedList();
		
		DataItem N1 = new DataItem("Number 6"); // iD 6
		DataItem N2 = new DataItem("Number 5");
		DataItem N3 = new DataItem("Number 4");
		DataItem N4 = new DataItem("Number 3");
		DataItem N5 = new DataItem("Number 2");
		DataItem N6 = new DataItem("Number 1");
		DataItem N7 = new DataItem("Number 0");
		
		l.insertFirst(N1);
		l.insertFirst(N2);
		l.insertFirst(N3);
		l.insertFirst(N4);
		l.insertFirst(N5);
		l.insertFirst(N6);
		l.insertFirst(N7);
		
		l.displayList();
		
		
		l.deleteFirst();
		l.setID();
		System.out.println("\nDelete Number #1");
		l.displayList();
		
		l.deleteFirst();
		l.setID();
		System.out.println("\nDelete Number #2");
		l.displayList();
		
		l.deleteFirst();
		l.setID();
		System.out.println("\nDelete Number #3");
		l.displayList();
		
		l.deleteFirst();
		l.setID();
		System.out.println("\nDelete Number #4");
		l.displayList();
		
		l.deleteFirst(2);
		l.setID();
		System.out.println("\nDelete Number #5");
		l.displayList();
		
		l.deleteFirst(1);
		l.setID();
		System.out.println("\nDelete Number #5");
		l.displayList();
		
		/*
		LinkedList linkedList = new LinkedList();
		
		
		
		DataItem item1 = new DataItem("Calculus I", 4.0);
		DataItem item2 = new DataItem("Physics I", 3.5);
		DataItem item3 = new DataItem("English", 3.0);
		DataItem item4 = new DataItem("Thai", 2.5);
		
		linkedList.insertFirst(item1);
		linkedList.insertFirst(item2);
		linkedList.insertFirst(item3);
		linkedList.insertFirst(item4);

		linkedList.displayList();
		
		linkedList.deleteFirst();
		System.out.println("\nAfter deleteFirst()#1");
		linkedList.displayList();
		
		linkedList.deleteFirst();
		System.out.println("\nAfter deleteFirst()#2");
		linkedList.displayList();*/
	}

}
