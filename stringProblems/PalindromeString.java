package stringProblems;

public class PalindromeString {

	public static void main(String[] args) {
		String str="Nitin";
		int len=str.length();
		int flag=0;
		for(int i=0;i<(len/2);i++) {
			if(str.charAt(i)!=str.charAt(len-1-i)) {
				flag=1;
			}
		}
		
		if(flag==0) {
			System.out.println("Not a Palindrome String");
		}else {
			System.out.println("Palindrome String");
		}

	}

}
