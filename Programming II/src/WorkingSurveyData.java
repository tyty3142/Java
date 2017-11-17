import javax.swing.JOptionPane;
// CTRL + Shft + O

/**
 * 
 * @author Andrey Soares
 *
 */
public class WorkingSurveyData {

	/*
	 * ATTRIBUTES
	 */
	String surveyData[][] = new String[100][3];
	int rowIndex = 0;

	/*
	 * CONSTRUCTOR
	 */
	public WorkingSurveyData() {

		while (true) { // infinite loop

			String[] choices = { "Enter Survey Data", "Show survey Data", "Show Statistics", "Quit" };
			
			int response = JOptionPane.showOptionDialog(null, 
					"Select operation?", 			// message
					"Option", 						// title
					JOptionPane.YES_NO_OPTION, 		// type of Dialog
					JOptionPane.QUESTION_MESSAGE, 	// type of message
					null, 							// icon
					choices, 						// available options
					choices[0]); 					// initial choice

			if (response == 0) {
				enterSurveyData();
			} else if (response == 1) {
				showSurveyData();
			} else if (response == 2) {
				showSurveyStats();
			} else if (response == 3) {
				exitSurvey();
			}

		} // end of infinite loop

	}// end of constructor

	/*
	 * METHODS
	 */

	/**
	 * METHOD enterSurveyData
	 */
	public void enterSurveyData() {

		// question 1
		String question1 = JOptionPane.showInputDialog("Enter your unique token (ex: ABC)");

		// convert to uppercase
		question1 = question1.toUpperCase();

		// validation number of spaces = 3 or if all spaces are letters
		while (question1.length() != 3 || 
				!((question1.charAt(0) >= 'A' && question1.charAt(0) <= 'Z') && 
				  (question1.charAt(1) >= 'A' && question1.charAt(1) <= 'Z') && 
				  (question1.charAt(2) >= 'A' && question1.charAt(2) <= 'Z'))) {

			// if not valid, ask again with additional message
			question1 = JOptionPane.showInputDialog("INVALID INFORMATION - ENTER AGAIN\nEnter your unique token (ex: ABC)");
			// convert again
			question1 = question1.toUpperCase();
		}
		
		// check if token already exists
		// If yes, show error message and return to menu
		if (this.tokenExist(question1)) {			
			JOptionPane.showMessageDialog(null,	"Token has already been used to answer survey");
			return;
		}

		// question 2
		String question2 = JOptionPane.showInputDialog("Enter your school level\n1-Freshman, 2-Sophomore, 3-Junior, and 4-Senior");

		// validate question 2. Only accept numbers 1-4
		int levelOption = Integer.parseInt(question2);
		while(levelOption < 1 || levelOption > 4) {
			question2 = JOptionPane.showInputDialog("INVALID INFORMATION - ENTER AGAIN\nEnter your school level\n1-Freshman, 2-Sophomore, 3-Junior, and 4-Senior");

			levelOption = Integer.parseInt(question2);
		}

		// question 3
		String question3 = JOptionPane.showInputDialog("Enter your operating systems\n1-Windows, 2-Mac OS, 3-Linux, 4-Chrome OS, and 5-Other");

		// validate question 3. Only accept numbers 1-5
		int osOption = Integer.parseInt(question3);
		while(osOption < 1 || osOption > 5) {
			question3 = JOptionPane.showInputDialog("INVALID INFORMATION - ENTER AGAIN\nEnter your operating systems\n1-Windows, 2-Mac OS, 3-Linux, 4-Chrome OS, and 5-Other");

			osOption = Integer.parseInt(question3);
		}
		
		// store data into array
		surveyData[rowIndex][0] = question1;
		surveyData[rowIndex][1] = question2;
		surveyData[rowIndex][2] = question3;
		
		// increment the value to show the next available position of the array and the total items stored in the array
		rowIndex++;

	}// end of method enterSurveyData
	
	/**
	 * METHOD tokenExist
	 * 
	 * @param toke
	 * @return TRUE OR FALSE
	 */
	public boolean tokenExist(String token) {
		boolean result = false;

		for (int i = 0; i < rowIndex; i++) {

			// check if token passed as parameter is equal to token in the first
			// column of the array
			if (token.equalsIgnoreCase(surveyData[i][0])) {
				return true;
			}
		}

		return result;
		
	} // end of method tokenExist

	/**
	 * METHOD showSurveyData
	 */
	public void showSurveyData() {
		System.out.println("TOKEN - SCHOOL LEVEL - OPERATING SYSTEM");
		
		for (int i = 0; i < rowIndex; i++) {
			System.out.println(	surveyData[i][0] + " - " + 
								getLevelName(surveyData[i][1]) + " - " + 
								getOSName(surveyData[i][2]));
		}
		
	} // end of method showSurvey

	/**
	 * METHOD getLevelName
	 */
	public String getLevelName(String value) {
		String level = "";

		if (value.equals("1")) {
			level = "Freshman";
		} else if (value.equals("2")) {
			level = "Sophomore";
		} else if (value.equals("3")) {
			level = "Junior";
		} else if (value.equals("4")) {
			level = "Senior";
		}

		return level;
		
	}// end of method getLevel

	/**
	 * METHOD getOSName
	 */
	public String getOSName(String value) {
		String os = "";

		if (value.equals("1")) {
			os = "Windows";
		} else if (value.equals("2")) {
			os = "Mac OS";
		} else if (value.equals("3")) {
			os = "Linux";
		} else if (value.equals("4")) {
			os = "Chrome OS";
		} else if (value.equals("5")) {
			os = "Other";
		}

		return os;
		
	}// end of method getOS

	/**
	 * METHOD showSurveyStats
	 */
	public void showSurveyStats() {
		// create accumulators
		int countWindows = 0;
		int countMacOS = 0;
		int countLinux = 0;
		int countChromeOS = 0;
		int countOther = 0;

		// loop through the array to check the last column
		for (int i = 0; i < rowIndex; i++) {

			if (surveyData[i][2].equals("1"))
				countWindows++;
			else if (surveyData[i][2].equals("2"))
				countMacOS++;
			else if (surveyData[i][2].equals("3"))
				countLinux++;
			else if (surveyData[i][2].equals("4"))
				countChromeOS++;
			else if (surveyData[i][2].equals("5"))
				countOther++;

		} // end of loop

		// calculate the percentages
		double pw = countWindows / (double) rowIndex * 100;
		double pm = countMacOS / (double) rowIndex * 100;
		double pl = countLinux / (double) rowIndex * 100;
		double pc = countChromeOS / (double) rowIndex * 100;
		double po = countOther / (double) rowIndex * 100;

		// display the results
		System.out.printf("\nWindows = %d,%.2f", countWindows, pw);
		System.out.printf("\nMac OS = %d,%.2f", countMacOS, pm);
		System.out.printf("\nLinux = %d,%.2f", countLinux, pl);
		System.out.printf("\nChrome OS = %d,%.2f", countChromeOS, pc);
		System.out.printf("\nOther = %d,%.2f", countOther, po);
		
		//---------------------------------------------------
		// NEXT: Show the top OS by school level
		// Try implementing it. 
		// Contact the instructor if you have questions
		//---------------------------------------------------
		
	}// end of method showSurveyStats

	/**
	 * METHOD exitSurvey
	 */
	public void exitSurvey() {
		System.exit(0);
		
	}// end of method exitSurvey

	/**
	 * METHOD main
	 */
	public static void main(String[] args) {
		new WorkingSurveyData();
		
	}// end of main method

}// end of class
