package armstrongNumber;
import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter no. to check armstrong");
		int num = scan.nextInt();
		
		int a = 0;
		int temp=num;
		while(temp>0) {
			int rem = temp%10;
			a= a+(rem*rem*rem);
			temp = temp/10;
		}
		
		if(a==num) {
			System.out.println("An armstrong number");
		}else {
			System.out.println("Not an armstrong number");
		}
		
	}

}
