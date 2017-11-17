package Lab12_2;
import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonPanel extends JPanel{

	//********************************
	// ATTRIBUTES
	//********************************
	
	private JButton addButton;
	private JButton cancelButton;
	private JButton updateButton;
	
	//********************************
	// CONSTRUCTORS
	//********************************
	
	public ButtonPanel(){
		addButton = new JButton("Add");
		cancelButton = new JButton("Cancel");
		updateButton = new JButton("Update");
		
		this.add(addButton);
		this.add(cancelButton);
		this.add(updateButton);
	}

	//********************************
	// GETS AND SETS
	//********************************
	
	/**
	 * @return the addButton
	 */
	public JButton getAddButton() {
		return addButton;
	}

	/**
	 * @return the cancelButton
	 */
	public JButton getCancelButton() {
		return cancelButton;
	}
	
	public JButton getUpdateButton(){
		return updateButton;
	}
	
	//********************************
	// METHODS
	//********************************
	
} // end of class
