package stringProblems;

public class ReverseString {

	public static void main(String[] args) {
		
		String str="Hello World";
		int n=str.length();
		char[] charA=str.toCharArray();
		char[] charB=new char[n];
		
		for(int i=0;i<n;i++) {
				charB[i]=charA[(n-i-1)];
		}
		
		for(int i=0;i<n;i++) {
			System.out.print(charB[i]);
		}

	}

}
