package encapsulatoin;

class Test{
	private int i=10;
	
	public int getValue() {
		return i;
	}
	
	public void setValue(int a) {
		this.i=a;
	}
}

public class Mainclass {
	public static void main(String[] asrgs) {
		Test obj=new Test();
		System.out.println(obj.getValue());
		obj.setValue(20);
		System.out.println(obj.getValue());
	}
}
