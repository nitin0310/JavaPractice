package instanceOfOperator;

class Hj{
	
}

class Jh extends Hj{
	
}

public class InstanceOf2 {

	public static void main(String[] args) {
		Hj obj=new Jh();
		System.out.println(obj instanceof Jh);  //return true

	}

}
