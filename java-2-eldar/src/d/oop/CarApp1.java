package d.oop;

public class CarApp1 {

	public static void main(String[] args) {

		int x = 5; // int is simple

		Car car1 = new Car(); // object is complex
		car1.number = 101;
		car1.color = "red";
		car1.speed = 20;

		Car car2 = new Car(); // object is complex
		car2.number = 102;
		car2.color = "yellow";
		car2.speed = 100;

		System.out.println("car number: " + car1.number);
		System.out.println("color: " + car1.color);
		System.out.println("speed: " + car1.speed);

		System.out.println("=============");
		System.out.println("car number: " + car2.number);
		System.out.println("color: " + car2.color);
		System.out.println("speed: " + car2.speed);

		System.out.println("=============");
		car1.honk();
		car2.honk();

	}

}
