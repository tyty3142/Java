package File_Loop;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class fileAndLoop {

	public static void main(String[] args) {

		File file = new File("dataMar-31-2016.csv");
		Scanner inputFile = null;
		try {
			inputFile = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		while (inputFile.hasNext()) {
			String str = inputFile.nextLine();
			System.out.println(str);

		}
		inputFile.close();
	}
}
