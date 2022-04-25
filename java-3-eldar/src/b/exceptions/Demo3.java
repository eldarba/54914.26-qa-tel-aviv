package b.exceptions;

import java.io.File;

public class Demo3 {

	public static void main(String[] args) {

		String path = "c:/eldar/temp/letter.txt";
		File file = new File(path);

		if (file.exists()) {
			System.out.println("file exist");
		} else {
			System.out.println("file NOT exist");
		}

	}

}
