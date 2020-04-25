package arrayProblems;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int a[]= {10,20,20,30,30,40,50,50};
		int n=a.length;
		int j=removeDuplicate(a,n);

		 for (int i=0; i<j;i++)  
	           System.out.print(a[i]+" ");  
	}
	
	static int removeDuplicate(int a[],int n) {
		int temp[] = new int[n];
		int j=0;
		
		if(n==0||n==1) {
			return n;
		}else {
			for(int i=0;i<n-1;i++) {
				if(a[i]!=a[i+1]) {
					temp[j++]=a[i];
				}
			}
			temp[j++] = a[n-1];  
		}
		
		for (int i=0; i<j; i++){  
            a[i] = temp[i];  
        }  
        return j;
		
		
	}

}
