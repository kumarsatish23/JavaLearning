package main.core;

class B{
	B getRef() {
		B b=new B();
		return b;
	}
	B getRef2() {
		return this;
	}
}
public class CurrentClass {
	public static void main(String[] args) {
		B b=new B();
		System.out.println(b);
		System.out.println();
		
		System.out.println(b.getRef());
		System.out.println(b.getRef());
		System.out.println(b.getRef());
		System.out.println();
		System.out.println(b.getRef2());
		System.out.println(b.getRef2());
		System.out.println(b.getRef2());
		
	}
}
