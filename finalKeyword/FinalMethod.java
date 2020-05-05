package finalKeyword;

class F{
	void display() {
		System.out.println("Parent class method");
	}
}

public class FinalMethod extends F{
	public static void main(String args[]) {
		FinalMethod obj=new FinalMethod();
		obj.display();
		
		// can't override the method once declared final
	}
}