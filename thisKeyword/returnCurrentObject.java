package thisKeyword;

class Ab{
	
	Ab(){
		method();
	}
	
	Ab method() {
		return this;
	}
	
	void display() {
		System.out.println("Hello java");
	}
}

public class returnCurrentObject {
	public static void main(String args[]) {
		new Ab().method().display();
	}

}
