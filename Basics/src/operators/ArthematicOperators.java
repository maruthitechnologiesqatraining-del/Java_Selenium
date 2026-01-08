package operators;

public class ArthematicOperators {

		//Java program to demonstrate Arthematic Operators
		//Operators are in arthematic operators: +, -, *, /, %
	public float add(float a, int b) {
		return a+b;
	}
	
	public String addTwoStrings(String str1, String str2) {
		return str1+str2;
	}
	
	public int addTwoChars(char ch1, char ch2) {
		System.out.println("Char1 ASCII value:"+ (int)ch1);
		System.out.println("Char2 ASCII value:"+ (int)ch2);
		System.out.println("Sum of two char ASCII value:" +((int)ch1+(int)ch2));
		return ch1+ch2;
	}
	
	public int subtract(int a, int b) {
		return a-b;
	}
	
	public int multiply(int a, int b) {
		return a*b;
	}
	
	public float divide(float a, float b) {
		return a/b;
	}
	
	public int modulus(int a, int b) {
		return a%b;
	}
	
	public static void main(String[] args) {
		
		ArthematicOperators arthematic = new ArthematicOperators();
		float added =arthematic.add(12.5f, 10);
		System.out.println("Addition of float and int value:"+added);
		
		String str = arthematic.addTwoStrings("Chinki", " Minki");
		System.out.println("Addition of two strings:"+str);
		
		int c = arthematic.addTwoChars('A', 'a');
		System.out.println("Addition of two char value:"+c);
		
		int substract = arthematic.subtract(20, 10);
		System.out.println("Subtraction of two int value:"+substract);
		
		int multiply = arthematic.multiply(5, 4);
		System.out.println("Multiplication of two int value:"+multiply);
		
		float divide = arthematic.divide(25.5f, 5.0f);
		
		System.out.println("Division of two float value:"+divide);
		int modulus = arthematic.modulus(29, 5);
		System.out.println("Modulus of two int value:"+modulus);
	}

}
