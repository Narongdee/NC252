public class iData {
	public int num;
public iData next,prev;
	
	public  iData (int num) {
		this.num = num ;
		
	}
	
	public void displayLink() {
		System.out.println("Number : "+this.num );
	}
}