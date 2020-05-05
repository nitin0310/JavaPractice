package abstractClass;

abstract class A{
	abstract void print();
}

class B extends A{
	void print() {
		System.out.println("Class B");
	}
}

public class AbstractClass1 {

	public static void main(String[] args) {
		B obj=new B();
		obj.print();
	}

}
