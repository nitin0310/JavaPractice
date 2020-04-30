package thisKeyword;

class Abcd{
	void n() {
		System.out.println("n() is called");
		this.m(); //if we don't add this by ourself ,our compiler will add it by itself.
	}
	void m() {
		System.out.println("m() is called");
	}
	
}

public class CallMethod {
	public static void main(String args[]) {
		Abcd obj=new Abcd();
		obj.n();
	}

}
