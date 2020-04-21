package palindromeString;
import java.util.*;

public class PalindromeString {

	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter String to check palindrome");
		String orgString = scan.nextLine();
		String tempString ="";
		int len = orgString.length();
		
		for(int i=len-1;i>=0;i--) {
			tempString = tempString+orgString.charAt(i);
		}
		
		if(tempString.equals(orgString)) {
			System.out.println("Palindrome string");
		}else {
			System.out.println("Not a Palindrome string");
		}
		
	}
}
