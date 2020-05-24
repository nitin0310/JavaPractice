package multithreading;

class Abc implements Runnable{
	
	//we must have to override run method
	public void run() {
		try {
			System.out.println("Run called");
		}catch(Exception e) {
			System.out.println("Exception caught"+e.toString());
		}
	}
}

public class RunnabeInterface {
	public static void main(String args[]) {
		
		Abc obj=new Abc();
		//  obj.start();		we don't call start using object of class A
		//	Thread obj2=new Thread(); //by this only a thread is created
		Thread obj3=new Thread(new Abc());
		obj3.start();
	}
}