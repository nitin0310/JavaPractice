package arrayProblems;

public class SumOfElements {

	public static void main(String[] args) {
		int sum=0;
		int a[]= {1,4,6,2,5,8};
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		
		System.out.println(sum);
	}

}
