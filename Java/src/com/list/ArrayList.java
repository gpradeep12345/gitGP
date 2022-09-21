package com.list;

import java.util.*;

public class ArrayList {

	public static void main(String[] args) {
		LinkedList<String> nam = new LinkedList<String>();

		//add()
		nam.add("pradeep");
		nam.add("yeswanth");
		nam.add("ram");
		System.out.println(nam);
		//contains()
		 boolean contains = nam.contains("pradeep");
		 System.out.println(contains);
		 //indexof()
		 int indexOf = nam.indexOf("ram");
		 System.out.println(indexOf);
		 //size()
		 int size = nam.size();
		 System.out.println(size);
		 //get()
		 String string = nam.get(1);
		 System.out.println(string);
		 //set()
		 nam.set(2, "java");
		 System.out.println(nam);
		 //remove()
		 nam.remove(0);
		 System.out.println(nam);
		 //clear
		 nam.clear();
		 System.out.println(nam);
		 
		 LinkedList<String> nam1 = new LinkedList<String>();

			//add()
			nam1.add("pradeep");
			nam1.add("yeswanth");
			nam1.add("ram");
			//addall()
			nam1.addAll(nam);
			System.out.println(nam1);
			//removeall()
			nam1.retainAll(nam);
			System.out.println(nam1);
	}

}
