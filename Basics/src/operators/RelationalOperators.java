package operators;

public class RelationalOperators {
	
	// Relational operators are used to compare string two values.
	
	public void relationalOpsTwoInt() {
		int x = 15;
		int y = 25;
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		System.out.println("x == y: " + (x == y)); // equal to returns boolean false
		System.out.println("x != y: " + (x != y)); // not equal to returns boolean true
		System.out.println("x > y: " + (x > y));   // greater than returns boolean false
		System.out.println("x < y: " + (x < y));   // less than returns boolean true
		System.out.println("x >= y: " + (x >= y)); // greater than or equal to returns boolean false
		System.out.println("x <= y: " + (x <= y)); // less than or equal to returns boolean true
		
		x = 15;
		y = 15;
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		System.out.println("x == y: " + (x == y)); // equal to returns boolean false
		System.out.println("x != y: " + (x != y)); // not equal to returns boolean true
		System.out.println("x > y: " + (x > y));   // greater than returns boolean false
		System.out.println("x < y: " + (x < y));   // less than returns boolean true
		System.out.println("x >= y: " + (x >= y)); // greater than or equal to returns boolean false
		System.out.println("x <= y: " + (x <= y)); // less than or equal to returns boolean true
	}
	
	public void relationalOpsTwoString() {
		String str1 = "Hello";
		String str2 = "World";
		
		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2);
		
		System.out.println("str1 == str2: " + (str1 == str2)); // equal to returns boolean false
		System.out.println("str1 != str2: " + (str1 != str2)); // not equal to returns boolean true
	}
		
	public static void main(String[] args) {		
		
		RelationalOperators relOps = new RelationalOperators();
		relOps.relationalOpsTwoInt();
	}

}
