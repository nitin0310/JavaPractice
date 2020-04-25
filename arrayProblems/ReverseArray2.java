package arrayProblems;

public class ReverseArray2 {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6};
		
		System.out.println("Array : ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
		System.out.println("\nArray : ");
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+" ");
		}

	}

}
