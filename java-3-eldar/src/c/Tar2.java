package c;

import java.util.Scanner;

public class Tar2 {

	public static void main(String[] args) {

		// create scanner
		Scanner sc = new Scanner(System.in);
		// get input from user
		System.out.print("enter 1st number: ");
		int a = sc.nextInt();
		System.out.print("enter 2nd number: ");
		int b = sc.nextInt();
		System.out.print("enter 3rd number: ");
		int c = sc.nextInt();
		// calculate sum and average
		int sum = a + b + c;
		double avg = sum / 3D;
		// print results
		System.out.println("sum: " + sum);
		System.out.println("average: " + avg);
		// close scanner
		sc.close();

	}

}
