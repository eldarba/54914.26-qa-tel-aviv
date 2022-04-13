package d.oop;

public class PersonTest {

	public static void main(String[] args) {

		// create instance 1
		Person p1 = new Person();
		// set the name
		p1.name = "Ella";

		// create instance 2
		Person p2 = new Person();
		// set the name
		p2.name = "Yosi";

		// use the method speak on the instance
		p1.speak();
		p2.speak();

	}

}
