package a;

public class App3 {

	public static void main(String[] args) {
		
		// ===== DATA TYPES =========
		System.out.println("=== integers");
		// numerals - integers
		byte x1 = 127;
		System.out.println(x1);
		
		short x2 = 9999;
		System.out.println(x2);
		
		int x3 = 999999999;
		System.out.println(x3);
		
		long x4 = 999999999999999999L;
		System.out.println(x4);
		
		System.out.println("=== decimals");
		// numerals - decimals
		float f1 = 5.33333333333333333333F;
		System.out.println(f1);
		
		double f2 = 5.33333333333333333333;
		System.out.println(f2);
		
		System.out.println("=== characters");
		// text
		char c1 = 'A';
		char c2 = 'B';
		char c3 = '1';
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3); 

		// String is an object - not a primitive
		String sentence = "this is a sentence";
		System.out.println(sentence);
		
		System.out.println("=== logical");
		// logical
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = 10 > 100; // calculated to false
		boolean b4= 10 < 100; // calculated to true
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		// ===== ========== =========
	}

}
