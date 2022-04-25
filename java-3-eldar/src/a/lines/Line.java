package a.lines;

public class Line {

	String color;
	int length;

	void print() {
		System.out.println(color);
		for (int c = 0; c < length; c++) {
			System.out.print("*");
		}
		System.out.println();
	}

}
