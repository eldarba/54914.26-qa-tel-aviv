package c;

import java.util.Scanner;

public class Tar1 {

	public static void main(String[] args) {

		// create scanner
		Scanner sc = new Scanner(System.in);
		// prompt user for age
		System.out.println("enter age 0 - 120");
		// get the age from user - input
		int age = sc.nextInt();
		// check if age is valid and print message
		if (age >= 0 && age <= 120) {
			System.out.println("age is valid");
		} else {
			System.out.println("age is not valid");
		}

		// print the age
		System.out.println("age: " + age);

		// close scanner
		sc.close();

	}

}
