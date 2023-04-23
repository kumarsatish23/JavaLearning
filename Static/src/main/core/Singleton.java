package main.core;

class Single{
	static Single s=null;
	static Single getRef() {
		if(s==null) {
			s=new Single();
			return s;
		}
		else
			return s;
	}
}
public class Singleton {

	public static void main(String[] args) {
		System.out.println(Single.getRef());
		System.out.println(Single.getRef());
	}

}
