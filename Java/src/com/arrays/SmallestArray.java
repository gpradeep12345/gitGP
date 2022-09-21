package com.arrays;

import java.util.Arrays;

public class SmallestArray {

	public static void main(String[] args) {
		 int num[] = {1, 2, 3, 4, 5, 6, 33, 22,-1,-2,-3,-16};
		 int n = num.length;
		 Arrays.sort(num);
		 System.out.println(num[0]);
	}

}
