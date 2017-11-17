package LongDistanceCalls;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonsPanel extends JPanel{

	private JButton calcButton;
	private JButton exitButton;
	
	private JPanel BottomPanel;

	public ButtonsPanel() {
		
		setLayout(new BorderLayout());
		
		calcButton = new JButton("Calculate");
		exitButton = new JButton("Exit");

		BottomPanel = new JPanel();
		BottomPanel.add(calcButton);
		BottomPanel.add(exitButton);
		
		this.add(BottomPanel, "South");

	}

	public JButton getCalcButton() {
		return calcButton;
	}

	public JButton getExitButton() {
		return exitButton;
	}
}