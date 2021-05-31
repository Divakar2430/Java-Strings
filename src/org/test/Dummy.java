package org.test;

public class Dummy {
	public static void main(String[] args) {
		String s = "A";
		int i = s.compareTo("B");
		System.out.println(i);
		String s1 = "ABCD";
		int j = s1.compareTo("ACLK");
		System.out.println(j);
		String s2 = "ABCD";
		int k = s2.compareTo("AB");
		System.out.println(k);
	}

}
