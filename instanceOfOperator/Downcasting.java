package instanceOfOperator;

class Animal{
	
}

class Dog extends Animal{
	
	static void downcasting(Animal obj) {
		if(obj instanceof Dog) {
			Dog a=(Dog)obj;
			System.out.println("Downcasting performed");
		}
	}
}

public class Downcasting {

	public static void main(String[] args) {
		Animal obj=new Dog();
		System.out.println(obj instanceof Dog);
		System.out.println(obj instanceof Animal);
	}

}
