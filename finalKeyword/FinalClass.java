package finalKeyword;

class Fi{  //if class declared final,other classes can't extend them
	int i=10;
}

public class FinalClass extends Fi{
	public static void main(String args[]) {
		FinalClass obj=new FinalClass();
		System.out.println(obj.i);
	}
}
