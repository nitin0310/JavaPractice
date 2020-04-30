package thisKeyword;

class A{
	int a=10;
	A(){
		B obj=new B(this);
	}
	
	A(B obj){
		System.out.println(obj.b);
	}
}

class B{
	int b=20;
	B(){
		A obj=new A(this);
	}
	
	B(A obj){
		System.out.println(obj.a);
	}
}

public class CnstructorArgument {
	public static void main(String args[]) {
		A obj=new A();
		B obj2=new B();
	}

}
