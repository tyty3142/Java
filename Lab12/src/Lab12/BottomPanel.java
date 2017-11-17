package Lab12;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class BottomPanel extends JPanel {

	private JButton AddButton;
	private JButton exitButton;

	private JPanel BottomPanel;

	public BottomPanel() {

		setLayout(new BorderLayout());
		
		AddButton = new JButton("Add");
		AddButton.setMnemonic(KeyEvent.VK_C);

		exitButton = new JButton("Exit");
		exitButton.setMnemonic(KeyEvent.VK_X);

		BottomPanel = new JPanel();
		BottomPanel.add(AddButton, "North");
		BottomPanel.add(exitButton, "South");
		
		this.add(BottomPanel);

	}

	public JButton getAddButton() {
		// TODO Auto-generated method stub
		return AddButton;
	}

	public JButton getExitButton() {
		return exitButton;
	}

}
