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
	private JButton deleteButton;
	
	//********************************
	// CONSTRUCTORS
	//********************************
	
	public ButtonPanel(){
		addButton = new JButton("Add");
		cancelButton = new JButton("Cancel");
		updateButton = new JButton("Update");
		deleteButton = new JButton("Delete");
		
		this.add(addButton);
		this.add(updateButton);
		this.add(deleteButton);
		this.add(cancelButton);
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
	
	public JButton getDeleteButton(){
		return deleteButton;
	}
	//********************************
	// METHODS
	//********************************
	
	public void setAddButtonsVisible(){
		addButton.setEnabled(true);
		cancelButton.setEnabled(true);
		updateButton.setEnabled(false);
		deleteButton.setEnabled(false);
	}
	
	public void setButtonsInvisible(){
		addButton.setEnabled(false);
		cancelButton.setEnabled(false);
		updateButton.setEnabled(false);
		deleteButton.setEnabled(false);
	}
	
	public void setUpdateButtonsVisible(){
		addButton.setEnabled(false);
		updateButton.setEnabled(true);
		deleteButton.setEnabled(true);
	}
	
} // end of class
