package DataStrucutures;

public class SimpleHashTable {

	private Employee[] hashtable;
	private int size;
	
	public SimpleHashTable() {
		hashtable = new Employee[10];
	}
	
	private int Hashkey(String Simplekey) {
		
		return Simplekey.length()%hashtable.length;
	}
	
	public void put(String key,Employee value) {
		int hashedkey = Hashkey(key);
		if(hashtable[hashedkey] != null) {
			System.out.println("Sorry, This algo do not deal with collision.");
		}
		else {
			hashtable[hashedkey] = value;
			size++;
		}
	}
	
	public Employee get(String key) {
		int hashedkey = Hashkey(key);
		Employee emp = hashtable[hashedkey];
		return emp;
	}
	
	public float getloadFactor() {
		return (size/hashtable.length);
	}
	
	public void printHashTable() {
		for(int i =0; i < hashtable.length; i++) {
			System.out.println(hashtable[i]);
		}
	}
	
	public int getSize() {
		return size;
	}
	
	
}
