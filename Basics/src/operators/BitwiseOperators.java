package operators;

public class BitwiseOperators {

	public static void main(String[] args) {
		// Bitwise operators are used to perform bit-level operations on integer types.
		
		int a = 5;  // In binary:  0101   0+4+0+1 =15
		int b = 3;  // In binary:  0011   0+0+2+1=3
		
		// Bitwise AND
		int andResult = a & b; // Result: 0001 (1 in decimal)
		System.out.println("Bitwise AND (a & b): " + andResult);
		
		// Bitwise OR
		int orResult = a | b; // Result: 0111 (7 in decimal)
		System.out.println("Bitwise OR (a | b): " + orResult);
		
		// Bitwise XOR
		int xorResult = a ^ b; // Result: 0110 (6 in decimal)
		System.out.println("Bitwise XOR (a ^ b): " + xorResult);
		
		// Bitwise NOT
		int notResult = ~a; // Result: 1010 (in two's complement, -6 in decimal)
		System.out.println("Bitwise NOT (~a): " + notResult);
		
		// Left Shift
		int leftShiftResult = a << 1; // Result: 1010 (10 in decimal)
		System.out.println("Left Shift (a << 1): " + leftShiftResult);
		
		// Right Shift
		int rightShiftResult = a >> 1; // Result: 0010 (2 in decimal)
		System.out.println("Right Shift (a >> 1): " + rightShiftResult);
	}
}
