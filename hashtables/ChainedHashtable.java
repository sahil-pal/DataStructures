package DataStrucutures;

import java.util.LinkedList;
import java.util.ListIterator;

public class ChainedHashtable {

	private LinkedList<StoredEmployee>[] hashtable;
	private int size;
	
	public ChainedHashtable() {
		hashtable = new LinkedList[10];
		for(int i = 0; i < hashtable.length;i++) {
			hashtable[i] = new LinkedList<StoredEmployee>();
		}
	}
	
	public void put(String key,Employee value) {
		int hashedkey = Hashkey(key);
		System.out.println("added Hashedkey : "+hashedkey+" --> "+value);
		hashtable[hashedkey].add(new StoredEmployee(key,value));
		size++;
	}
	
	public Employee get(String key) {
		int hashedkey = Hashkey(key);
		ListIterator<StoredEmployee> itr = hashtable[hashedkey].listIterator();
		StoredEmployee emp = null;
		while(itr.hasNext()) {
			emp = itr.next();
			if(emp.getKey().equals(key)) {
				break;
			}
		}
		if(emp == null) {
			System.out.println("No value exists with this key");
			return emp.getEmployee();
		}
		else {
			return emp.getEmployee();
		}
		
	}
	
	public void remove(String key) {
		int hashedkey = Hashkey(key);
		ListIterator<StoredEmployee> itr = hashtable[hashedkey].listIterator();
		StoredEmployee emp = null;
		while(itr.hasNext()) {
			emp = itr.next();
			if(emp.getKey().equals(key)) {
				break;
			}
		}
		if(emp == null || !emp.getKey().equals(key)) {
			System.out.println("No value exists with this key!");
		}
		else {
			System.out.println("Removing --> "+emp.getKey());
			hashtable[hashedkey].remove(emp);
			size--;
		}
	}
	
	private int Hashkey(String Simplekey) {
		return Simplekey.length()%hashtable.length;
	}
	
	public void printHashtable() {
		for(int i = 0; i < hashtable.length;i++) {
			System.out.println("itr --> "+i);
			if(hashtable[i] != null) {
			ListIterator<StoredEmployee> itr = hashtable[i].listIterator();
				while(itr.hasNext()) {
					StoredEmployee emp = itr.next();
					System.out.println(emp.getKey()+" --> "+emp.getEmployee());
				}
			}
		}
	}
	
	public int getSize() {
		return size;
	}
	

}
