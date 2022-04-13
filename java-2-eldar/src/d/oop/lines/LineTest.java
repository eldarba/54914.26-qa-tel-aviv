package d.oop.lines;

public class LineTest {

	public static void main(String[] args) {
		Line line = new Line();
		line.setLength(10);
		// line.setLength(-7);
		line.print();

		System.out.println(line.getLength());

	}

}
