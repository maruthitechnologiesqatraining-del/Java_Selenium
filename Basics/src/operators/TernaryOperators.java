package operators;

public class TernaryOperators {
	
	public static void main(String[] args) {
		
		//Check number even or odd
		int number = 29;
		if(number % 2 == 0) {
			System.out.println(number + " is Even");
		} else {
			System.out.println(number + " is Odd");
		}
		
		//Using Ternary Operator
		//syntax: condition ? expr1 : expr2
		String result = (number % 2 == 0) ? "Even" : "Odd";
		System.out.println(number + " is " + result);
	}

}
