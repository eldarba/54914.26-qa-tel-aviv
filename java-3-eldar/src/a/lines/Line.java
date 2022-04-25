package a.lines;

public class Line {

	private String color;
	private int length;

	void print() {
		System.out.println(color);
		for (int c = 0; c < length; c++) {
			System.out.print("*");
		}
		System.out.println();
	}

	// access to attributes using get / set methods
	public void setColor(String color) {
		this.color = color;
	}

	public void setLength(int length) {
		if (length >= 0) {
			this.length = length;
		}
	}

}
