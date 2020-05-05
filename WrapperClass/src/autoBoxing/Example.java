package autoBoxing;

class A{
	int a=20;
	Integer i=Integer.valueOf(a);
	Integer j=a;	//above and this are the same in this Integer.valueOf called implicitly
	
	void display() {
		System.out.println(a+" "+i+" "+j);
	}
}

public class Example {
	public static void main(String args[]) {
		new A().display();
	}
}
