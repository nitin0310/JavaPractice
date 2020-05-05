package interfaces;

interface W{
	default void print() {
		System.out.println("print");
	}
				//using default and static we can provide the implementation to methods of interface
	static void draw() {
		System.out.println("draw");
	}
	
}

class n implements W{
	//No need to provide implementation bcz already implemented
}

public class Implementation {

	public static void main(String[] args) {
		
	}

}
