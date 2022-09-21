package com.list;
import java.util.*;
import java.util.ArrayList;

public class ArrayListExercise {

	public static void main(String[] args) {
		List<Object> nam = new ArrayList<>();
		 nam.add("pradeep");
			nam.add("yeswanth");
			nam.add("ram");
			System.out.println(nam);
			
		//	Write a Java program to retrieve an element (at a specified index) from a given array list.
			 Object string = nam.get(0);
			 System.out.println("the first element is "+string);
		//	 Write a Java program to update specific array element by given element. 
			 nam.set(2, "java");
			 System.out.println(nam);
		//	 Write a Java program to remove the third element from a array list. 
			 nam.remove(1);
			 System.out.println(nam);
	}

}
