package stringProblems;

import java.util.Scanner;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		String str=scan.nextLine();
		str=str.replaceAll(" ", "");  //or we can also use "\\s+" ,represents white spaces.
		System.out.println(str);
	}

}
