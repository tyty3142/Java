import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class MySurveyData {
	String validateToken[][] = new String[100][3];
	int rowIndex = 0;

	public static void main(String[] args) {
		new MySurveyData();
	}

	public MySurveyData() {
		int input = 0;
		while (input != 3) {
			String choices[] = { "Enter Survey Data", "View Survey Data", "Show Survey Stats", "Quit" };
			input = JOptionPane.showOptionDialog(null, "Select operation...", "Options", JOptionPane.YES_NO_OPTION,
					JOptionPane.QUESTION_MESSAGE, null, choices, choices[0]);
			if (input == 0) {
				entervalidateToken();
			} else if (input == 1) {
				viewvalidateToken();
			} else if (input == 2) {
				showSurveyStatistics();
			} else if (input == 3) {
				exitSurvey();
			}
		}
	}

	public void entervalidateToken() {
		String token = JOptionPane.showInputDialog(null, "What is your unique token " + "(ex: DFU)?", "Please Answer",
				JOptionPane.QUESTION_MESSAGE);
		while (token.length() != 3 || !token.matches("[a-zA-Z]*")) {
			if (token.length() != 3) {
				token = JOptionPane.showInputDialog(null,
						"INVALID INFORMATION. Token has more or less than 3 characters. "
								+ "\nWhat is your unique token (ex: DFU)?",
						"Please Answer", JOptionPane.WARNING_MESSAGE);
			}
			if (!token.matches("[a-zA-Z]*")) {
				while (!token.matches("[a-zA-Z]*")) {
					token = JOptionPane.showInputDialog(null,
							"INVALID INFORMATION. Token accepts only letters. "
									+ "\nWhat is your unique token (ex: DFU)?",
							"Please Answer", JOptionPane.WARNING_MESSAGE);
				}
			}
		}
		if (this.tokenExist(token)) {
			JOptionPane.showMessageDialog(null, "Token has already been taken");
			return;
		}
		validateToken[rowIndex][0] = token;

		String level;
		level = JOptionPane.showInputDialog(null,
				"What is your school level " + "(1-Freshman, 2-Sophomore, " + "3-Junior, or 4-Senior?)",
				"Please Answer", JOptionPane.QUESTION_MESSAGE);
		if (level == ("1")) {
			level = ("Freshman");
		} else if (level == ("2")) {
			level = ("Sophomore");
		} else if (level == ("3")) {
			level = ("Junior");
		} else if (level == ("4")) {
			level = ("Senior");
		} else {
			int level2 = Integer.parseInt(level);
			while (level2 > 4 || level2 < 1) {
				level = JOptionPane.showInputDialog(null,
						"INVALID RESPONSE! \nWhat is your school level "
								+ "(1-Freshman, 2-Sophomore, 3-Junior, or 4-Senior?)",
						"Please Answer", JOptionPane.WARNING_MESSAGE);
				level2 = Integer.parseInt(level);
			}
			level = Integer.toString(level2);
		}
		validateToken[rowIndex][1] = level;

		String OS;
		OS = JOptionPane.showInputDialog(null,
				"What operating system do you use more often to complete school activities"
						+ "(1-Windows, 2-Mac, 3-Linux, 4-Chrome OS, 5-Other)",
				"Please Answer", JOptionPane.QUESTION_MESSAGE);
		if (OS == "1") {
			OS = ("Windows");
		} else if (OS == "2") {
			OS = ("Mac");
		} else if (OS == "3") {
			OS = ("Linux");
		} else if (OS == "4") {
			OS = ("Chrome");
		} else if (OS == "5") {
			OS = ("Other");
		} else {
			int OS2 = Integer.parseInt(OS);
			while (OS2 > 5 || OS2 < 1) {
				OS = JOptionPane.showInputDialog(null,
						"INVALID RESPONSE! \nWhat is your school level "
								+ "(1-Freshman, 2-Sophomore, 3-Junior, or 4-Senior?)",
						"Please Answer", JOptionPane.WARNING_MESSAGE);
				OS2 = Integer.parseInt(OS);
			}
			OS = Integer.toString(OS2);
		}
		validateToken[rowIndex][2] = OS;
		rowIndex++;
	}

	public String getLevelName(String level) {

		if (level.equals("1")) {
			level = "Freshman\t";
		} else if (level.equals("2")) {
			level = "Sophomore\t";
		} else if (level.equals("3")) {
			level = "Junior\t\t";
		} else if (level.equals("4")) {
			level = "Senior\t\t";
		}

		return level;
	}

	public String getOSName(String OS) {
		String os = "";

		if (OS.equals("1")) {
			os = "Windows";
		} else if (OS.equals("2")) {
			os = "Mac OS";
		} else if (OS.equals("3")) {
			os = "Linux";
		} else if (OS.equals("4")) {
			os = "Chrome OS";
		} else if (OS.equals("5")) {
			os = "Other";
		}

		return os;
	}

	public boolean tokenExist(String token) {
		boolean result = false;

		for (int i = 0; i < rowIndex; i++) {

			// check if token passed as parameter is equal to token in the first
			// column of the array
			if (token.equalsIgnoreCase(validateToken[i][0])) {
				return true;
			}
		}
		return result;
	}

	public void viewvalidateToken( ) {
		System.out.println("Token" + "\t\t Level" + ("\t\t Operating System"));
		System.out.println("--------------------------------------------------");
		for (int i = 0; i < rowIndex; i++) {
			System.out.println(validateToken[i][0] + "\t\t" + getLevelName(validateToken[i][1])
		+ getOSName(validateToken[i][2]));
		}

	}

	public void showSurveyStatistics() {
		// create accumulators
		int countWindows = 0;
		int countMacOS = 0;
		int countLinux = 0;
		int countChromeOS = 0;
		int countOther = 0;

		// loop through the array to check the last column
		for (int i = 0; i < rowIndex; i++) {

			if (validateToken[i][2].equals("1"))
				countWindows++;
			else if (validateToken[i][2].equals("2"))
				countMacOS++;
			else if (validateToken[i][2].equals("3"))
				countLinux++;
			else if (validateToken[i][2].equals("4"))
				countChromeOS++;
			else if (validateToken[i][2].equals("5"))
				countOther++;

		} // end of loop
DecimalFormat format = new DecimalFormat("#.00");
		// calculate the percentages
		double pw = countWindows / (double) rowIndex * 100;
		double pm = countMacOS / (double) rowIndex * 100;
		double pl = countLinux / (double) rowIndex * 100;
		double pc = countChromeOS / (double) rowIndex * 100;
		double po = countOther / (double) rowIndex * 100;

		// display the results
		System.out.printf("\nWindows = %.2f", countWindows, pw);
		System.out.printf("\nMac OS = %.2f", countMacOS, pm);
		System.out.printf("\nLinux = %.2f", countLinux, pl);
		System.out.printf("\nChrome OS = %.2f", countChromeOS, pc);
		System.out.printf("\nOther = %.2f", countOther, po);
	}

	public static void exitSurvey() {
		System.exit(0);
	}
}