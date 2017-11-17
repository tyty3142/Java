import javax.swing.JButton;
import javax.swing.JPanel;


public class ButtonPanel extends JPanel{
	private JButton cancelButton;
	
	public ButtonPanel(){
		cancelButton = new JButton("Cancel");
		add(cancelButton);
	}
}
	
