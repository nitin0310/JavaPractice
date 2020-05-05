package callByValue;

class A{
	int i=10;
	
	void change(int i) {
		i=i+i;
	}
}

public class Example1 {
	public static void main(String args[]) {
		A obj=new A();
		System.out.println(obj.i);
		obj.change(30);
		System.out.println(obj.i);		//Not gonna change the actual value
	}
}
