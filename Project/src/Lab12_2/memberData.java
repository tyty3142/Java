package Lab12_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class memberData {

	private ArrayList<Membership> members = new ArrayList<Membership>();
	private String filename;

	public memberData() {
		super();
	}

	public ArrayList<Membership> getMembers() {
		return members;
	}

	public void setMembers(ArrayList<Membership> members) {
		this.members = members;
	}

	public int getTotalMembers() {
		return members.size();
	}

	public ArrayList<String> getStates() {
		ArrayList<String> states = new ArrayList<String>();

		for (Membership member : getMembers()) {
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

	public boolean idExists(String id) {

		for (Membership member : members) {
			if (member.getId().equals(id)) {
				return true;
			}
		}

		return false;
	}

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

	public void sortList() {
		Collections.sort(this.members, new MemberComparator());

	}

	private class MemberComparator implements Comparator<Membership> {
		public int compare(Membership o1, Membership o2) {
			return o1.getName().compareTo(o2.getName());
		}
	}

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
	
	public void printToFile(Membership newMember) {
		
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

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public void clearData(){
		members.clear();
		filename="";
	}
	
}
