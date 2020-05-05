package package4;
import package3.Ab;

class Xy extends Ab{		//we can access by inheriting class Ab of package3 declared protected
	public static void main(String args[]) {
		Xy obj=new Xy();
		obj.msg();		//it is accessible
	}
}
