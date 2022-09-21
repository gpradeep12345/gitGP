package com.strings;

public class CharArray {

	public static void main(String[] args) {
		String s = "This is pradeep";
		
		char[] a = new char[] { ' ', ' ', ' ', ' ',
                ' ', ' ', ' ', ' ' };
		
		s.getChars(3, 9, a, 1);
		 System.out.println("The char array equals " +
		            a );
	}

}
