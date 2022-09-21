package com.polymorphism;

public class MethodOverriding {
	public void account_Creation(String name) {
		System.out.println("Name:"+name);
	}
	public void account_Creation(String mailId, long number) {
		System.out.println("mailid:"+mailId+"  " + "number :" + number);
		
	}
	public void account_Creation(String gender, int age) {
		System.out.println("Gender:"+gender);
		System.out.println("Age:"+age);
	}
	public static void main(String[] args) {
		System.out.println("   create new login account ");
		System.out.println("...............................");
		MethodOverriding m = new MethodOverriding();
		m.account_Creation("pradeep");
		m.account_Creation("pradeep123@gmail.com" ,1111111111);
		m.account_Creation("Male", 24);
		System.out.println("...........  create ...........");
	}
}
