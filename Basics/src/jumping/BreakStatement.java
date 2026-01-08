package jumping;

public class BreakStatement {
	
	public static void main(String[] args) {
		 for(int i=1; i<=10; i++) {
	           if(i==6) {
	               break; // exit the loop when i is 6
	           }
	           System.out.println("i is: " + i);
	       }

	}
}
