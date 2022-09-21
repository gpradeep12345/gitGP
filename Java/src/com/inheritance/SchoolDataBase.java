package com.inheritance;

public class SchoolDataBase extends StudentDetails {

	public static void main(String[] args) {
		System.out.println("     AAA SCHOOL    ");
		System.out.println(".....................");
		SchoolDataBase sd = new  SchoolDataBase();
		sd.studentName();
		sd.standardAndSection();
		sd.bloodGroup();
		sd.parntName();
		sd.houseAddress();
		
	}

}
