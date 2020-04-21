package factorialNumber;
import java.util.Scanner;

public class FactorialByRecursion {

	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no. to find factorial");
		int num = scan.nextInt();
		int fact = factorial(num);
		
		System.out.println("factorial of "+num+" : "+fact);
	}
	
	static int factorial(int num) {
		if(num==1) {
			return 1;
		}else {
			return (num*(factorial(num-1)));
		}
	}
}
