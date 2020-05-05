package superKeyword;

class X{
	int i=20;
}

class Y extends X{
	int i=40;
	Y(){
		System.out.println(super.i); //call parent class variable
	}
		
}

public class Super1 {
	public static void main(String args[]) {
		Y obj=new Y();
	}
}
