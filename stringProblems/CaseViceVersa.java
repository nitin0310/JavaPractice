package stringProblems;

public class CaseViceVersa {

	public static void main(String[] args) {
		String str="Great Power";
		char[] charA=str.toCharArray();
		
		int len=str.length();
		for(int i=0;i<len;i++) {
			if(Character.isLowerCase(str.charAt(i))) {
				charA[i]=Character.toUpperCase(str.charAt(i));
			}else {
				charA[i]=Character.toLowerCase(str.charAt(i));
			}
		}
		
		System.out.println("New string : ");
		for(int i=0;i<len;i++) {
			System.out.print(charA[i]);
		}

	}

}
