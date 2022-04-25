package b.exceptions;

import java.util.Arrays;
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		// create an array of 10 int elements
		int[] arr = new int[10];
		// create a scanner to get input from user
		Scanner sc = new Scanner(System.in);
		// prompt user to enter a number
		System.out.print("enter a number: ");
		// get the number from user
		int number = sc.nextInt();
		// prompt user to enter an index
		System.out.print("enter index 0 - 9: ");
		// get the index from user
		int index = sc.nextInt();
		// close the scanner
		sc.close();

		try {
			// try to insert the number in the right index
			arr[index] = number;
		} catch (Exception e) {
			// this code will run only in case of error
			System.out.println("you entered wrong index: " + index);
		}

		// print the array
		System.out.println(Arrays.toString(arr));

	}

}
