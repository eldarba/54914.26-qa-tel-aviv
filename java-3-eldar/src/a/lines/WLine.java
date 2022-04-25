package a.lines;

public class WLine extends Line {

	private int width;

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	// override the print method
	void print() {
		System.out.println(getColor());
		for (int w = 0; w < width; w++) {
			for (int c = 0; c < getLength(); c++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}

}
