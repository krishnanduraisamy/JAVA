package com.arraystring;

class Outer {
	static int a;
	

	public static void show() {
		
		System.out.println("Krishna");
 
	}

	static class Inner {
		public static void display() {
			System.out.println("Ramkumar");
		}
	}
}

public class InnerDemo {

	public static void main(String[] args) {

//		Outer obj = new Outer();
//		obj.show();
		
		Outer.show();
	Outer.Inner.display();
	}

}
