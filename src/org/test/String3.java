package org.test;

public class String3 {
	public static void main(String[] args) {
		String s = "Hello java";
		int m = s.indexOf("b");
		System.out.println(m);
		int m1 = s.indexOf("a");
		System.out.println(m1);
		int m2 = s.lastIndexOf("a");
		System.out.println(m2);
		String s1 = "Hello java";
		String replace = s1.replace("java", "World");
		System.out.println(replace);
		System.out.println(s1);
		char c = s.charAt(10);
		System.out.println(c);
	
	}

}
