package superKeyword;

class Ab{
	Ab(){
		System.out.println("Parent class constructor called");
	}
}

class Ba extends Ab{
	Ba(){
		super(); //call the parent class constructor
		System.out.println("sub class constructor called");
	}
}

public class Super3 {
	public static void main(String args[]) {
		Ba obj=new Ba();
	}
}
