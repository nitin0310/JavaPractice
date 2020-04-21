package palindromeNumber;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter no. to check palindrome");
	int num = scan.nextInt();
	if(checkPalindrome(num)) {
		System.out.println("Palindrome");
	}else {
		System.out.println("Not a Palindrome");
	}

	}

	static boolean checkPalindrome(int num) {
		int temp = num;
		int temp2=0;
		int a;
		while(temp>0) {
			a=temp%10;
			temp2 = (temp2*10)+a;
			temp = temp/10;
		}
		
		if(temp2==num) {
			return true;
		}else {
			return false;
		}
	}
}
