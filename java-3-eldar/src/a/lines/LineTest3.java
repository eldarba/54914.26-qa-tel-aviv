package a.lines;

import a.lines.Line.Color;

public class LineTest3 {

	public static void main(String[] args) {
		WLine wLine = new WLine();
		wLine.setColor(Color.GREEN);
		wLine.setLength(15);
		// set the width
		wLine.setWidth(3);

		// get all
		System.out.println("color: " + wLine.getColor());
		System.out.println("length: " + wLine.getLength());
		System.out.println("width: " + wLine.getWidth());
	}

}
