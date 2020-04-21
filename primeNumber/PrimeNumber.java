package primeNumber;

public class PrimeNumber {
	public static void main(String args[]) {
		
		int num = 17;
		int n=num/2;
		int flag=0;
		
		for(int i=2;i<=n;i++) {
			if(num%i==0) {
				flag = 1;
				break;
			}
		}
		
		if(flag == 1) {
			System.out.println("Not a prime no.");
		}else {
			System.out.println("Prime no.");
		}
	}

}
