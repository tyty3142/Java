import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonPanel extends JPanel{

	//********************************
	// ATTRIBUTES
	//********************************
	
	private JButton addButton;
	private JButton cancelButton;
	
	//********************************
	// CONSTRUCTORS
	//********************************
	
	public ButtonPanel(){
		addButton = new JButton("Add");
		cancelButton = new JButton("Cancel");
		
		this.add(addButton);
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
	
	//********************************
	// METHODS
	//********************************
	
} // end of class
