package matrixProblems;

public class UpperTriangular {

	public static void main(String[] args) {
		int a[][]= {{1,2,3},{0,3,5},{0,0,2}};
		int r=a.length,c=a[0].length;
		int flag=0;
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(j<i && a[i][j]!=0) {
					flag=1;
				}
			}
		}
		if(flag==1) {
			System.out.println("Not a upper triangular matrix");
		}else {
			System.out.println("Upper triangular matrix");
		}
	}

}
