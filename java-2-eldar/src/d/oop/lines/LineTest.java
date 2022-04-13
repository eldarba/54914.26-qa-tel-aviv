package d.oop.lines;

public class LineTest {

	public static void main(String[] args) {
		Line line = new Line();
		line.setLength(10);
		System.out.println(line.getLength());
		line.setLength(-10);
		System.out.println(line.getLength());
		line.setLength(3);
		System.out.println(line.getLength());

		line.print();

	}

}
