package datatypes;

public class ReservedKeywords {
	
	public void printConcatenateString(String a, String b) {
		//print added two strings
		System.out.println("Concatenate two strings :"+a+b);
	}
	public String concatenateString(String a,String b) {
		//should not use reserved keyword for example this keyword
		// String this = "Hello World!";
		//how to return value to method calling without using void 
		return a+" "+b;
	}
	
	public static void main(String[] args) {
		
		ReservedKeywords reserve = new ReservedKeywords();
		String c =reserve.concatenateString("Java", "Class");
		reserve.printConcatenateString("Hello", "Java");
		//created static method using static keyword , we can call without object reference
		
		
	}

}
