package stringProblems;
import java.util.Scanner;

public class ReplaceByChar {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter String : ");
		String str=scan.nextLine();
		
		int len=str.length();
		System.out.println("String entered : "+str);
		
		System.out.println("enter character to replace : ");
		String rep=scan.nextLine();
		str=str.replaceAll(" ",rep);
		
		System.out.println("After replace : ");
		System.out.println(str);
	}

}
