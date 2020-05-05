package package1;

class A{
	private int i=0;
	private void display() {}
	
	private A() {}
}

public class MainClass {

	public static void main(String[] args) {
		//  A obj=new A();		we can't intantiate of constructor declared private.
		//obj.display();     not visible error bcz outside class we can't access it.

	}

}
