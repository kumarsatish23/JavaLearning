package main.core;


class staticchild{
	static int i=10;
	int j=10;
	static void method() {
		System.out.println(i);
	//	System.out.println(j);
	//	System.out.println(this.i);
	}
	static {
		System.out.println("Static Block Exceutes at the time of loading respective class bytecode to the memory");
	}
}
public class staticmain {

	public static void main(String[] args) {
		
		staticchild object1=new staticchild();
		object1.method();
		System.out.println(object1.i+" "+object1.j);
		
		object1.i=object1.i+1;
		object1.j=object1.j+1;
		
		System.out.println(object1.i+" "+object1.j);
		
		staticchild object2=new staticchild();
		
		System.out.println(object2.i+" "+object2.j);

		object2.i=object2.i+1;
		object2.j=object2.j+1;
		
		System.out.println(object2.i+" "+object2.j);
		
		staticchild object3=new staticchild();
		
		System.out.println(object3.i+" "+object3.j);

		object3.i=object3.i+1;
		object3.j=object3.j+1;
		
		System.out.println(object3.i+" "+object3.j);
		
		object3.method();
		staticchild.method();

	}

}
