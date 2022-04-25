package a.lines;

import a.lines.Line.Color;

public class LineTest3 {

	public static void main(String[] args) {
		// create an Object of type WLine
		WLine wLine = new WLine();

		// set all attributes
		wLine.setColor(Color.GREEN);
		wLine.setLength(15);
		wLine.setWidth(3);

		// get all attributes and print
		System.out.println("color: " + wLine.getColor());
		System.out.println("length: " + wLine.getLength());
		System.out.println("width: " + wLine.getWidth());

		// since we override the print method
		// we can now see the line width as well
		wLine.print();
	}

}
