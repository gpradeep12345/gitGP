package com.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Stream;
public class HashSetProgram {

	public static void main(String[] args) {
		Set<String> obj = new HashSet<>();
		
		//add()
				obj.add("pradeep");
				obj.add("yeswanth");
				obj.add("ram");
				obj.add(null);
				obj.add(null);
				System.out.println(obj);
				
				//stream
				 Stream<String> stream = obj.stream();
				 for (String string : obj) {
					System.out.println(string);
				}
				//contains()
				 boolean contains = obj.contains("pradeep");
				 System.out.println(contains);
				 //size
				 int size = obj.size();
				 System.out.println(size);
				 //iterator
				 Iterator<String> iterator = obj.iterator();
				 System.out.println(iterator);
				 //remove()
				 obj.remove(0);
				 System.out.println(obj);
				//clear
				 obj.clear();
				 System.out.println(obj);
				 Set<String> obj1 = new HashSet<>();
					
					//add()
							obj1.add("pradeepg");
							obj1.add("yeswanth");
							obj1.add("ram");
							obj1.add(null);
							obj1.add(null);
							//addall()
							obj1.addAll(obj);
							System.out.println(obj1);
							//removeall()
							obj1.retainAll(obj);
							System.out.println(obj1);
	}

}
