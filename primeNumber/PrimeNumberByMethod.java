package primeNumber;

import java.util.Scanner;

public class PrimeNumberByMethod {
	static int flag = 0;

	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number to check prime no.");
		int num = scan.nextInt();
		
		checkPrimeNumber(num);
	}
	
	static void checkPrimeNumber(int n) {
		if(n==0 || n==1) {
			System.out.println("Not a prime number.");
		}else {
			int temp = n/2;
			for(int i=2;i<=temp;i++) {
				if(n%i==0) {
					flag = 1;
				}else {
					flag = 0;
				}
			}
		}
		
		if(flag == 1) {
			System.out.println("Not a prime no.");
		}else {
			System.out.println("Prime no.");
		}
	}
}
