package linkedlist;

public class LinkedList {
	private DataItem first, last;
	private int sum = 0;

	public LinkedList() {
		first = null;
		last = null;
	}

	public boolean isEmpty() {
		return (first == null);
	}

	public void insertFirst(DataItem newDataItem) {
		if (first == null) {
			newDataItem.next = last;
			last = newDataItem;
			first = newDataItem;
			sum++;

		} else {
			newDataItem.next = first;
			first = newDataItem;
			last.next = first;
			sum++;
		}
	}

	public void deleteFirst(int key) {
		DataItem current = first;
		DataItem pre = first;
		for (int j = 0; j < sum - 1; j++) {
			for (int i = 0; i < key; i++) {
				pre = current;
				current = current.next;
			}
			System.out.println("\nDalete Node : " + current);

			if (current == last) {
				last = current.previous;
			} else if (current == first) {
				first = first.next;
			}
			pre.next = current.next;
			current.next.previous = current.previous;
			current = current.next;

			displayList();

		}

		System.out.println("\nLast Node : " + current);
		//return current;
	}

	public void displayList() {
		System.out.println("List:");
		DataItem current = first;
		while (current != null) {
			System.out.println(current);
			current = current.next;
			if (first == current) {
				// System.out.println(current);
				break;
			}

		}
	}

}