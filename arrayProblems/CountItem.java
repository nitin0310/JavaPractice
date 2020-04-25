package arrayProblems;
import java.util.Scanner;

public class CountItem {

	public static void main(String args[]) {
		int a[] = {1,2,8,3,2,2,2,5,1};
		Scanner scan = new Scanner(System.in);
		
		int count=0;
		System.out.println("Enter number to count");
		int num=scan.nextInt();
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==num) {
				count++;
			}
		}
		if(count==0) {
			System.out.println("Single time");
		}else {
				System.out.println("Frequency :"+count);
		}
	}
}
