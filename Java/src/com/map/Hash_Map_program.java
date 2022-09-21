package com.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hash_Map_program {

	public static void main(String[] args) {
		Map<Integer,String> nam = new HashMap<Integer,String>();
		//put
		nam.put(0, "java");
		nam.put(1, "selenium");
		nam.put(2, "Project");
		nam.put(3, "Testing");
		nam.put(4, "java");
		nam.put(5, "jaww");
		nam.put(6, "ja");
		nam.put(7, "java");
		
		//set conversion
		Set<Entry<Integer,String>> entrySet = nam.entrySet();
		
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry);
		}
		System.out.println(nam);
		//containsvalue
		boolean containsValue = nam.containsValue("java");
		System.out.println(containsValue);
		//contianskey
		boolean containsKey = nam.containsKey(3);
		System.out.println(containsKey);
		//size
		int size = nam.size();
		 System.out.println(size);
		 //get
		 String string = nam.get(5);
		 System.out.println(string);
		 //keyset
		 Set<Integer> keySet = nam.keySet();
		 System.out.println(keySet);
		 //values
		 Collection<String> values = nam.values();
		 System.out.println(values);
		 //removekey
		 String remove = nam.remove(4);
		 System.out.println(remove);
		 //replace
		 nam.replace(5, "java");
		 System.out.println(nam);
	}

}
