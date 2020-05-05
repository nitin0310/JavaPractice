package finalKeyword;

class D{
	final int i; //final blank variable can only be initialized i constructors
	D(){
		i=30;
		System.out.println(i);
	}
}

public class Final3 {
	public static void main(String args[]) {
		D obj=new D();
	}
}
