package multithreading;

class Y implements Runnable{
	public void run() {
		try {
			System.out.println("run called");
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}
}

public class ThreadTwice{
	public static void main(String args[]) {
		Y obj=new Y();
		Thread t=new Thread(obj);
		t.start();
//		t.start();		can't call a thread twice else it will throw exception IllegalThreadStateException
	}
}