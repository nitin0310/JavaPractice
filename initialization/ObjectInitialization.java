package initialization;

class Test{
	int a,b;
	
	Test(){
		
	}
	
	Test(int a,int b){ //by constructor call
		this.a=a;
		this.b=b;
	}
	
	void insert(int a,int b) { //by method call
		this.a=a;
		this.b=b;
	}
	
}

public class ObjectInitialization {

	public static void main(String[] args) {
		Test obj0=new Test();
		obj0.a=2;
		obj0.b=5;
		System.out.println("obj0:"+obj0.a+" "+obj0.b);
		Test obj1=new Test(10,20);
		System.out.println("obj1:"+obj1.a+" "+obj1.b);
		Test obj2=new Test();
		obj2.insert(30, 40);
		System.out.println("obj2:"+obj2.a+" "+obj2.b);

	}

}
