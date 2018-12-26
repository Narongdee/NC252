package th.ac.utcc.eng.cpe.nc252.linkedlist;

public class DataItem {
	public String	Name; 	// data item: name as String
	public int 	Number; 			// data item: Number or ID
	public DataItem next; 			// next DataItem in list
	public int M = 4;
	// Constructor
	public DataItem(String subjectName)
	{
		this.Name = subjectName; // initialize data
		
		
		// 'next' is automatically
		// set to null
	} 
	
	// Override: toString method
	public String toString() {
		return ("{" + this.Name + ", " + this.Number + "} ");
	}
}

