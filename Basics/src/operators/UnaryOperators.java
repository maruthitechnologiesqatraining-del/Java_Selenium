package operators;

public class UnaryOperators {

	public void unaryOps() {
		int a=+10;
		System.out.println("Value of A:"+a);
		int b= -a;
		System.out.println("Negative Value of A:"+b);
		System.out.println("***********************");
		//post increment
		System.out.println("Post Increment Value of A:"+(a++));
		System.out.println("Value of A after Post Increment:"+a);
		System.out.println("***********************");
		//pre increment
		System.out.println("Pre Increment Value of A:"+(++a));
		System.out.println("Value of A after Pre Increment:"+a);
		System.out.println("***********************");
		//post decrement
		System.out.println("Post Decrement Value of A:"+(a--));
		System.out.println("Value of A after Post Decrement:"+a);
		System.out.println("***********************");
		//pre decrement
		System.out.println("Pre Decrement Value of A:"+(--a));
		System.out.println("Value of A after Pre Decrement:"+a);
	}
	
	public void doubleIncrement() {
		int x=5;
		System.out.println("Initial value of X:"+x);
		int y=++x + x++;
		System.out.println("Value of Y after double pre increment:"+y);
		System.out.println("Value of X after double pre increment:"+x);
	}
	
	public void doubleDecrement() {
		int m=5;
		System.out.println("Initial value of M:"+m);
		int n=--m + m--;
		System.out.println("Value of N after double pre decrement:"+n);
		System.out.println("Value of M after double pre decrement:"+m);
	}
	
	public void negationOperator() {
		System.out.println("***********************");
		boolean flag = true;
		System.out.println("Initial value of flag:"+flag);
		System.out.println("Negation value of flag:" + !flag);
		flag = !flag;
		System.out.println("***********************");
		
		boolean status = false;
		System.out.println("Initial value of status:"+status);
		
		if(flag==status) {
			System.out.println("Both are equal");	
			}else {
				System.out.println("Both are not equal");
			
			}
		
	}
	
	public void nagationOperatorforInteger() {
		System.out.println("***********************");
		int p=10;
		System.out.println("Initial value of P:"+p);
		System.out.println("Negation value of P:" + -p);
		if(p!=-p) {
			System.out.println("Both are not equal");	
			}else {
				System.out.println("Both are equal");
			
			}
	}
	
	public void nagationOperatorforString() {
		System.out.println("***********************");
		String str="Hello";
		System.out.println("Initial value of str:"+str);
		//System.out.println("Negation value of str:" + -str); //not applicable for string
		
		if(str!="Hello") {
			System.out.println("Both are not equal");	
			}else {
				System.out.println("Both are equal");
			
			}
	}
	
	public void bitwiseComplementOperator() {
		System.out.println("***********************");
		int q=10;
		System.out.println("Initial value of Q:"+q);
		System.out.println("Bitwise Complement value of Q:" + ~q);
	}
	public static void main(String[] args) {
		
		UnaryOperators unary = new UnaryOperators();
		unary.unaryOps();
		unary.doubleIncrement();
		unary.doubleDecrement();
		
		unary.negationOperator();
		unary.nagationOperatorforInteger();
		unary.nagationOperatorforString();
		unary.bitwiseComplementOperator();
		
	}
}
