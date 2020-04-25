package stringProblems;
import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagram {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter string 1");
		String str1=scan.nextLine();
		System.out.println("Enter string 1");
		String str2=scan.nextLine();
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		if(str1.length()!=str2.length()) {
			System.out.println("Not possible");
		}else {
			
			char[] char1=str1.toCharArray();
			char[] char2=str2.toCharArray();
			
			Arrays.sort(char1);
			Arrays.sort(char2);
			
			if(Arrays.equals(char1, char2)) {
				System.out.println("Anagram");
			}else {
				System.out.println("Not an anagram");
			}
		}
	}
}
