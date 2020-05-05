package interfaces;

interface I1{
	void i1();
}

interface I2 extends I1{
	void i2();
}

class Xyz implements I2{
	
	public void i1() {
		System.out.println("i1 implemented");
	}
	public void i2() {
		System.out.println("i2 implemented");
	}
}


public class InterfaceInheritance {

	public static void main(String[] args) {
		Xyz obj=new Xyz();
		obj.i1();
		obj.i2();

	}

}
