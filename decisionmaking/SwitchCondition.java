package decisionmaking;
import java.util.*;

public class SwitchCondition {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		
		switch(x) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("two");
			break;
		default:
			System.out.println("Enter 1 or 2");
		}
	}
}
