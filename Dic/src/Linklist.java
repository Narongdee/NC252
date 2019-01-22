import java.util.Scanner;

public class Linklist {
	private vocabulary HashTable[];
	private static final int arraySize = 1200;

	// ---------------------------------------------

	public Linklist() {
		HashTable = new vocabulary[arraySize];
	}

	// -----------------------------------------------
	public void insertWord(String key, String value, String type) {
		vocabulary newVocab = new vocabulary(key, value, type);
		newVocab.next = HashTable[HashFunc(key)];
		HashTable[HashFunc(key)] = newVocab;
		System.out.println(key + " " +value + "(" + type + ")");
	}

	// ------------------------------------------------
	public String find(String key) {
		if (HashTable[HashFunc(key)] == null) {
			return "Word not found!";
		} else {
			vocabulary current = HashTable[HashFunc(key)];
			while (!current.key.equals(key)) { //equal ---> !current.key != key ---- > true
					current = current.next;
			}
			return current.key + " : [" + current.type + ".] " + current.value;
		}

	}

	// -----------------------------------------------

	public void editValue(String key, String value) {
		vocabulary current = HashTable[HashFunc(key)];
		while (current.key != key) {
			if (current.next == null)
				break;
			else
				current = current.next;
		}
		System.out.println("Edit : " + key +" | Value \""+current.value+"\" to \""+value+"\"");
		current.value = value;
		
	}
	//-------------------------------------------------
	public void editType(String key, String type) {
		vocabulary current = HashTable[HashFunc(key)];
		while (current.key != key) {
			if (current.next == null)
				break;
			else
				current = current.next;
		}
		System.out.println("Edit : " + key +" | Type \""+current.type+"\" to \""+type+"\"");
		current.type = type;
		
	}
	//-------------------------------------------------
	public void editWord(String key,String editKey) {
		vocabulary current = HashTable[HashFunc(key)];
		vocabulary prev = current;
		insertWord(editKey, current.value, current.type);
		System.out.println("Edit : \"" + key +"\" to "+ editKey);
	}


	// ------------------------------------------------
	public void delete(String key) {
		vocabulary current = HashTable[HashFunc(key)];
		vocabulary previous = HashTable[HashFunc(key)];
		while (current.key != key) { 
			if (current.next == null)
				break;
			else {
				
				current = current.next;
			}
		}
		if (current == HashTable[HashFunc(key)]) {
			HashTable[HashFunc(key)] = HashTable[HashFunc(key)].next;
		} else {
			previous.next = current.next;
		}
		System.out.println("Delete : " + key);

	}

	// ---------------------------------------------------
	public int HashFunc(String key) {
		int hashVal = 0;
		for (int j = 0; j < key.length(); j++) { // left to right
			int letter = key.charAt(j); // get char code
			hashVal = (hashVal * 32 + letter) % arraySize; // mod
		}
		return hashVal;
	}
	
	
	// -------------------------------------------------
	public void Menu() {
		Scanner Input = new Scanner(System.in);
		System.out.println("===============|| Main Menu ||===============");
		System.out.println("1. Search (Write the first big vocabulary)");
		System.out.println("2. Add word");
		System.out.println("3. Exit Program");
		System.out.println("============================");
		System.out.print("Enter choice : ");
		// choice code//
		int choice = Input.nextInt();
		switch (choice) {

		case 1:
			System.out.print("Enter word : ");
			String Search = Input.next();
			String Word = find(Search);
			System.out.println("Word Found : "+ Word);
			subMenu(Search);
			break;

		case 2:
			System.out.print("Add word : ");
			String Addword = Input.next();
			System.out.print("Add meaning : ");
			String Addmeaning = Input.next();
			System.out.print("Add type : ");
			String Addtype = Input.next();
			insertWord(Addword, Addmeaning, Addtype);
			System.out.println("Word Added !");
			Menu();
			break;
		case 3:
			System.out.print(" --------------End Program-------------- ");
			break;

		default:
			System.out.println("Enter number 1/2/3 only!");
			Menu();
		}
	}
	
	public void subMenu(String key) {
		Scanner Input = new Scanner(System.in);
		System.out.println("===============|| Sub Menu ||===============");
		System.out.println("1. Search more Word");
		System.out.println("2. Edit Word");
		System.out.println("3. Edit Type");
		System.out.println("4. Edit Meaning");
		System.out.println("5. Delete Word");
		System.out.println("6. Exit to Main Menu");
		System.out.println("====================================");
		System.out.print("Enter choice : ");
		// choice code//
		int choice = Input.nextInt();
		switch (choice) {
		case 1:
			System.out.print("Enter word : ");
			String Search = Input.next();
			System.out.println("Word Found : " + find(Search));
			subMenu(Search);
			break;
		case 2:
			System.out.println("Enter new Word :");
			String newWord = Input.next();
			editWord(key, newWord);
			Menu();
			break;
		case 3:
			System.out.println("Enter new Type :");
			String newType = Input.next();
			editType(key, newType);
			Menu();
			break;
		case 4:
			System.out.println("Fix Meaning : ");
			String newMean = Input.next();
			editValue(key, newMean);
			Menu();
			break;
		case 5:
			System.out.println("Enter Word to delete :");
			String newDelete = Input.next();
			delete(newDelete);
			Menu();
			break;
		case 6:
			Menu();
			break;
		default:
			System.out.println("No choice Match");
			Menu();
		}
	}

	// public void displayList() {
	// System.out.println("List A to Z");
	// Vocab current = first;
	// while(current != null) {
	// current.displayVocab();
	// current =current.next;
	// }
	//
	// }

}
