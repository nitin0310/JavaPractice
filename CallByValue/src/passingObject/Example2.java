package passingObject;

class B{
	int i=30;
	
	void change(B obj) {
		obj.i=i+30;
	}
}
		//java doesn't supports call by reference

public class Example2 {
	public static void main(String args[]) {
		B obj=new B();
		System.out.println(obj.i);
		obj.change(obj);
		System.out.println(obj.i);
	}
}
