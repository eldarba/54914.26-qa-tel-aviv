package d.oop.points;

public class Point {

	// 1. ATTRIBUTES
	int x;
	int y;

	// 2. CONSTRUCTORS

	// constructor 1 - function for object creation
	Point() {

	}

	// constructor 2 - function for object creation
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// 3. METHODS - defines what actions a point can do

	void printLocation() {
		System.out.println("(" + x + ", " + y + ")");
	}

	void moveRight() {
		x++;
	}

	void moveLeft() {
		x--;
	}

	void moveUp() {
		y++;
	}

	void moveDown() {
		y--;
	}

}
