package c.arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) throws FileNotFoundException {

		File file = new File("files/price-list.txt");
		Scanner sc = new Scanner(file);

		// create an array
		double[] prices = new double[5];

		// get the prices from the file and put in the array
		for (int i = 0; i < prices.length; i++) {
			prices[i] = sc.nextDouble();
		}
		sc.close();

		double sum = 0;
		for (int i = 0; i < prices.length; i++) {
			System.out.println(prices[i]);
			sum += prices[i];
		}

		double avg = sum / prices.length;

		System.out.println("price avg is: " + avg);

	}

}
