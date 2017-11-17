package Joe_Automotive;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class ButtonPanel extends JPanel {

	private JButton calcButton;
	private JButton exitButton;

	private JPanel BottomPanel;

	public ButtonPanel() {

		setLayout(new BorderLayout());

		calcButton = new JButton("Calculate");
		exitButton = new JButton("Exit");

		BottomPanel = new JPanel();
		BottomPanel.add(calcButton);
		BottomPanel.add(exitButton);

		this.add(BottomPanel, "South");

	}

	public JButton getCalcButton() {
		// TODO Auto-generated method stub
		return calcButton;
	}

	public JButton getExitButton() {
		return exitButton;
	}

}
