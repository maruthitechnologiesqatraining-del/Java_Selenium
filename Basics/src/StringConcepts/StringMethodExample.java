package StringConcepts;

public class StringMethodExample {
	String str = "Hello, World!";
	public void charAtExample() {		
		char ch = str.charAt(7); //getting character at index 7
		System.out.println("Character at index 7: " + ch);
		for(int i=0; i<str.length(); i++) {
			System.out.println("Character at index " + i + ": " + str.charAt(i));
		}
	}
	public void codeAtPointExample() {		
		int codePoint = str.codePointAt(7); //getting Unicode code point at index 7
		System.out.println("Unicode code point at index 7: "+str.charAt(7)+":" + codePoint);
		for(int i =0;i<str.length();i++) {
			System.out.println("Unicode code point at index " + i + ": "+str.charAt(i)+":" + str.codePointAt(i));
		}
	}
	public void codePointBeforeExample() {		
		int codePoint = str.codePointBefore(7); //getting Unicode code point before index 7
		System.out.println("Unicode code point before index 7: "+str.charAt(6)+":" + codePoint);
		for(int i =1;i<str.length();i++) {
			System.out.println("Unicode code point before index " + i + ": "+str.charAt(i-1)+":" + str.codePointBefore(i));
		}
	}
	public void codePointCountExample() {		
		int count = str.codePointCount(3, str.length()-2); //getting Unicode code point count in the string
		System.out.println("Unicode code point count in the string: " + count);
	}
	
	public void compareToExample() {		
		String a= "Java" ;
		String b = "java";
		int result = a.compareTo(b); //comparing two strings lexicographically
		System.out.println("Comparison result between \"" + a + "\" and \"" + b + "\": " + result); //0-equal, +ve-a>b, -ve-a<b
	}
	
	public void compareToIgnoreCaseExample() {		
		String a= "java" ;
		String b = "JAVA";
		int result = a.compareToIgnoreCase(b); //comparing two strings lexicographically ignoring case - not compare lower and upper case
		System.out.println("Comparison result between \"" + a + "\" and \"" + b + "\" (ignoring case): " + result); //0-equal, +ve-a>b, -ve-a<b
	}
	
	public void addTwoStringsExample() {		
		String a= "Hello, " ;
		String b = "World!";
		String result = a.concat(b); //adding two strings
		System.out.println("Result after adding \"" + a + "\" and \"" + b + "\": " + result);
	}
	
	public void containsExample() {		
		String a= "Hello, World!" ;
		String b = "World";
		boolean result = b.contains(a); //checking if string contains a specific sequence of characters -return true or false
		System.out.println("Does \"" + a + "\" contain \"" + b + "\"? " + result);
		boolean result2 = a.contains(b);
		System.out.println("Does \"" + b + "\" contain \"" + a + "\"? " + result2);
	}
	public void contentEqualsExample() {		
		String a = "Hello, World!" ;
		String b = "Hello, World!";
		boolean result = a.contentEquals(b); //checking if two strings have the same content - return true or false
		System.out.println("Does \"" + a + "\" content equal to \"" + b + "\"? " + result);
	}
	
	public void copyValueOfExample() {
		String str = "Hello, World!";
		//['H', 'e', 'l', 'l', 'o', ',', ' ', 'W', 'o', 'r', 'l', 'd', '!']
		char[] charArray = str.toCharArray(); //converting string to character array
		String newStr = String.copyValueOf(charArray, 0,5); //creating string from character array (array, start index, length)
		System.out.println("New string from character array: " + newStr);
	}
	
	public void toCharArrayExample() {
		String str = "Hello, World!";
		//['H', 'e', 'l', 'l', 'o', ',', ' ', 'W', 'o', 'r', 'l', 'd', '!']
		char arr[] = str.toCharArray();
		for(int i =0; i<arr.length;i++) {
			System.out.println("Character at index " + i + ": " + arr[i]);
		}
		
	}
	
	public void endsWithExample() {
		String str ="https://in.bookmyshow.com/explore/home/hyderabad";
		boolean present = str.endsWith("hyderabad"); //checking if string ends with specific sequence of characters
		System.out.println("Does the string end with 'hyderabad'? " + present);
	}
	
	public static void main(String[] args) {
		
		StringMethodExample example = new StringMethodExample();
//		example.charAtExample();
//		example.codeAtPointExample();
//		example.codePointBeforeExample();
//		example.codePointCountExample();
		example.compareToExample();
		example.compareToIgnoreCaseExample();
		example.addTwoStringsExample();
		example.containsExample();
		example.contentEqualsExample();
		example.copyValueOfExample();
		example.toCharArrayExample();
		example.endsWithExample();
	}
}
