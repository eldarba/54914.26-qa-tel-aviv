package b.functions;

public class App1 {

	public static void main(String[] args) {

		int x; // variable declaration is done only once
		// call the add method and get the result
		x = add(5, 6);
		// print
		System.out.println(x);

		// call the subtract method and get the result
		x = subtract(100, 70);
		// print
		System.out.println(x);

		// call the divide method and get the result
		double y = divide(10, 3);
		// print
		System.out.println(y);

	}

	// methods definition
	public static int add(int a, int b) {
		int result = a + b;
		return result;
	}

	public static int subtract(int a, int b) {
		int result = a - b;
		return result;
	}

	public static int multiply(int a, int b) {
		int result = a * b;
		return result;
	}

	public static double divide(double a, double b) {
		double result = a / b;
		return result;
	}
}
