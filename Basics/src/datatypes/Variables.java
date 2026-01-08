package datatypes;

public class Variables {
	static String s="S";
	public static void main(String[] args) {
		System.out.println("Welcome to java");
		
		byte b=11; //8bit values 10101010
		short c = 12; //16bit values 101011010101010
		int a=10;  // 32 bit values 101011010101010101011010101010
		long d = 23; //64 bit values 101011010101010101011010101010101011010101010101011010101010
		
		System.out.println("Byte value:"+ b);
		System.out.println("Short value:"+ c);
		System.out.println("Int value:"+ a);
		System.out.println("long value:"+ d);
		//type casting long value to convert float
		System.out.println("long value to convert float:"+(float)d);
		
		float e=30.334455f;
		double f= 39.55669999949494944949;
		System.out.println("float value:"+ e);
		//type casting float value to convert int
		System.out.println("float Convert to int  value:"+ (int)e);
		System.out.println("double value:"+ f);
		//type casting double value to convert int
		System.out.println("double Convert to int  value:"+ (int)f);
		
		//boolean datatypes have two values true or false
		
		boolean flag = true;
		boolean flagfalse = false;
		
		System.out.println("boolean true  value:"+flag);
		System.out.println("boolean false  value:"+flagfalse);
		
		//char datatype 8bit values 10101010
		char ch='s';
		System.out.println("Character datatype  value:"+ch);
		
	}
	
}
