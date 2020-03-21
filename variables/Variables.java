package variables;

//Variables types-local, instance(non-static) and static variables.

public class Variables {
	
	int a;
	final int c = 30;
	
	Variables(int x){
		this.a = x;
	}
	
	static float b = 30.5f;

	public static void main(String[] args) {
		
		//local variable
		{
			int x=10;
			System.out.println("x : "+x);
		}
		//System.out.println("x : "+x);  create an error bcz it destroy after block execution.
		
		//instance variable
		Variables obj = new Variables(20);
		System.out.println("a : "+obj.a);
		
		Variables obj2 = new Variables(25);
		System.out.println("a : "+obj2.a);
		
		//static variables can only be called by class not by an instance.
		System.out.println("b : "+Variables.b);
		
		//final variable
		System.out.println("c : "+obj.c);
		
	}
}
