package c.arrays;

public class Demo1 {

	public static void main(String[] args) {

		// create an array of int (length 3)
		int[] arr = new int[3];

		// populate the array with data
		arr[0] = 7;
		arr[1] = -9;
		arr[2] = 11;

		// access the array elements (for print)
		System.out.println(arr[0]); // 7
		System.out.println(arr[1]); // -9
		System.out.println(arr[2]); // 11

		// System.out.println(arr[3]); // error - index 3 is out of array bounds

	}

}
