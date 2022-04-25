package a.lines;

public class Line {

	private Color color;
	private int length;

	public enum Color {
		BLACK, WHITE, RED, GREEN, BLUE, YELLOW
	}

	void print() {
		System.out.println(color);
		for (int c = 0; c < length; c++) {
			System.out.print("*");
		}
		System.out.println();
	}

	// access to attributes using get / set methods
	public void setColor(Color color) {
		this.color = color;
	}

	public void setLength(int length) {
		if (length >= 0) {
			this.length = length;
		}
	}

	public Color getColor() {
		return color;
	}

	public int getLength() {
		return length;
	}
}
