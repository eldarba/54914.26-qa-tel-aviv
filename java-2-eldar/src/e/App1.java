package e;

import org.eldar.calc.Calculator;

public class App1 {

	public static void main(String[] args) {

		Calculator calc = new Calculator();
		calc.add(5);
		calc.add(3);
		calc.mul(2);
		System.out.println(calc.getResult());

	}

}
