package matrixProblems;

public class OddAndEven {

	public static void main(String[] args) {
		int a[][]= {{1,2,3},{4,5,6},{7,4,3}};
		int r=a.length,c=a[0].length;
		int even=0,odd=0;
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(a[i][j]%2==0) {
					even++;
				}else {
					odd++;
				}
			}
		}
		
		System.out.println("odd : ");
		System.out.println(odd);
		System.out.println("even : ");
		System.out.println(even);
	}

}
