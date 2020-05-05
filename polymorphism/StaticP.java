package polymorphism;

class D{
	void display() {
		System.out.println("Parent");
	}
}

class H extends D{
	void display() {
		System.out.println("Sub");
	}
}

public class StaticP {

	public static void main(String[] args) {
		D obj1=new D();
		obj1.display();
		H obj2=new H();
		obj2.display();

	}

}
