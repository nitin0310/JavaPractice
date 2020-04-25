package matrixProblems;

public class LowerTriangular {

	public static void main(String[] args) {
		int a[][]= {{1,0,0},{2,5,0},{4,2,1}};
		int r=a.length,c=a[0].length;
		int flag=0;
		if(r==c) {
			for(int i=0;i<r;i++) {
				for(int j=0;j<c;j++) {
					if(i<j && a[i][j]!=0) {
							flag = 1;
					}
				}
			}
		}else {
			System.out.println("Not a square matrix");
		}
		
		if(flag==1) {
			System.out.println("Not a lower triangular matrix");
		}else {
			System.out.println("Lower triangular matrix");
		}
	}

}
