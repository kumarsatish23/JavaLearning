package main.core;

class A{
	int i=10;
	int j=20;
	
	A(){
		this(10);
		System.out.println("Zero-Arg Constructor");
	}
	A(int i){
		this(11.11f);
		System.out.println(i);
	}
	A(float f){
		this(1,2);
		System.out.println(f);
	}
	A(int i,int j){
		System.out.println(i+" "+j);
		//System.out.println(this.i+" "+this.j);
	}
}
public class This {

	public static void main(String[] args) {
		A a=new A();
	}

}
