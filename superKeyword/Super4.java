package superKeyword;

class Xa{
	Xa(){
			System.out.println("Parent class constructor called");
	}
}

class Ya extends Xa{
	Ya(){  //implicity call to super() by compiler.
		System.out.println("Sub class constructor called");
	}
	
}

public class Super4 {
	public static void main(String args[]) {
		Ya obj=new Ya();
	}
}
