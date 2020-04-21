package operators;

public class BitwiseOperators {

	public static void main(String args[]) {
		
		int a=10,b=20;
		
		System.out.println("a : "+a+"b : "+b);
		System.out.println(a>25&&b<25); //if condition first is true then check for the second one.
		System.out.println(a<25&&b<25);
		System.out.println(a>25&b<25); //check for the conditions first one and the second one.
		System.out.println(a>25&b>25);
	}
}
