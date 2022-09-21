package com.arrays;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		 int num[] = {1, 2, 3, 4, 5, 6, 33, 22,-1,-2,-3};
		 int n = num.length;
		 Arrays.sort(num);
		  System.out.println(num[n-2]);
		  System.out.println(num[0]);
	}

}
