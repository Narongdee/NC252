public class SubjectRecordArray {
	private int nElems;
	private SubjectRecord [] a;
	
	
	public SubjectRecordArray(int max) {
		nElems = 0;
		a = new SubjectRecord[max];
	}
	
	public void insert(SubjectRecord value) {
		a[nElems] = value;
		nElems++;
	}
	
	public boolean find(String searchKey) { // find specified value
		int j;
		for (j = 0; j < nElems; j++)
			// for each element,
			if (a[j].getCode().equalsIgnoreCase(searchKey)) 	// found item?
				break; 				// exit loop before end
		if (j == nElems) 			// gone to end?
			return false; 			// yes, can't find it
		else
			return true; 			// no, found it
	} // end find()
	
	public boolean delete(String value) {
		int j;
		for (j = 0; j < nElems; j++)
			// look for it
			if (value.equalsIgnoreCase(a[j].getCode()))
				break;
		if (j == nElems) 			// can't find it
			return false;
		else 						// found it
		{
			for (int k = j; k < nElems; k++)
				// move higher ones down
				a[k] = a[k + 1];
			nElems--; 				// decrement size
			return true;
		}
	} // end delete()
	
	public void display() {
		for(int i=0; i < nElems; i++) {
			System.out.println(a[i].getCode() + " " +
		        a[i].getName() + " " + a[i].getUnit() + " " +
					a[i].getGrade());
		}
	}
}