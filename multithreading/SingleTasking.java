package multithreading;

//Single tasking with multiple threads

class SingleClass extends Thread{
		public void run() {
			System.out.println("Run called");
		}
}

public class SingleTasking {
	public static void main(String args[]) {
		
		SingleClass obj1=new SingleClass();
		SingleClass obj2=new SingleClass();
		
		obj1.start();
		obj2.start();
		//the only need is to have multiple thread and single run method
	}
}
