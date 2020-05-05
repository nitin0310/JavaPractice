package binding;

class Sa{
	void print() {
		int i=20;
		System.out.println(i);
	}
}

class Aa extends Sa{
	void print() {
		int i=10;
		System.out.println(i);
	}
}

public class DynamicBinding{
	public static void main(String args[]) {
		Sa obj;
		obj=new Aa();
		obj.print();  //Dynamic binding is connecting the method call to method body.
		
	}
}
