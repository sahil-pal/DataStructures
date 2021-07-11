package DataStrucutures;

public class DriverHashtable {

	public static void main(String args[]) {
		
		Employee e1 = new Employee("sahil",7);
		Employee e2 = new Employee("rahul",19);
		Employee e3 = new Employee("amit",1);
		Employee e4 = new Employee("sameer",2);
		
		// code to run the simple Hash table
		
//		SimpleHashTable hashtable = new SimpleHashTable();
//		hashtable.put("pal",e1);
//		hashtable.put("rao",e2);
//		hashtable.put("sharma",e3);
//		hashtable.put("nara",e4);
//		System.out.println("size --> "+hashtable.getSize());
//		hashtable.printHashTable();
//		System.out.println("Retrieving --> "+hashtable.get("pal"));
		
		// code to run the Linear probed hashed table
		
//		LinearProbedHashtable hashtable = new LinearProbedHashtable();
//		hashtable.put("pal",e1);
//		hashtable.put("rao",e2);
//		hashtable.put("sharma",e3);
//		hashtable.put("nar",e4);
//		hashtable.put("abc", e1);
//		hashtable.put("abcdefghi", e2);
//		System.out.println("size --> "+hashtable.getSize());
//		hashtable.printHashTable();
//		hashtable.remove("pal");
//		System.out.println("size --> "+hashtable.getSize());
//		System.out.println();
//		hashtable.printHashTable();
//		System.out.println("Retrieving --> "+hashtable.get("nar"));
		
		// code to run the Chained hashed table
		
		ChainedHashtable hashtable = new ChainedHashtable();
		hashtable.put("pal",e1);
		hashtable.put("rao",e2);
		System.out.println("Retrieving --> "+hashtable.get("pal"));
		hashtable.put("sharma",e3);
		hashtable.put("nar",e4);
		hashtable.put("abc", e1);
		System.out.println("size --> "+hashtable.getSize());
		hashtable.printHashtable();
		System.out.println();
		hashtable.remove("nar");
		System.out.println("size --> "+hashtable.getSize());
		hashtable.printHashtable();
		
		
	}
}
