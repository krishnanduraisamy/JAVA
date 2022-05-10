package com.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hashmap {
	
	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();

		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("Four");
		set.add("Five");
		set.add("Three");
		set.add("Null");

		Iterator<String> i = set.iterator();
		while (i.hasNext()) {

			System.out.println(i.next());
		}

	}

}








				
