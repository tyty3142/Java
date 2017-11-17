package Lab12_2;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SummaryPanel extends JPanel{

	
	//add summaries for Newest Member and list of States represented
	
	//********************************
	// ATTRIBUTES
	//********************************
	
	private JLabel labelTotal;
	private JLabel labelOldest;
	private JLabel labelTopState;
	
	private JTextField tfTotal;
	private JTextField tfOldest;
	private JTextField tfTopState;
	
	//********************************
	// CONSTRUCTORS
	//********************************
	
	public SummaryPanel(){
		setLayout(new GridLayout(6,1));
		
		labelTotal = new JLabel("Total Members");
		tfTotal = new JTextField(15);
		tfTotal.setEditable(false);
		
		labelOldest = new JLabel("Oldest Member");
		tfOldest = new JTextField(15);
		tfOldest.setEditable(false);
		
		labelTopState = new JLabel("Top State");
		tfTopState = new JTextField(15);
		tfTopState.setEditable(false);
		
		this.add(labelTotal);
		this.add(tfTotal);
		
		this.add(labelOldest);
		this.add(tfOldest);
		
		this.add(labelTopState);
		this.add(tfTopState);
		
	} 

	//********************************
	// GETS AND SETS
	//********************************
	
	public JLabel getLabelTotal() {
		return labelTotal;
	}

	public void setLabelTotal(JLabel labelTotal) {
		this.labelTotal = labelTotal;
	}

	public JLabel getLabelOldest() {
		return labelOldest;
	}

	public void setLabelOldest(JLabel labelOldest) {
		this.labelOldest = labelOldest;
	}

	public JLabel getLabelTopState() {
		return labelTopState;
	}

	public void setLabelTopState(JLabel labelTopState) {
		this.labelTopState = labelTopState;
	}

	/**
	 * @return the tfTotal
	 */
	public JTextField getTfTotal() {
		return tfTotal;
	}

	/**
	 * @param tfTotal the tfTotal to set
	 */
	public void setTfTotal(JTextField tfTotal) {
		this.tfTotal = tfTotal;
	}

	/**
	 * @return the tfOldest
	 */
	public JTextField getTfOldest() {
		return tfOldest;
	}

	/**
	 * @param tfOldest the tfOldest to set
	 */
	public void setTfOldest(JTextField tfOldest) {
		this.tfOldest = tfOldest;
	}

	/**
	 * @return the tfTopState
	 */
	public JTextField getTfTopState() {
		return tfTopState;
	}

	/**
	 * @param tfTopState the tfTopState to set
	 */
	public void setTfTopState(JTextField tfTopState) {
		this.tfTopState = tfTopState;
	}

} // end of class
