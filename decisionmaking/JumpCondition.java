package decisionmaking;

public class JumpCondition {
	public static void main(String[] args) {
		
		for(int x=1;x<=7;x++) {
			if(x==3) {
				continue;
			} /*else if(x==2) {
				break;
			}*/
			else {
				System.out.println(x);
			}
		}
	}

}
