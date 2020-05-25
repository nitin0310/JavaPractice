package multithreading;

public class GarbageCollection {
	
	//finalize method called just before garbage collector removes objects
	public void finalize() {
		System.out.println("finalize called");
	}
	
	public static void main(String args[]) {
		
		GarbageCollection obj1=new GarbageCollection();
		GarbageCollection obj2=new GarbageCollection();
		
		obj1=null;
		obj2=null;
		
		//object with null value
		//object without reference i.e obj1=obj2;Now no need for obj2
		//anonymous object
		
		//these above are deleted by garbage collector
		
		System.gc();//garbage collector called
	}
}
