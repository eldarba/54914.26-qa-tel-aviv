package c.random;

public class App1 {

	public static void main(String[] args) {

		System.out.println(Math.PI);

		System.out.println(Math.random()); // 0.0 - 0.9999999999999
		System.out.println(Math.random() * 11); // 0.0 - 10.9999999999999
		System.out.println((int) (Math.random() * 11)); // 0 - 10

		System.out.println("========================");
		// create a random number from 0 to 10 inclusive
		int r = (int) (Math.random() * 11);
		// print the random number
		System.out.println(r);

	}

}
