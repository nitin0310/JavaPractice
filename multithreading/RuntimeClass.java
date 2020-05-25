package multithreading;

public class RuntimeClass {
	public static void main(String args[]) {
		Runtime r=Runtime.getRuntime();
		
		System.out.println("Total memory "+r.totalMemory());
		System.out.println("Free memory "+r.freeMemory());
		System.out.println("Available precessors "+r.availableProcessors());
		System.out.println("Version "+r.version());
	}
}