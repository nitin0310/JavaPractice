package arrayProblems;

public class EvenPositionElements {

	public static void main(String[] args) {
		int a[] = {1,2,3,5,7,4,8,9};
		int n=a.length;
		
		System.out.println("Even position array");
		for(int i=0;i<n;i++) {
			if(i%2==0) {
				System.out.print(a[i]+" ");
			}
		}
		

	}

}
