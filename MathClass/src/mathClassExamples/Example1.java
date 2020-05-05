package mathClassExamples;

class A{
	int x=2,y=66;
	
	void display() {
		System.out.println("Max is :"+Math.max(x, y));
		System.out.println("Min is :"+Math.min(x, y));
		System.out.println("Square root of "+x+" "+Math.sqrt(x));
		System.out.println("Power x^4"+" "+Math.pow(x, 4));
		System.out.println("Log of "+x+" "+Math.log(x));
		System.out.println("Log of "+y+" "+Math.log(y));
	}
}

public class Example1 {
	public static void main(String[] args) {
		new A().display();
	}
}
