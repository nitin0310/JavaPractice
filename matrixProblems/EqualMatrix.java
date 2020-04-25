package matrixProblems;

public class EqualMatrix {

	public static void main(String[] args) {
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int b[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int r=a.length,c=a[0].length;
		int flag = 0;
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(a[i][j]!=b[i][j]) {
					flag =1;
				}
			}
		}
		
		if(flag==1){
			System.out.println("Not equal");
		}else {
			System.out.println("Equal");
		}
	}

}
