package com.polymorphism;

public class OverRiding2 extends MethodOverriding{
	@Override
	public void account_Creation(String name) {
		super.account_Creation(name);
	}
	@Override
	public void account_Creation(String mailId, long number) {
		super.account_Creation(mailId, number);
	}
	@Override
	public void account_Creation(String gender, int age) {
		super.account_Creation(gender, age);
	}
	
	public static void main(String[] args) {
		System.out.println("   create new login account ");
		System.out.println("...............................");
		OverRiding2 o = new OverRiding2();
		o.account_Creation("pradeep gandhi");
		o.account_Creation("pradeep123@gmail.com" ,1111111111);
		o.account_Creation("Male", 24);
		System.out.println("...........  create ...........");
	}
}
