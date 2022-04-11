package a;

import java.util.Scanner;

public class App6IO {

	public static void main(String[] args) {
		
		// perform an input from user
		// to perform input we need a special object
		// the input is called Scanner
		// it is defined in the class: java.util.Scanner
		
		// to create an object we use the new keyword
		Scanner scanner = new Scanner(System.in); // scanner connected to keyboard
		System.out.print("enter your name: ");
		String userName = scanner.nextLine(); // input command - the program stops and wait for the input
		System.out.println("Hello " + userName);
		scanner.close(); // scanner is a resource that should be closed
		

	}

}
