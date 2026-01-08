package datatypes;

public class StaticKeywords {
	public static  void printString(String c) {
		//Created static method called without object because static memory is allocated at compile time
		System.out.println("Concatenate two strings :"+c);
		
	}

	public static void main(String[] args) {
		//calling static method without object reference
		
		printString("Wlecome to java Program");
	}

}
