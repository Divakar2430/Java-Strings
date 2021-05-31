package org.test;

public class StringBasic {
	public static void main(String[] args) {
		String s1 = "Hello welcome to java class";
		String[]x = s1.split(" ");
		System.out.println(s1.length());
		System.out.println(x.length);
		String[]x2 = s1.split("l");
		for(String x3: x2)
		System.out.println(x3);
	}

}
