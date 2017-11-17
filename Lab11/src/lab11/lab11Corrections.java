package lab11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class lab11Corrections {
	
	static public String SelectFile(){
		String filename = null;
		JFileChooser chooser = new JFileChooser();
		chooser.setCurrentDirectory(new File("."));
		FileNameExtensionFilter filter = new FileNameExtensionFilter("CSV", "csv");
		chooser.addChoosableFileFilter(filter);
		int returnVal = chooser.showOpenDialog(null);
		if(returnVal == 0){
			filename = chooser.getSelectedFile().getPath();
		}
		return filename;
	}

	public static void main(String[] args) {
		String filename = SelectFile();
		File file = new File(filename);
		Scanner inputFile = null;
		try {
			inputFile = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		while (inputFile.hasNext()) {
			String str = inputFile.nextLine();
			String columns[] = str.split(",");
			System.out.println(str);
		}

	}

}
