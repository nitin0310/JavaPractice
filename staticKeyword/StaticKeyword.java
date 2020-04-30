package staticKeyword;

class Abc{
	
	int i=0;
	int b=19;
	static String str="Hello  java";
	
	Abc(int i,int j){
		this.i=i;
		this.b=j;
		System.out.println("i: "+i+" b: "+b+" str: "+str);
	}
}

public class StaticKeyword {
	public static void main(String args[]) {
		Abc obj=new Abc(10,20);
		Abc obj2=new Abc(12,23);
	}

}
