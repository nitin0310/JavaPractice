package stringProblems;

public class CountDuplicate {

	public static void main(String[] args) {
		String str="Hello World";
		int n=str.length();
		char[] arr=str.toCharArray();
		char[] vis=new char[n];
		int temp=0;
		
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(arr[i]==arr[j]&& arr[j]!=vis[j]) {
					vis[temp]=arr[i];
					System.out.println(arr[i]);
				}
			}
		}
	}

}
