package finalKeyword;

public class FinalVariable {
	
	final int i=30;
	
	public static void main(String args[]) {
		FinalVariable obj=new FinalVariable();
		System.out.println(obj.i);
		//obj.i=40;   can't change once final variable initialized
	}
}
