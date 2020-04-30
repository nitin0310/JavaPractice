package thisKeyword;

class Acb{
	
	Acb(){
		this(10);
		System.out.println("no-args constructor called");
	}
	
	Acb(int i){
		System.out.println(i);
	}
}

public class CallConstructor {
	public static void main(String args[]) {
		Acb obj=new Acb();
	}
}