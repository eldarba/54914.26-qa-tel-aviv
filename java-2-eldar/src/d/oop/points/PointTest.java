package d.oop.points;

public class PointTest {

	public static void main(String[] args) {

		// create 2 Point instances (objects)
		// to create the instances we call a constructor
		Point p1 = new Point();
		Point p2 = new Point(5, 3);

		// use the instances - call methods
		p1.printLocation();
		p2.printLocation();

		System.out.println("=================");
		// print the current location
		p1.printLocation();
		// move right 3 steps
		p1.moveRight();
		p1.moveRight();
		p1.moveRight();
		// move up 2 steps
		p1.moveUp();
		p1.moveUp();
		p1.printLocation();
		// reset the point
		p1.reset();
		// print the current location
		p1.printLocation();

	}

}
