package factorialNumber;
import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no. to find factorial");
		int num = scan.nextInt();
		int temp=1;
		
		for(int i=1;i<=num;i++) {
			temp = temp*i;
		}
		
		System.out.println("Factorail of "+num+" : "+temp);
	}

}
