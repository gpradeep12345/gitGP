package com.strings;

public class CanonicalSTRINGS {
	public static void main(String[] args) {
		 String S1 = "hello world";
	        String S2 = new StringBuffer("Hello").append("world").toString();
	        String S3 = S2.intern();
	        System.out.println (S1 == S2);
	        System.out.println(S1 == S3);
	}

}
