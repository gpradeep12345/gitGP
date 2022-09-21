package com.arrays;

import java.util.LinkedHashSet;

public class RemoveDuplicateArray {
	public static void removeDuplicates(int[] a) {
		 LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		 for (int i = 0; i < a.length; i++)
	            set.add(a[i]);
		  System.out.print(set);
		
	}

	public static void main(String[] args) {
		int a[] = {1,2,6,3,8,7,9,2,8};      
        removeDuplicates(a);
	}

	
}
