package arrayProblems;

public class LargestOfArray {

	public static void main(String[] args) {
		int a[] = {34,67,32,80,4,5,6,79};
		int max = a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		
		System.out.println("Largest : "+max);
	}

}
