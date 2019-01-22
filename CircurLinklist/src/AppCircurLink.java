import java.util.*;
public class AppCircurLink {
		public static void main (String args[]) {
			Scanner input = new Scanner(System.in);
			System.out.print("Enter the node : ");
			int node = input.nextInt();
			System.out.println("Enter amount of movement : ");
			int move = input.nextInt();
			
			CircurLink setnumber = new CircurLink();
			for(int i = 1 ;i<=node;i++) {
				setnumber.insertFirst(i);	
			}
	
			setnumber.displayList();
			    iData current = setnumber.first;
		      while(setnumber.first !=setnumber.last) {
				for(int j=1;j<move;j++) {
					current = current.next;
				}
				setnumber.delete(current.num);
				current = current.next;
				setnumber.displayList();
			}
		        
		
			
		}

}
