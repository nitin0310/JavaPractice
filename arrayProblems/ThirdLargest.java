package arrayProblems;

public class ThirdLargest {

	public static void main(String[] args) {
		int a[]= {23,45,32,11,4,13,7};
		int n=a.length;
		int temp;
		
		for(int j=0;j<n;j++) {
			for(int i=0;i<n-1;i++) {
				if(a[i]<a[i+1]) {
					temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
			}
		}
		
		
			System.out.print(a[2]+" ");
			System.out.println("\nSecond largest "+a[3]);

	}

}
