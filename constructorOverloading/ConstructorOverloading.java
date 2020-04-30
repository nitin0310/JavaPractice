package constructorOverloading;

class Test{
	Test(){
		System.out.println("No args constructor");
	}
	Test(int a){
		System.out.println("one args : "+a);
	}
	Test(int a,int b){
		System.out.println("two args : "+a+" "+b);
	}
	Test(int a,double b){
		System.out.println("different args type : "+a+" "+b);
	}
}

public class ConstructorOverloading {
	public static void amin(String args[]) {
		Test obj=new Test();
		obj=new Test(10,20);
		Test obj2=new Test(5,4.7);
	}

}
