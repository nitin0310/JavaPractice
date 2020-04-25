package stringProblems;

public class CountCharcters {

	public static void main(String[] args) {
		String str ="Hello World";
		int n=str.length();
		int count=0;
		for(int i=0;i<n;i++) {
			if(str.charAt(i)!=' ') {
				count++;
			}
		}
		
		System.out.println("Characters : "+count);

	}

}
