package mathClassExamples;

class B{
	int x=30;
	
	void display() {
		System.out.println("Sin of "+x+" "+Math.sin(x));
		System.out.println("Cos of "+x+" "+Math.cos(x));
		System.out.println("Tan of "+x+" "+Math.tan(x));
		
		System.out.println("Arc Sin of "+x+" "+Math.asin(x));
		System.out.println("Arc cos of "+x+" "+Math.acos(x));
		System.out.println("Arc tan of "+x+" "+Math.atan(x));
		System.out.println("Absolute value of "+x+" "+Math.abs(x));
		System.out.println("Round of 25.7 "+Math.round(25.7));
		System.out.println("Ceil of 25.4"+Math.ceil(25.4));
		System.out.println("IncrementExact of "+x+" "+Math.incrementExact(x));
	}
}

public class Example2 {
	public static void main(String[] args) {
		new B().display();
	}
}
