package primeNumber;
import java.util.Scanner;

public class PrimeNoBtwNumbers {
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number");
		int first = scan.nextInt();
		System.out.println("Enter second number");
		int second = scan.nextInt();
		
		printPrimeNumbers(first,second);
		
	}
	
	static void printPrimeNumbers(int a,int b) {
		for(int i=a;i<=b;i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
			}
		}
	}
	
	static boolean isPrime(int num) {
		if(num<2) {
			return false;
		}
			int n=num/2;
			for(int i=2;i<=n;i++) {
				if(num%i==0) {
					return false;
				}
			}
			return true;
	}

}
