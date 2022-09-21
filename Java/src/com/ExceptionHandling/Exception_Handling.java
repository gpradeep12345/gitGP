package com.ExceptionHandling;

import java.util.Scanner;

public class Exception_Handling {

	public static void main(String[] args) {
		int a = 20;
	    int b = 0; 
	    int c = 0;   
		try {
			c=a/b;
		}
		catch (ArithmeticException e) {
		System.out.println("arithmetic exception occurred");
		}
	    catch (Exception e) {
			System.out.println("exception occured");
	}
	    finally {
			System.out.println("this gets printed what ever exception occured");
		}
            
            String s = null;
    	    int length = 0;
			try {
				length = s.length();
			} catch (NullPointerException e) {
				System.out.println("NULL POINTER  exception occured");
			}
			
			String s1 = "java";
			char charAt = 0;
			try {
				charAt = s1.charAt(5);
			} catch (StringIndexOutOfBoundsException e) {
				
				System.out.println("stringindexoutofbounds  exception occured");
			}
			int d[] = {1,2,3,4};
			try {
				System.out.println(d[4]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("arrayindexoutofbounds  exception occured");
			}			
			System.out.println(c);
            System.out.println(length);
            System.out.println("................"+charAt);
    	    System.out.println("rest of the program");
	}
}