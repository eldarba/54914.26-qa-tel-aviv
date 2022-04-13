package d.oop.lines;

public class Line {

	// hide the field
	private int length;

	// add 2 functions
	// function 1 - set the length
	public void setLength(int length) {
		if (length >= 0) {
			this.length = length;
		} else {
			System.out.println("setLength failed - length must not negative");
		}
	}

	// function 2 - get the length
	public int getLength() {
		return this.length;
	}

	void print() {
		for (int i = 0; i < length; i++) {
			System.out.print(" * ");
		}
		System.out.println();
	}

}
