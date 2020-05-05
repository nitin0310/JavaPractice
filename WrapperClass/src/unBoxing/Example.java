package unBoxing;

class B{
	Integer i=new Integer(10);		//after ver.9 Integer constructor is not supported
	int a=i.valueOf(i);
	
	void display() {
		System.out.println(i+" "+a);
	}
}

public class Example {
	public static void main(String args[]) {
		new B().display();
	}
}
