package a.lines;

import a.lines.Line.Color;

public class LineTest2 {

	public static void main(String[] args) {

		Line line = new Line();

		// set the color
		line.setColor(Color.YELLOW);
		// set the length
		line.setLength(12);

		// get the color
		System.out.println(line.getColor());
		// get the length
		System.out.println(line.getLength());

	}

}
