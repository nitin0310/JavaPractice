package finalKeyword;

class S{
	final static int i; //final static blank variable can only be initialized inside static block
	static {i=50;}
}

public class Final4 {
	public static void main(String args[]) {
		S obj=new S();
		System.out.println(obj.i);
	}
}
