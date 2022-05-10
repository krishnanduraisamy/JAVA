package com.collections;

import java.util.ArrayList;

public class ListKris {

	public static void main(String[] args) {

		ArrayList<Integer> l = new ArrayList<>();

		l.add(100);
		l.add(200);
		l.add(300);
		l.add(400);
		l.add(500);

		System.out.println(l);
		System.out.println(l.get(3));
		System.out.println(l.remove(2));
		System.out.println(l);

		ArrayList<Integer> l2 = new ArrayList<>();

		l2.add(999);
		l2.add(888);
		l2.add(777);

		System.out.println(l2);
		l2.addAll(l);
		System.out.println(l2);
		l2.removeAll(l);
		System.out.println(l2);
		
		
		
	}

}
