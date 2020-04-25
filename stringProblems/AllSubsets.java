package stringProblems;

public class AllSubsets {

	public static void main(String args[]) {
		String str="FUN";
		int len=str.length();
		int subsets=(len*(len+1))/2;
		
		for(int i=0;i<len;i++) {
			for(int j=i;j<len;j++) {
				System.out.println(str.substring(i,j+1));
			}
		}
		
		
	}
}
