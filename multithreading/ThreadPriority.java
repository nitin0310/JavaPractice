package multithreading;

class C extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			try {
				System.out.println(i+" "+Thread.currentThread()+" "+Thread.currentThread().getPriority());
				Thread.sleep(500);		
			}catch(Exception e) {
				System.out.println(e.toString());
			}
		}
	}
}

public class ThreadPriority {
	public static void main(String args[]) {
		C obj1=new C();
		C obj2=new C();
		C obj3=new C();
		
		obj1.setName("Thread Obj1");
		obj2.setName("Thread Obj2");
		obj3.setName("Thread Obj3");
		
		//Priority : Min can be 1,Max can be 10 and Norm can be 5.
		obj1.start();
		try {
			obj1.sleep(200);;
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
		obj2.setPriority(10);
		obj2.start();
		obj3.start();
	}
}
