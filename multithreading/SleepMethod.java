package multithreading;

class X extends Thread{
	
	public void run() {
		for(int i=0;i<5;i++) {
			try {
				System.out.println(i+" sleep called");
				Thread.sleep(1500);//one thread suspended for 1.5sec and second started at that time
			}catch(InterruptedException e) {
				System.out.println(e.toString());
			}
		}
	}
	
}

public class SleepMethod {
	public static void main(String args[]) {
		
		X obj1=new X();
		X obj2=new X();
		
		obj1.start();
		//The run called and thread shifted to runnable state from created state
		obj2.start();
	}
}
