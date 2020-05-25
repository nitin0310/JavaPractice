package multithreading;

class First extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			try {
				System.out.println(i+" "+Thread.currentThread());
				Thread.sleep(500);		//sleep for 500 milliseconds
			}catch(Exception e) {
				System.out.println(e.toString());
			}
		}
	}
}

public class JoinMethod{
	public static void main(String args[]) {
		First obj1=new First();
		First obj2=new First();
		First obj3=new First();
		
		obj1.start();	//call run method here
		try {
			//called after sleep(500) called
			obj1.join();		//now it run until the thread die
		}catch(Exception e) {
			System.out.println(e.toString());
		}
			//when thread1 die then they start executing
		obj2.start();
		obj3.start();
	}
}