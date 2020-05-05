package interfaces;

interface Print{
	void print();   //public,abstract added by default to it by the compiler
}

class X implements Print{
	public void print(){
		System.out.println("print() called");
	}
}

public class Interface1 {
	public static void main(String args[]) {
		X obj=new X();
		obj.print();
	}
}
