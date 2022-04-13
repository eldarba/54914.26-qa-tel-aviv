package c.arrays;

public class Demo3 {

	public static void main(String[] args) {

		int[] arr = new int[5];
		arr[0] = 5;
		arr[1] = 15;
		arr[2] = 3;
		arr[3] = 900;
		arr[4] = 20;

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			int x = arr[i];
			System.out.println(x);
			// sum = sum + x;
			sum += x;
		}

		System.out.println("==============");
		System.out.println("sum is: " + sum);

	}

}
