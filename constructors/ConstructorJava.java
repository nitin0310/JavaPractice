package constructors;

public class ConstructorJava {
	
	ConstructorJava(){
		//no-args constructor
		System.out.println("No-args called");
	}
	
	ConstructorJava(int a,int b){
		//Parameterized constructor
		System.out.println(" a: "+a+" +"+"b: "+b);
	}

	public static void main(String args[]) {
		ConstructorJava obj=new ConstructorJava();
		ConstructorJava obj2=new ConstructorJava(10,20);
	}
}
