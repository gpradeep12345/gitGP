package com.set;

import java.util.*;
import java.util.Set;

public class HashSetExercise {

	public static void main(String[] args) {
		Set<String> obj = new HashSet<>();
		obj.add("pradeep");
		obj.add("yeswanth");
		obj.add("ram");
		System.out.println(obj);
		
	
		 
		// Write a Java program to test a hash set is empty or not.
		 System.out.println("Checking the above array  is empty......."  +  obj.isEmpty());
		 
		 
		// Write a Java program to clone a hash set to another hash set.
		 Set<String> obj1 = new HashSet<>();
		 obj1 = (Set<String>) ((HashSet) obj).clone();
		 System.out.println("Cloned Hash Set: " + obj1);     
		 
//			Write a Java program to empty an hash set.
			obj.removeAll(obj);
			 System.out.println(obj);
	}

}
