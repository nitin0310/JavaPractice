package multithreading;

//for this multitasking we must have different classes and their objects

class A1 extends Thread{
	public void run() {
		System.out.println("run called class A1");
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			System.out.println(e.toString());
		}
		for(int i=1;i<=5;i++) {
			System.out.println(i);
		}
	}
}

class A2 extends Thread{
	public void run() {
		System.out.println("run called class A2");
		for(int i=6;i<=10;i++) {
			System.out.println(i);
		}
	}
}

public class Multitasking {
	public static void main(String args[]) {
		A1 obj1=new A1();
		A2 obj2=new A2();
		
		obj1.start();
		obj2.start();
	}
}
