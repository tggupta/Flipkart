package Listeners;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class learnHashMap {

	public static void main(String[] args) {
		HashMap<String,Integer> phonebook=new HashMap<String,Integer>();
		phonebook.put("Tarun", 123456);
		phonebook.put("Shivani", 223456);
		phonebook.put("Zxxxxx", 323456);
		
		Set<String> keys=phonebook.keySet();
		for(String str: keys)
		{
			System.out.println(str+" : "+phonebook.keySet());
			System.out.println(str+" : "+phonebook.entrySet());
			System.out.println("+++++++++++++++++");
			System.out.println(str+" : "+phonebook.get(str));
		}
		
		System.out.println("*******************");
		
		Set<Map.Entry<String, Integer>> values=phonebook.entrySet();
		for(Map.Entry<String, Integer> e :values)
		{
			System.out.println(e.getKey()+" : "+e.getValue());
			
		}
	
	}
	
}
