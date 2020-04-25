package stringProblems;

public class DivideEqually {
	public static void main(String args[]) {
		String str="aaabbbccc";
		int len=str.length();
		int n=3;
		int chars=len/n;
		
		if(len%3!=0) {
			System.out.println("Division not possible");
		}else {
			
			for(int i=0;i<len;i=i+chars) {
				System.out.println(i);
				System.out.println(str.substring(i, i+chars));
			}
		}
	}

}
