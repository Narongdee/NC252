public class Node {
	public int ID;
	public String name,grade;
	
	Node left;
	Node right;
	
	public Node() {}
	public String toString() {
		return "ID :"+ID+"\nName : "+name+"\nGrade : "+grade;
	}
	public void display() {
		System.out.println("ID :"+ID+"\nName : "+name+"\nGrade : "+grade);
	}
	
}
