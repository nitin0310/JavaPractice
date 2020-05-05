package interfaces;

interface Draw{
	void draw();
}

interface PrintI{
	void print();
}

class Y implements Draw,PrintI{
	public void draw() {
		System.out.println("draw() called");
	}
	
	public void print() {
		System.out.println("print() called");
	}
}

public class MultipleInheritance {

	public static void main(String[] args) {
		Y obj=new Y();
		obj.draw();
		obj.print();
	}

}
