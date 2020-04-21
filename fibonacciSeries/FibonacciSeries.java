package fibonacciSeries;

public class FibonacciSeries {
	
	public static void main(String args[]) {
		
		int first=0,second=1;
		int temp;
		int i=1,count=10;
		
		for(i=1;i<=count;i++) {      //without recursion
			if(i==1) {
				System.out.print(first+" ");
			}else if(i==2) {
				System.out.print(second+" ");
			}else{
				temp = first+second;
				System.out.print(temp+" ");
				first = second;
				second = temp;
			}
		}
		
	}
}
