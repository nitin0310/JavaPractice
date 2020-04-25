package matrixProblems;

public class IdentityMatrix {

	public static void main(String[] args) {
		int a[][] = {{1,0,0},{0,1,0},{0,0,1}};
		int flag=1;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(i!=j && a[i][j]!=0) {
					flag = 0;
					break;
				}
				if(a[i][j]!=1 && i==j) {
					flag = 0;
					break;
				}
			}
		}
		
		if(flag==1) {
			System.out.println("Identity matrix");
		}else {
			System.out.println("Not an identity matrix");
		}
	}

}
