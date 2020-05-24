package multithreading;

class A extends Thread{
	
	public void run() {
		try {
			System.out.println("Run called");
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}
	
}

public class UsingThreadClass {
	public static void main(String args[]) {
		
		A obj=new A();
		obj.start();	//here we are extending Thread,so we have start method
		//when we call this run method called.
	}
}