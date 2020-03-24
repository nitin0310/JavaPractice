package datatypes;

//Enums are used when we know what are the actual values
//Enum outside class
enum Color{
	GREEN("green"),RED("red"),BLUE("blue");
	
public String str;
	
	private Color(String str){
		this.str = str;
	}
	
	public String getColor() {
		return this.str;
	}
}

public class EnumCreation {
	
//Enum inside class
enum Car{
	SWIFT,BRIO,ALTO;
}

	public static void main(String[] args) {
		
		Color[] clr = Color.values();
		for(Color x:clr) {
			System.out.println(x.getColor());
		}
	}
}
