package superKeyword;

class Xy{
	void print() {
		System.out.println("Parent class method");
	}
}

class Yx extends Xy{
	void print() {
		super.print();  //call parent class method
		System.out.println("Child class method");
	}
}

public class Super2 {
	public static void main(String args[]) {
		Yx obj=new Yx();
		obj.print();
	}
}
