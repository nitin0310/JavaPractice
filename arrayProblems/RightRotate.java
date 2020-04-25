package arrayProblems;

public class RightRotate {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		int n=a.length;
		int b[] = new int[n];
		for(int i=0;i<n;i++) {
			b[n-i-1]=a[i];
		}
		
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
	}

}
