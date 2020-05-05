package overriding;

class A{
	int a=10;
	void display() {
		System.out.println(a);
	}
}

class B{
	int b=20;
	void display() {
		System.out.println(b);
	}
}

public class MethodOverriding {
	public static void main(String args[]) {
		A obj=new A();
		obj.display();
		B obj2=new B();
		obj2.display();
	}

}
