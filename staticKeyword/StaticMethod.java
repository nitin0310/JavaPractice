package staticKeyword;

class Abs{
	int a=10;
	static String str="Hello";
	
	Abs(int i){
		this.a=i;
		System.out.println("a: "+a+" str: "+str);
	}
	
	static void change() {
		str="Java";
	}
}

public class StaticMethod {
	public static void main(String args[]) {
		Abs obj=new Abs(10);
		Abs.change();
		Abs obj2=new Abs(20);
	}

}
