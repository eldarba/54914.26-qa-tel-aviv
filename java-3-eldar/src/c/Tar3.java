package c;

import java.util.Arrays;

public class Tar3 {

	public static void main(String[] args) {

		// create array
		int[] arr = new int[25];
		int sum = 0;

		// iterate elements
		for (int i = 0; i < arr.length; i++) {
			// assign random values
			int r = (int) (Math.random() * 101);
			arr[i] = r;
			sum += r;
		}

		// print all elements
		System.out.println(Arrays.toString(arr));
		// print elements sum
		System.out.println("sum: " + sum);
		// print elements average
		double avg = (double) sum / arr.length;
		System.out.println("avg: " + avg);

	}

}
