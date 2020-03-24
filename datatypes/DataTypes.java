package datatypes;

//primitive types- byte,short,int,long,char,boolean,float,double
//non-primitive- array,String,class,object,interface

public class DataTypes {
	
	public static void main(String[] args) {
		//boolean data type
		boolean a = true;
		if(a == true)
			System.out.println("Statement is true");
		
	//Numeral data type
		//Character data type
		char b = 'N';
		System.out.println("Character is "+b);
		
	//Integral data type
		//Integer data types
		
		//1. Byte data type
		byte c = 10;
		System.out.println("Byte value : "+c);
		
		//2.Short data type
		short d = 20;
		System.out.println("Short value : "+d);
		
		//3.Int data type
		int e = 30;
		System.out.println("Int value : "+e);
		
		//Long data type
		long f = 40;
		System.out.println("Long value "+f);
		
	//Decimal data types
		//1.Float data type
		float g = 10.5f;
		System.out.println("Float value : "+g);
		
		//2.Double data type
		double h = 20.55;
		System.out.println("Double value : "+h);
		
	//Non primitive data types or derived data types
		//1.Strings
		String i = "String added";
		System.out.println("Value : "+i);
		
		//2.Arrays
		int arr[] = {10,20,30};
		for(int x:arr) {
			System.out.print(x+" ");
		}
		
		//etc.
	}

}
