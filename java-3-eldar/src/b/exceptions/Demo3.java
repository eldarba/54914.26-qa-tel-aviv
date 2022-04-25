package b.exceptions;

import java.io.File;
import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {

		String path = "c:/eldar/temp/letter.txt";
		File file = new File(path);

		if (file.exists()) {
			System.out.println("file exist");
		} else {
			System.out.println("file NOT exist");
		}

		try {
			Scanner sc = new Scanner(file);
		} catch (Exception e) {
			// if we are here an error occurred - file not found
			System.out.println("scanner error: file not found. creating the file");
			try {
				file.createNewFile(); // create the file if not exist
				System.out.println("file created");
			} catch (Exception e1) {
				System.out.println("file create failed");
			}

		}

	}

}
