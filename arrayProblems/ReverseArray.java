package arrayProblems;

public class ReverseArray {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6};
		int n = a.length;  			//6
		int b[] = new int[n];
		
		System.out.print("Array :");
		
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
		
		for(int i=n-1;i>=0;i--) {
			int j=n-1-i;
			b[j]=a[i];
		}
		
        System.out.print("\nReverse Array :");
		
		for(int i=0;i<n;i++) {
			System.out.print(b[i]+" ");
		}
	}
	
}