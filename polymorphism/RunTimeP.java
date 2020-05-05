package polymorphism;

class As{
	void display() {
		System.out.println("Parent class");
	}
}

class Bs extends As{
	void display() {
		System.out.println("Sub class");
	}
}

public class RunTimeP {
	public static void main(String args[]) {
		As obj;
		obj=new Bs(); //At runtime compiler get to know the method to dispatch at runTime
		obj.display();
	}
}
