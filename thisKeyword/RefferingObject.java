package thisKeyword;

class Abc{
	int a,b;
	Abc(int a,int b){
//		a=a;  Ambuiguity occur here
//		b=b;
		
		this.a=a;
		this.b=b;
	}
	
	void display() {
		System.out.println("a : "+a+" b : "+b);
	}
	
}

public class RefferingObject {
	public static void main(String args[]) {
		Abc obj=new Abc(10,20);
		obj.display();
	}

}
