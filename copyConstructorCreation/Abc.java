package copyConstructorCreation;

public class Abc {
	int a=0,b=0;
	
	Abc(){}
	
	Abc(int a,int b){
		this.a=a;
		this.b=b;
	}
	
	Abc(Abc obj){
		a=obj.a;
		b=obj.b;
	}
	

	public static void main(String args[]) {
		Abc obj1=new Abc(10,20);
		System.out.println("a: "+obj1.a+" b: "+obj1.b);
		Abc obj2 = new Abc(obj1);
		System.out.println("a: "+obj2.a+" b: "+obj2.b);
		Abc obj3=new Abc();
		obj3.a=obj2.a;
		obj3.b=obj2.b;
		System.out.println("a: "+obj3.a+" b: "+obj3.b);
	}
}
