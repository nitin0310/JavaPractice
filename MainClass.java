package hashTable;
import java.util.*;

public class MainClass {
	public static void main(String args[]) {
		
		Hashtable<Integer,String> hashTable=new Hashtable<Integer,String>();
		
		System.out.println(hashTable);
		hashTable.put(84, "Ashwani kumar");
		hashTable.put(85, "Shubham bharadwaj");
		hashTable.put(87, "Nitin yadav");
		
		System.out.println(hashTable);
		
		hashTable.put(87, "Pratik");
		System.out.println(hashTable);
		
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(9001, "Anirudh kumar dey");
		map.put(9002, "Pratik patanayak");
		
		System.out.println(map);
		
		hashTable.putAll(map);
		hashTable.replace(87, "Pratik", "Nitin Yadav");
		System.out.println(hashTable);
		
	}
}
