package thisKeyword;

class Bac{
	
	Bac(){
		System.out.println("No-args constructor called");
		m(this);
	}
	
	void m(Bac ref){
		System.out.println("Reference method called");
	}
}

public class PassingAsArgument {
	public static void main(String args[]) {
		Bac obj=new Bac();
	}
}
