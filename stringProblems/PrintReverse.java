package stringProblems;

public class PrintReverse {

	public static void main(String[] args) {
		String str="Hello World";
		
		char[] charA=str.toCharArray();
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(charA[i]);
		}

	}

}
