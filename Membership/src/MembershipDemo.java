import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * 
 * @author andrey
 *
 */
public class MembershipDemo extends JFrame {

	// ********************************
	// ATTRIBUTE
	// ********************************
	private String filename;
	private ArrayList<Membership> members = new ArrayList<Membership>();

	private InputPanel inputPanel;
	private SummaryPanel summaryPanel;
	private ButtonPanel buttonPanel;

	// ********************************
	// CONSTRUCTOR
	// ********************************
	public MembershipDemo() {

		this.setTitle("Membership");
		this.inputPanel = new InputPanel();
		this.summaryPanel = new SummaryPanel();
		this.buttonPanel = new ButtonPanel();

		this.add(inputPanel, "Center");
		this.add(summaryPanel, "East");
		this.add(buttonPanel, "South");

		pack();

		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (int) ((dimension.getWidth() - this.getWidth()) / 2);
		int y = (int) ((dimension.getHeight() - this.getHeight()) / 2);
		this.setLocation(x, y);

		this.setResizable(false);

		// test if read ok
		if (!this.readFile()) {
			JOptionPane.showMessageDialog(null, "Problem reading the file");
			System.exit(0);
		}

		this.updateSummary();

		setVisible(true);

		this.buttonPanel.getAddButton().addActionListener(new AddButtonListener());
		this.buttonPanel.getCancelButton().addActionListener(new CancelButtonListener());

	} // end of constructor

	// ********************************
	// METHODS
	// ********************************

	/**
	 * 
	 * @return
	 */
	public String SelectFile() {
		String filename = null;
		JFileChooser chooser = new JFileChooser();
		chooser.setCurrentDirectory(new File("."));
		FileNameExtensionFilter filter = new FileNameExtensionFilter("CSV", "csv");
		chooser.addChoosableFileFilter(filter);
		chooser.setFileFilter(filter);
		int returnVal = chooser.showOpenDialog(null);
		if (returnVal == 0) {
			filename = chooser.getSelectedFile().getPath();
		}
		return filename;
	}

	/**
	 * 
	 * @return
	 */
	public boolean readFile() {
		filename = this.SelectFile();

		// Open the file.
		File file = new File(this.filename);
		Scanner inputFile = null;
		try {
			inputFile = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

		boolean firstLine = true;

		// Read until the end of the file.
		while (inputFile.hasNext()) {
			// get line from file
			String str = inputFile.nextLine();

			if (firstLine)
				firstLine = false;
			else {
				String[] items = str.split(",");

				Membership tempMember = new Membership();
				
				tempMember.setId(items[0]);
				tempMember.setName(items[1]);
				tempMember.setPhone(items[2]);
				tempMember.setState(items[3]);
				tempMember.setCompany(items[4]);
				
				String[] DOBdate = items[5].split("/");
				Calendar memberDOB = Calendar.getInstance();
				memberDOB.set(Integer.parseInt(DOBdate[2])-1, Integer.parseInt(DOBdate[1])-1, Integer.parseInt(DOBdate[0]));
				
				tempMember.setDob(memberDOB);
				
				String[] MEMBERdate = items[6].split("/");
				Calendar memberDate = Calendar.getInstance();
				memberDate.set(Integer.parseInt(MEMBERdate[2])-1, Integer.parseInt(MEMBERdate[1])-1, Integer.parseInt(MEMBERdate[0]));
				
				tempMember.setMembershipDate(memberDate);
				
				tempMember.setEmail(items[7]);

				members.add(tempMember);
			}
		}

		inputFile.close(); // close the file when done.

		if (members.size() > 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 
	 * @return
	 */
	public int getTotalMembers() {
		return members.size();
	}

	/**
	 * 
	 * @param list
	 * @return
	 */
	public ArrayList<String> getStates() {
		ArrayList<String> states = new ArrayList<String>();

		for (Membership member : members) {
			String memberState = member.getState();
			boolean stateExist = false;

			for (int i = 0; i < states.size(); i++) {
				if (states.get(i).equals(memberState)) {
					stateExist = true;
					break;
				}
			}

			if (!stateExist) {
				states.add(memberState);
			}
		}

		return states;
	}

	/**
	 * 
	 * @param newMember
	 */
	private void printToFile(Membership newMember) {
	
		// Open the file to append
		PrintWriter outputFile = null;
		FileWriter fw = null;
		try {
			fw = new FileWriter(filename, true);
			outputFile = new PrintWriter(fw);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		outputFile.print(newMember.formatToSave());

		outputFile.close();

	}

	/**
	 * 
	 * @param id
	 * @return
	 */
	public boolean idExists(String id) {

		for (Membership member : members) {
			if (member.getId().equals(id)) {
				return true;
			}
		}

		return false;
	}

	/**
	 * 
	 */
	public void updateSummary() {
		this.summaryPanel.getTfTotal().setText(String.valueOf(this.getTotalMembers()));
		this.summaryPanel.getTfOldest().setText(
						this.getOldestMember().getName());
	}

	/**
	 * 
	 * @param list
	 * @return
	 */
	public Membership getOldestMember() {
		Membership oldest = new Membership();
		Calendar oldDOB = Calendar.getInstance();
		for (Membership member : members) {
			String name = member.getName();
			Calendar memberDOB = member.getDob();
			
			if (memberDOB.compareTo(oldDOB) < 0) {
				oldDOB = memberDOB;
				oldest = new Membership(member);
			}
		}

		return oldest;
	}

	// ********************************
	// MAIN METHOD
	// ********************************

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new MembershipDemo();
	}

	// ********************************
	// INNER CLASSES
	// ********************************

	private class AddButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {

			// extract ID from the form
			String id = inputPanel.getTfId().getText();

			// check if id is empty
			if (id.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Invalid ID!");
			}
			// check if id already exists
			else if (idExists(id)) {
				JOptionPane.showMessageDialog(null, "ID already exist!");
				// continue creating new member
			} else {

				// extract remaining information from the form
				String name = inputPanel.getTfName().getText();
				String phone = inputPanel.getTfPhone().getText();
				String state = (String) inputPanel.getCbState().getSelectedItem();
				String company = inputPanel.getTfCompany().getText();
				String dob = inputPanel.getTfDOB().getText();
				String membershipDate = inputPanel.getTfMembershipDate().getText();
				String email = inputPanel.getTfEmail().getText();

				// create instance of member
				Membership tempMember = new Membership();
				
				// set member information
				tempMember.setId(id);
				tempMember.setName(name);
				tempMember.setPhone(phone);
				tempMember.setState(state);
				tempMember.setCompany(company);
				
				String[] DOBdate = dob.split("/");
				Calendar memberDOB = Calendar.getInstance();
				memberDOB.set(Integer.parseInt(DOBdate[2]), Integer.parseInt(DOBdate[0])-1, Integer.parseInt(DOBdate[1]));
				
				tempMember.setDob(memberDOB);
				
				String[] MEMBERdate = membershipDate.split("/");
				Calendar memberDate = Calendar.getInstance();
				memberDate.set(Integer.parseInt(MEMBERdate[2]), Integer.parseInt(MEMBERdate[0])-1, Integer.parseInt(MEMBERdate[1]));
				
				tempMember.setMembershipDate(memberDate);

				tempMember.setEmail(email);

				// update the list of members with the new member
				members.add(tempMember);

				// print the new member to the file
				printToFile(tempMember);

				// clear form
				inputPanel.clearForm();
				
				updateSummary();
			}
		}

	} // end of inner class AddButtonListener

	private class CancelButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			System.exit(0);
		}

	} // end of inner class CancelButtonListener

} // end of class
