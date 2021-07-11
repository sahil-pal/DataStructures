package DataStrucutures;

public class LinearProbedHashtable {

	private StoredEmployee[] hashtable;
	private int size;
	
	public LinearProbedHashtable() {
		hashtable = new StoredEmployee[10];
	}
	
	
	public void put(String key,Employee value) {
		int hashedkey = Hashkey(key);
		
		if(!isAvailable(hashedkey)) {
			int stopindex = hashedkey;
			if(hashedkey == hashtable.length - 1) {
				hashedkey = 0;
			}
			else {
				hashedkey++;
			}
			while(!isAvailable(hashedkey) && hashedkey != stopindex) {
				hashedkey = (hashedkey+1)%hashtable.length;
			}
		}
		if(!isAvailable(hashedkey)) {
			System.out.println("Sorry, hashtable seems to be full.");
		}
		else {
			hashtable[hashedkey] = new StoredEmployee(key,value);
			System.out.println("Stored "+key+" using hashedkey = "+hashedkey);
			size++;
		}
	}
	
	private boolean isAvailable(int position) {
		return hashtable[position] == null;
	}
	
	public Employee get(String key) {
		int hashedkey = Hashkey(key);
		int newhashedkey;
		Employee emp = null;
		if(!hashtable[hashedkey].getKey().equals(key)) {
			newhashedkey = (findkey(hashedkey,key));
			if(hashedkey == newhashedkey) {
				System.out.println("value not found");
			}
			else {
				emp = (hashtable[newhashedkey].getEmployee());
			}
		}
		else {
			emp = (hashtable[hashedkey].getEmployee());
		}
		return emp;
		
	}
	
	public void remove(String key) {
		int hashedkey = Hashkey(key);
		int newhashedkey;
		if(!hashtable[hashedkey].getKey().equals(key)) {
			newhashedkey = (findkey(hashedkey,key));
			if(hashedkey == newhashedkey) {
				System.out.println("Value with entered key not found !");
			}
			else {
				System.out.println("Removing value : "+hashtable[newhashedkey].getEmployee());
				hashtable[newhashedkey] = null;
			}
		}
		else {
			System.out.println("Removing value : "+hashtable[hashedkey].getEmployee());
			hashtable[hashedkey] = null;
			
		}
		size--;
		rehashing();
	}
	
	public void printHashTable() {
		for(int i =0; i < hashtable.length; i++) {
			if(hashtable[i] == null) {
				System.out.println("null");
			}
			else {
				System.out.println("key : "+hashtable[i].getKey()+" AND  value : "+hashtable[i].getEmployee());
			}
		}
	}
	
	public void rehashing() {
		StoredEmployee[] oldhashtable = hashtable;
		hashtable = new StoredEmployee[oldhashtable.length];
		size=0;
		for(int i =0; i < oldhashtable.length; i++) {
			if(oldhashtable[i] != null) {
				put(oldhashtable[i].getKey(),oldhashtable[i].getEmployee());
			}
		}
		
	}
	
	
	public int findkey(int hashedkey, String key) {
		int stopindex = hashedkey;
		if(hashedkey == hashtable.length-1) {
			hashedkey = 0;
		}
		else {
			hashedkey++;
		}
		while(hashtable[hashedkey].getKey().isEmpty() && !hashtable[hashedkey].getKey().equals(key) && hashedkey != stopindex)
		{
			System.out.println("checking");
			hashedkey = (hashedkey+1)%hashtable.length;
		}
		if(!hashtable[hashedkey].getKey().equals(key)) {
			hashedkey = stopindex;
		}
		
		return hashedkey;
	}
	
	private int Hashkey(String Simplekey) {
		return Simplekey.length()%hashtable.length;
	}
	
	public int getSize() {
		return size;
	}
	
}
