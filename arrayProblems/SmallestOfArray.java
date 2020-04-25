package arrayProblems;

public class SmallestOfArray {

	public static void main(String[] args) {
		int a[] = {34,67,32,3,4,5,6,79};
		int min = a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		
		System.out.println("Smallest : "+min);

	}

}
