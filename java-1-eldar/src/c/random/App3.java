package c.random;

import java.util.Scanner;

public class App3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("enter 1st number: ");
		int a = sc.nextInt();
		System.out.print("enter 2nd number: ");
		int b = sc.nextInt();
		sc.close();
		System.out.println(a + " + " + b + " = " + (a + b));

	}

}
