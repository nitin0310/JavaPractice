package arrayProblems;

public class TransposeOfMatrix {

	public static void main(String[] args) {
		
		int a[][] = {{2,3,4},{7,8,9},{5,6,9}};
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("\nTranspose of matrix");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(a[j][i]+" ");
			}
			System.out.println();
		}
	}

}
