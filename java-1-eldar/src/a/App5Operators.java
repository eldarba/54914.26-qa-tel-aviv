package a;

public class App5Operators {

	public static void main(String[] args) {
		
		// operators: + - * /
		// operands: 5 9 150
		// expressions: 150 + 36
		
		// ARITHMETICAL OPERATORS 
		System.out.println("============ ARITHMETICAL OPERATORS");
		System.out.println(5 + 3); // plus
		System.out.println(5 - 3); // minus
		System.out.println(5 * 3); // multiply
		System.out.println(5 / 3); // divide
		System.out.println(5 % 3); // modulus - returns the remainder of a division
		System.out.println(5 + " / " + 3 + " = " + (5/3) + " remainder: " + (5%3));
		
		System.out.println(5 / 3D); // to get a decimal result one of the operands must be decimal
		
		// LOGICAL OPERATORS
		System.out.println("============ LOGICAL OPERATORS");
		System.out.println(5 < 9);
		System.out.println(5 > 9);
		System.out.println(5 <= 9);
		System.out.println(5 >= 9);
		System.out.println(5 == 9);
		System.out.println(5 != 9);
		
		System.out.println("============ COMBINE LOGICAL OPERATORS");
		int minAge = 18;
		int maxAge = 120;
		int age = 35;
		// AND - find out if age is legal
		System.out.println(age >= minAge && age <= maxAge);
		// OR
		// AND - find out if age is illegal
		System.out.println(age < minAge || age > maxAge);
		
		
		
		
		

	}

}
