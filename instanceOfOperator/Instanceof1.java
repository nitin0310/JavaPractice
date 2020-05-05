package instanceOfOperator;

class G{}

class B extends G{}

public class Instanceof1 {

	public static void main(String[] args) {
		B obj =null;
		System.out.println(obj instanceof B);  //return false

	}

}
