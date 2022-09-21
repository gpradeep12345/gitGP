package com.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExercise {

	public static void main(String[] args) {
		Map<Integer,String> nam = new HashMap<Integer,String>();
		

		nam.put(0, "java");
		nam.put(1, "selenium");
		nam.put(2, "Project");
		nam.put(3, "Testing");
		System.out.println(nam);
		Object nam1 = new HashMap<Integer,String>();
		
	
	//	Write a Java program to check whether a map contains key-value mappings (empty) or not.
		boolean res = nam.isEmpty();
		System.out.println("Is hash map empty: " + res);
		
	//	 Write a Java program to get a shallow copy of a HashMap instance.
		nam1 = ((HashMap) nam).clone();     
		   System.out.println("Cloned map: " + nam1);   
		 //  Write a Java program to remove all the mappings from a map.
		   nam.clear();
		   System.out.println("The New map: " + nam);
	}

}
