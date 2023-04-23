package main.core;

class Test{
	private Test() {
		System.out.println("Constructor");
	}
	void method() {
		System.out.println("Method");
		
	}
	static Test getRef() {
		Test t=new Test();
		return t;
	}
}
public class FactoryMethod {
	public static void main(String args[]) {
		Test test=Test.getRef();
		test.method();
		System.out.println(test);
		
		Test test2=Test.getRef();
		test2.method();
		System.out.println(test2);

	}
}
