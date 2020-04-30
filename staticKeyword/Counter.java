package staticKeyword;

class Abcd{
	static int count=0;
	Abcd(){
		count++;
		System.out.println("count: "+count);
	}
}

public class Counter {
	public static void main(String args[]) {
		Abcd obj=new Abcd();
		Abcd obj2=new Abcd();
		Abcd obj3=new Abcd();
	}

}
