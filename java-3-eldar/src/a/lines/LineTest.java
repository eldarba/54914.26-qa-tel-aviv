package a.lines;

public class LineTest {

	public static void main(String[] args) {

		// create a Line object
		Line myLine = new Line();

		// set color
		// myLine.color = "Red";
		myLine.setColor("Red");
		// set length
		// myLine.length = -7;
		myLine.setLength(5);
		// use the print method
		myLine.print();

		// this call will NOT change the length
		myLine.setLength(-5);
		myLine.print();
		// this call WILL change the length
		myLine.setLength(3);
		myLine.print();

	}

}
