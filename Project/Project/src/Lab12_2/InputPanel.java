package Lab12_2;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InputPanel extends JPanel {

	// ********************************
	// ATTRIBUTES
	// ********************************

	private JLabel labelId;
	private JLabel labelName;
	private JLabel labelPhone;
	private JLabel labelState;
	private JLabel labelCompany;
	private JLabel labelDOB;
	private JLabel labelMemebershipDate;
	private JLabel labelEmail;
	private JTextField tfId;
	private JTextField tfName;
	private JTextField tfPhone;
	private JComboBox cbState;
	private JTextField tfCompany;
	private JTextField tfDOB;
	private JTextField tfMembershipDate;
	private JTextField tfEmail;

	// ********************************
	// CONSTRUCTORS
	// ********************************

	public InputPanel() {
		this.setLayout(new GridLayout(16, 1));
		this.setBorder(BorderFactory.createTitledBorder("MemberInformation"));

		labelId = new JLabel("ID:");
		labelName = new JLabel("Name:");
		labelPhone = new JLabel("Phone:");
		labelState = new JLabel("State:");
		labelCompany = new JLabel("Company:");
		labelDOB = new JLabel("DOB:");
		labelMemebershipDate = new JLabel("Membership Date:");
		labelEmail = new JLabel("Email:");

		tfId = new JTextField(20);
		tfName = new JTextField(20);
		tfPhone = new JTextField(20);
		String[] states = { "AL", "AK", "AZ", "AR", "CA", "CO", "CT", "DE", "FL", "GA", "HI", "ID", "IL", "IN", "IA",
				"KS", "KY", "LA", "ME", "MD", "MA", "MI", "MN", "MS", "MO", "MT", "NE", "NV", "NH", "NJ", "NM", "NY",
				"NC", "ND", "OH", "OK", "OR", "PA", "RI", "SC", "SD", "TN", "TX", "UT", "VT", "VA", "WA", "WV", "WI",
				"WY" };
		cbState = new JComboBox(states);
		tfCompany = new JTextField(20);
		tfDOB = new JTextField(20);
		tfMembershipDate = new JTextField(20);
		tfEmail = new JTextField(20);

		this.add(labelId);
		this.add(tfId);
		this.add(labelName);
		this.add(tfName);
		this.add(labelPhone);
		this.add(tfPhone);
		this.add(labelState);
		this.add(cbState);
		this.add(labelCompany);
		this.add(tfCompany);
		this.add(labelDOB);
		this.add(tfDOB);
		this.add(labelMemebershipDate);
		this.add(tfMembershipDate);
		this.add(labelEmail);
		this.add(tfEmail);
	}

	// ********************************
	// GETS AND SETS
	// ********************************

	public JTextField getTfId() {
		return tfId;
	}

	public void setTfId(JTextField tfId) {
		this.tfId = tfId;
	}

	public JTextField getTfName() {
		return tfName;
	}

	public void setTfName(JTextField tfName) {
		this.tfName = tfName;
	}

	public JTextField getTfPhone() {
		return tfPhone;
	}

	public void setTfPhone(JTextField tfPhone) {
		this.tfPhone = tfPhone;
	}

	public JComboBox getCbState() {
		return cbState;
	}

	public void setCbState(JComboBox cbState) {
		this.cbState = cbState;
	}

	public JTextField getTfCompany() {
		return tfCompany;
	}

	public void setTfCompany(JTextField tfCompany) {
		this.tfCompany = tfCompany;
	}

	public JTextField getTfDOB() {
		return tfDOB;
	}

	public void setTfDOB(JTextField tfDOB) {
		this.tfDOB = tfDOB;
	}

	public JTextField getTfMembershipDate() {
		return tfMembershipDate;
	}

	public void setTfMembershipDate(JTextField tfMembershipDate) {
		this.tfMembershipDate = tfMembershipDate;
	}

	public JTextField getTfEmail() {
		return tfEmail;
	}

	public void setTfEmail(JTextField tfEmail) {
		this.tfEmail = tfEmail;
	}

	// ********************************
	// METHODS
	// ********************************

	public void clearForm() {
		tfId.setText("");
		tfName.setText("");
		tfPhone.setText("");
		cbState.setSelectedIndex(0);
		tfCompany.setText("");
		tfDOB.setText("");
		tfMembershipDate.setText("");
		tfEmail.setText("");
	}

} // end of class
