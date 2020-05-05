package overriding;

class Ak{
	
	int a=10;
	
	int print() {
		return a;
	}
}

class Bk{
	
	double b=1.2;
	
	double print() {
		return b;
	}
}

public class CovarientOverriding {
	public static void main(String args[]) {
		System.out.println(new Bk().print());
	}
}
