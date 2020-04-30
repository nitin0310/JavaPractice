package anonymousObject;

public class AnonymousObject {
	
	void print() {
		System.out.println("Print called");
	}

	public static void main(String args[]) {
		new AnonymousObject().print(); 
		//anonymous object is created for only temporary purposes.To call for once.
	}
}
