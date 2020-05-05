package finalKeyword;

class R{
	void print(final int i) {  //can't change value of final parameter
		//i=i+i;
		System.out.println(i);
	}
}

public class Final5 {

	public static void main(String[] args) {
		R obj=new R();
		obj.print(10);

	}

}
