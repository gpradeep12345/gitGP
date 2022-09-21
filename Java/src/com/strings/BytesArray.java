package com.strings;

public class BytesArray {

	public static void main(String[] args) {
		String s = "this is pradeep";
        byte[] b = s.getBytes();
        String ns = new String(b);
        System.out.println("The new String equals" +ns);
	}

}
