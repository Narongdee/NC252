
package linkedlist;

public class DataItem {
	public String Name;                                    // data item: name as String
	public DataItem next;                            // next DataItem in list
	public DataItem previous;                                    // previous dataItem in list

	public DataItem(String subjectName) {
		this.Name = subjectName; // initialize data
	}

	// Override: toString method
	public String toString() {
		return ("{" + this.Name + "}");
	}
}