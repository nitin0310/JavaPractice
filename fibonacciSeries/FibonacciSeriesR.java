package fibonacciSeries;

public class FibonacciSeriesR {

	static int first=0,second=1,temp;
	
	public static void main(String[] args) {
		int count=10;
		System.out.print(first+" "+second+" ");
		fibonacciRecursion(count-2);
		
	}
	
	static void fibonacciRecursion(int num) {
		if(num>0) {
			temp = first+second;
			first = second;
			second = temp;
			System.out.print(temp+" ");
			fibonacciRecursion(num-1);
		}
		
	}

}
