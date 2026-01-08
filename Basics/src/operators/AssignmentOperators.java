package operators;

public class AssignmentOperators {

	public void assignmentOps() {
		int a = 10;
		System.out.println("Initial value of A: " + a);
		
		a += 5; // a = a + 5
		System.out.println("After A += 5: " + a); //print 15
		
		a -= 3; // a = a - 3 (12=15-3)
		System.out.println("After A -= 3: " + a); //print 12
		
		a *= 2; // a = a * 2  (24=12*2)
		System.out.println("After A *= 2: " + a); //print 24
		
		a /= 4; // a = a / 4 (6=24/4)
		System.out.println("After A /= 4: " + a); //print 6
		
		a %= 3; // a = a % 3 (0=6%3)
		System.out.println("After A %= 3: " + a); //print 0
	}
	
	public static void main(String[] args) {
		AssignmentOperators assignOps = new AssignmentOperators();
		assignOps.assignmentOps();
	}
}
