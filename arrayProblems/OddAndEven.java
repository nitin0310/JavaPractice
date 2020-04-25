package arrayProblems;

public class OddAndEven {

	public static void main(String[] args) {
		int a[] = {2,5,7,3,2,6,8};
		int n=a.length;
		
		System.out.println("Odd no.");
		for(int i=0;i<n;i++) {
			if(a[i]%2!=0) {
				System.out.print(a[i]+" ");
			}
		}
		
		System.out.println("\nEven no.");
		for(int i=0;i<n;i++) {
			if(a[i]%2==0) {
				System.out.print(a[i]+" ");
			}
		}
	}

}
