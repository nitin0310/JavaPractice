package binding;

public class StaticBinding {
	int i=20;
	//member declared static,final or private always support static binding
	public static void main(String[] args) {
		StaticBinding obj=new StaticBinding();  //at compile time we know the binding
		System.out.println(obj.i);

	}

}
