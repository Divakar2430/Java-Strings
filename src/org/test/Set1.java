package org.test;

import java.util.Set;
import java.util.TreeSet;

public class Set1 {
	public static void main(String[] args) {
		Set<Character> li = new TreeSet<Character>();
		li.add('A');
		li.add('a');
		li.add('@');
		li.add('9');
		System.out.println(li);
		for(Character x:li) {
			System.out.println(x);
		}
	}

}
