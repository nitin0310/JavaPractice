package abstractClass;

abstract class Ab{
	int i=10;
	abstract void run();
	void print() {
		System.out.println("class A");
	}
}

class Ba extends Ab{
	void run() {
		System.out.println("Run called");
	}
}

public class AbstractClass2 {
	public static void main(String args[]) {
		Ba obj=new Ba();
		obj.print();
		System.out.println(obj.i);
		obj.run();
	}
}
