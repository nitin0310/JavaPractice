package stringProblems;

public class CountVowel {

	public static void main(String[] args) {
		String str = "Hello World";
		int len=str.length();
		int vow=0,cont=0;
		
		for(int i=0;i<len;i++) {
			int a=str.charAt(i);
			if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u') {
				vow++;
			}
		}
		for(int i=0;i<len;i++) {
			if(str.charAt(i)!=' ') {
				cont++;
			}
		}
		
		System.out.println("Vowels : "+vow);
		System.out.println("Contants : "+(cont-vow));

	}

}
