package matrixProblems;

public class SparseMatrix {

	public static void main(String[] args) {
		int a[][] = {{1,4,5},{0,0,0},{0,4,0}};
		int count=0;
		int r=a.length;
		int c=a[0].length;
		 for(int i=0;i<r;i++) {
			 for(int j=0;j<c;j++) {
				 System.out.print(a[i][j]+" ");
			 }
			 System.out.println();
		 }
		 
		 for(int i=0;i<r;i++) {
			 for(int j=0;j<c;j++) {
				 if(a[i][j]==0) {
					 count++;
				 }
			 }
		 }
		 int n=(r*c);
		 if(count>(n/2)) {
			 System.out.println("Sparse matrix");
		 }else {
			 System.out.println("Not a sparse matrix");
		 }
	}

}
