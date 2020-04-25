package matrixProblems;

public class TransposeMatrix {

	public static void main(String[] args) {
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int r=a.length,c=a[0].length;
		int b[][] = new int[r][c];
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Transpose : ");
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				b[i][j]=a[j][i];
			}
		}
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}

}
