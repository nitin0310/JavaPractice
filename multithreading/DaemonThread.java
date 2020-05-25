package multithreading;

class F extends Thread{
	public void run() {
		try {
			if(Thread.currentThread().isDaemon()) {
				System.out.println("Daemon thread");
			}else {
				System.out.println("Not daemon thread");
			}
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}
}

public class DaemonThread {
	
	//java daemon threads running automatically e.g. gc, finalizer etc.
	
	public static void main(String args[]) {
		F obj1=new F();
		F obj2=new F();
		
		obj1.start();
		obj1.setDaemon(true);
		
		obj2.start();
		//can't declare any thread daemon once started or entered in runnable state  i.e obj2.setDaemon(true) X
		
		
	}
}
