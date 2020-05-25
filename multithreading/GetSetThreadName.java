package multithreading;

class Z extends Thread{
	public void run() {
		for(int i=1;i<=4;i++) {
			try {
				System.out.println(i+" "+Thread.currentThread());
				Thread.sleep(500);
			}catch(Exception e) {
				System.out.println(e.toString());
			}
		}
	}
}

public class GetSetThreadName {
	public static void main(String args[]) {
		Z obj1=new Z();
		Z obj2=new Z();
		
		obj1.setName("Thread Obj1");
		obj2.setName("Thread Obj2");
		
		obj1.start();
		try {
			obj1.sleep(200);;
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		obj2.start();
	}
}
