package matrixProblems;

public class SumOfRAndC {

	public static void main(String[] args) {
		
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int r=a.length,c=a[0].length;
		for(int i=0;i<r;i++) {
			int sum=0;
			for(int j=0;j<c;j++) {
				sum=(a[i][j])+sum;
			}
			System.out.println("Sum of row "+(i+1)+" : "+sum);
		}
		
		System.out.println();
		for(int i=0;i<r;i++) {
			int sum=0;
			for(int j=0;j<c;j++) {
				sum=(a[j][i])+sum;
			}
			System.out.println("Sum of column "+(i+1)+" : "+sum);
		}

	}

}
