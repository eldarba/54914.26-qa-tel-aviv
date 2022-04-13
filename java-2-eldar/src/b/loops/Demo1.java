package b.loops;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {

		// set a secret password
		int password = 123;
		// get a scanner for input
		Scanner sc = new Scanner(System.in);
		// prompt user to enter password
		System.out.print("enter password: ");
		// get the password from the user
		int input = sc.nextInt(); // input

		// while password is wrong ask again
		while (input != password) {
			System.out.print("enter password: ");
			input = sc.nextInt(); // input
		}

		sc.close();
		System.out.println("you are logged in");

	}

}
