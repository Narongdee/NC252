public class vocabulary {
	public String key,value;
	public String type;
	public vocabulary next;
	public vocabulary prev;
	vocabulary() {
		
	}
	public vocabulary(String key,String value,String type) {
		this.key = key;
		this.value = value;
		this.type = type;
	}
	public void displayVocab() {
		System.out.println(key + "(" + type + ")" + value);
	}
	//public String toString() {
		//return (key + "(" + type + ")" + value);
	}
//}