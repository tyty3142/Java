import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InputPanel extends JPanel{

	//********************************
	// ATTRIBUTES
	//********************************
	
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
	
	//********************************
	// CONSTRUCTORS
	//********************************
	
	public InputPanel(){
		this.setLayout(new GridLayout(8,2));
		
		
		labelId = new JLabel("ID:");
		labelName = new JLabel("Name:");
		labelPhone = new JLabel("Phone:");
		labelState = new JLabel("State:");
		labelCompany = new JLabel("Company:");
		labelDOB = new JLabel("DOB:");
		labelMemebershipDate = new JLabel("Membership Date:");
		labelEmail = new JLabel("Email:");
		
		tfId = new JTextField();
		tfName = new JTextField();
		tfPhone = new JTextField();
		String[] states = {"AL", "AK", "AZ", "AR", "CA"};
		cbState = new JComboBox(states);
		tfCompany = new JTextField();
		tfDOB = new JTextField();
		tfMembershipDate = new JTextField();
		tfEmail = new JTextField();
		
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

	//********************************
	// GETS AND SETS
	//********************************
	
	/**
	 * @return the tfId
	 */
	public JTextField getTfId() {
		return tfId;
	}

	/**
	 * @param tfId the tfId to set
	 */
	public void setTfId(JTextField tfId) {
		this.tfId = tfId;
	}

	/**
	 * @return the tfName
	 */
	public JTextField getTfName() {
		return tfName;
	}

	/**
	 * @param tfName the tfName to set
	 */
	public void setTfName(JTextField tfName) {
		this.tfName = tfName;
	}

	/**
	 * @return the tfPhone
	 */
	public JTextField getTfPhone() {
		return tfPhone;
	}

	/**
	 * @param tfPhone the tfPhone to set
	 */
	public void setTfPhone(JTextField tfPhone) {
		this.tfPhone = tfPhone;
	}
	
	/**
	 * @return the cbState
	 */
	public JComboBox getCbState() {
		return cbState;
	}

	/**
	 * @param cbState the cbState to set
	 */
	public void setCbState(JComboBox cbState) {
		this.cbState = cbState;
	}

	/**
	 * @return the tfCompany
	 */
	public JTextField getTfCompany() {
		return tfCompany;
	}

	/**
	 * @param tfCompany the tfCompany to set
	 */
	public void setTfCompany(JTextField tfCompany) {
		this.tfCompany = tfCompany;
	}

	/**
	 * @return the tfDOB
	 */
	public JTextField getTfDOB() {
		return tfDOB;
	}

	/**
	 * @param tfDOB the tfDOB to set
	 */
	public void setTfDOB(JTextField tfDOB) {
		this.tfDOB = tfDOB;
	}

	/**
	 * @return the tfMembershipDate
	 */
	public JTextField getTfMembershipDate() {
		return tfMembershipDate;
	}

	/**
	 * @param tfMembershipDate the tfMembershipDate to set
	 */
	public void setTfMembershipDate(JTextField tfMembershipDate) {
		this.tfMembershipDate = tfMembershipDate;
	}

	/**
	 * @return the tfEmail
	 */
	public JTextField getTfEmail() {
		return tfEmail;
	}

	/**
	 * @param tfEmail the tfEmail to set
	 */
	public void setTfEmail(JTextField tfEmail) {
		this.tfEmail = tfEmail;
	}
	
	//********************************
	// METHODS
	//********************************
	
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
