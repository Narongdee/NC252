
public class CircurLink {
    public iData first,last;
	
	public CircurLink()
	{
		this.first = null;
}
	public void insertFirst(int num) {
		iData newLink = new iData(num);
		newLink.next = this.first;
	    //this.last.next = newLink;
		
		if(newLink.next == null)
	    	 {
	    	 this.last = newLink;
	    	 }
		else first.prev = newLink ;
		
		this.first = newLink;
		last.next =this.first;
	}
	
	public void delete(int key) {
		
		iData current  = this.first;
		iData previous  = this.first;
		while(current.num != key ) {
			if(current.next == null ) System.out.println("null");
			else {
				previous = current;  
				current = current.next;
			}
		}
		if(current == this.first) {
			System.out.println("Just Delete number:"+current.num);
			this.first = current.next;
			last.next = first;
			first.prev = null;
			
		}
		else if (current== this.last) {
			System.out.println("Just Delete number:"+current.num);
			this.last = last.prev;
			this.last.next = this.first;
			
			
		}
		else  {
			System.out.println("Just Delete number:"+current.num);
			current.prev.next = current.next;
			current.next.prev = current.prev;
			}
		
	}
	
	public void displayList() {
		System.out.println("List (first-->last):");
		iData current = this.first;
		while(current != this.last) {
			current.displayLink();
			current = current.next;
		}
		current.displayLink();
		current = current.next; //ทำอีกครั้ง
}
}