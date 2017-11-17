package Lab12;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Lab12 extends JFrame {


	static public String SelectFile() {
		String filename = null;
		JFileChooser chooser = new JFileChooser();
		chooser.setCurrentDirectory(new File("."));
		FileNameExtensionFilter filter = new FileNameExtensionFilter("CSV", "csv");
		chooser.addChoosableFileFilter(filter);
		int returnVal = chooser.showOpenDialog(null);
		if (returnVal == 0) {
			filename = chooser.getSelectedFile().getPath();
		}
		return filename;
	}

	public static void main(String[] args) {
		new Lab12();

	}

	private BottomPanel BottomPanel;
	private ArrayList<String> list1 = new ArrayList<String>();
	private JTextField IDs;
	private JTextField names;
	private JTextField phone;
	private JComboBox States;
	private JTextField Comp;
	private JTextField DOB;
	private JTextField MemDate;
	private JTextField Email;
	
	private Membership Member;

	public Lab12() {

		setTitle("Adding Members");

		setLayout(new GridLayout(3, 3));

		JPanel ID = new JPanel();
		ID.setBorder(BorderFactory.createTitledBorder("Enter ID"));
		JTextField IDs = new JTextField(13);
		ID.add(IDs);

		JPanel Name = new JPanel();
		Name.setBorder(BorderFactory.createTitledBorder("Enter Name"));
		JTextField names = new JTextField(13);
		Name.add(names);

		JPanel Phone = new JPanel();
		Phone.setBorder(BorderFactory.createTitledBorder("Enter Phone Number"));
		JTextField phone = new JTextField(13);
		Phone.add(phone);

		JPanel State = new JPanel();
		State.setBorder(BorderFactory.createTitledBorder("Choose a State"));
		String[] options = { "AL", "AK", "AZ", "AR", "CA", "CO", "CT", "DE", "FL", "GA", "HI", "ID", "IL", "IN", "IA",
				"KS", "KY", "LA", "ME", "MD", "MA", "MI", "MN", "MS", "MO", "MT", "NE", "NV", "NH", "NJ", "NM", "NY",
				"NC", "ND", "OH", "OK", "OR", "PA", "RI", "SC", "SD", "TN", "TX", "UT", "VT", "VA", "WA", "WV", "WI",
				"WY" };
		JComboBox<?> States = new JComboBox<Object>(options);
		State.add(States);

		JPanel Comp = new JPanel();
		Comp.setBorder(BorderFactory.createTitledBorder("Enter The Name of Company"));
		JTextField Comps = new JTextField(13);
		Comp.add(Comps);

		JPanel DOB = new JPanel();
		DOB.setBorder(BorderFactory.createTitledBorder("Enter Date of Birth"));
		JTextField dob = new JTextField(13);
		DOB.add(dob);

		JPanel MemDate = new JPanel();
		MemDate.setBorder(BorderFactory.createTitledBorder("Enter Entry Date of Member"));
		JTextField memdate = new JTextField(13);
		MemDate.add(memdate);

		JPanel Email = new JPanel();
		Email.setBorder(BorderFactory.createTitledBorder("Enter Email"));
		JTextField email = new JTextField(13);
		Email.add(email);

		BottomPanel = new BottomPanel();

		add(ID);
		add(Name);
		add(Phone);
		add(State);
		add(Comp);
		add(DOB);
		add(MemDate);
		add(Email);
		add(BottomPanel, "South");

		this.BottomPanel.getAddButton().addActionListener(new AddButtonListener());
		this.BottomPanel.getExitButton().addActionListener(new ExitButtonListener());

		pack();
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (int) ((dimension.getWidth() - this.getWidth()) / 2);
		int y = (int) ((dimension.getHeight() - this.getHeight()) / 2);
		this.setLocation(x, y);

		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			SwingUtilities.updateComponentTreeUI(this);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error setting the look and feel.");
			System.exit(0);
		}
		this.setVisible(true);
		this.setResizable(false);

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

			Membership Member = new Membership(columns[0], columns[1], columns[2], columns[3], columns[4], columns[5],
					columns[6], columns[7]);
			list1.add(0, columns[0]);
			list1.add(1, Member.getName());
			list1.add(2, Member.getPhone());
			list1.add(3, Member.getState());
			list1.add(4, Member.getCompany());
			list1.add(5, Member.getDOB());
			list1.add(6, Member.getMemDate());
			list1.add(7, Member.getEmail());

			System.out.println(list1.get(0));
		}
	}

	private class AddButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			PrintWriter outputFile = null;
			try {
				FileWriter fw = new FileWriter(SelectFile(), true);
				outputFile = new PrintWriter(fw);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			// add on one line and split it on a space
			outputFile.println(IDs);
			outputFile.println(names);
			// outputFile.print(list1.get(2) + " ");
			// outputFile.print(list1.get(3) + " ");
			// outputFile.print(list1.get(4) + " ");
			// outputFile.print(list1.get(5) + " ");
			// outputFile.print(list1.get(6) + " ");
			// outputFile.print(list1.get(7) + " ");

			outputFile.flush();
			outputFile.close();
		}
	}// end calcbutton listener

	private class ExitButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}// end exitbutton listener
}
