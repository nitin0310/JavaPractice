package initializer;

class Xab{
	
	Xab(){
		System.out.println("Parent class constructor called");
	}
	
	{System.out.println("Parent class initializer");}
}

class Yab extends Xab{
	
	Yab(){
			//super() invoked implicitly
		System.out.println("Sub class constructor called");
	}
	
	{System.out.println("Parent class initializer");}
}

public class Initializer {
	public static void main(String args[]) {
		Yab obj=new Yab();
	}
}
