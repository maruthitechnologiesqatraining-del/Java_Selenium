package LoopingStatement;

public class forloops {
	
	
	//print chars of A-Z using for loop
	public void printChars() {
		for(int c='A';c<='Z';c++) {
			//Converting to int data type to char data type
			System.out.println("Chars are:"+ (char)c +":"+" ASCII value is:"+c);
			
		}
		System.out.println("***********************");
		//print chars of A-Z using for loop
		for(char c='A';c<='Z';c++) {
			//Converting to char data type to int data type
			System.out.println("Chars are:"+c +":"+" ASCII value is:"+(int)c);
			
		}
		System.out.println("***********************");
		//print chars of a-z using for loop
		//Converting to int data type to char data type
		for(int c='a';c<='z';c++) {
			System.out.println("Chars are:"+ (char)c +":"+" ASCII value is:"+c);
		}
		System.out.println("***********************");
		//Converting to char data type to int data type
		for(char c='a';c<='z';c++) {
			System.out.println("Chars are:"+c +":"+" ASCII value is:"+(int)c);
		}
		System.out.println("***********************");
		
		//print Ascci value of 1-9
		//Converting to int data type to char data type
		for(int c='1';c<='9';c++) {
			System.out.println("ASCII value of "+(char)c+" is:"+c);
		}
		System.out.println("***********************");
		//Converting to char data type to int data type
		//print Ascci value of 1-9
		System.out.println("***********************");
		for(char c='1';c<='9';c++) {
			System.out.println("ASCII value of "+(char)c+" is:"+(int)c);
		}
	}
	
	
	
	
	public static void main(String[] args) {
		forloops loop = new forloops();
		loop.printChars();
		
//		int i=0;
//		for(i=0;i<=10;i++) {
//			System.out.println("Value of i:"+i);
//		}
//		//for each method
////		for(int j=0:10) {
////			
////		}
//		int j=0;
//		while(j<=20) {
//			System.out.println("Value of j:"+j);			
//			j=j++;
//		}
//		int a=8;
//		do {
//			if(a>5)
//			System.out.println("Value of a:"+a);
//			a+=5;
//		}while(a<100);
	}

}
