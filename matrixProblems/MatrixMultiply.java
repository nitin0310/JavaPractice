package matrixProblems;

public class MatrixMultiply {

	public static void main(String[] args) {
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int b[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int r=a.length,c=a[0].length;
		int d[][]=new int[r][c];
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Product : ");
		for(int k=0;k<r;k++) {
			for(int i=0;i<r;i++) {
				int sum=0;
				for(int j=0;j<c;j++) {
					sum = (a[k][j]*b[j][i])+sum;
				}
				d[k][i]=sum;
			}
		}
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(d[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
