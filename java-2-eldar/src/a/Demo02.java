package a;

import java.util.Scanner;

public class Demo02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number: ");
		int x = sc.nextInt();
		System.out.println(x);
		sc.close();

		if (x > 5) {
			System.out.println("Big");
		} else {
			System.out.println("small");
		}

	}

}
