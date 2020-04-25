package arrayProblems;

public class LeftRotate {
	
	public static void main(String args[]) {
		int a[] = {1,2,3,4,5};
		int la[] = new int[a.length];
		
		System.out.println("Array : ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
		int temp = a[0];
		for(int i=0;i<a.length;i++) {
			if(i==a.length-1) {
				a[i]=temp;
			}else {
				a[i]=a[i+1];
			}
		}
		
		System.out.println("\nArray : ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
