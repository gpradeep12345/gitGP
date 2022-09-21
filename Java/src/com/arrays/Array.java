package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		String[]  ar = new String[] {"hello", "hola", "hi",  "si", "worl#", "C++"};
		 ArrayList<String>  list = new ArrayList<String>(Arrays.asList(ar));
		  System.out.println(list);
	}

}
