package Tip_Calculator;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonPanel extends JPanel {
	private JButton calcButton;
	private JButton resetButton;

	public ButtonPanel() {


		calcButton = new JButton("Calculate");
		resetButton = new JButton("Reset");

		add(calcButton, "West");
		add(resetButton, "East");
	}

	public JButton getCalcButton() {
		// TODO Auto-generated method stub
		return calcButton;
	}

	public JButton getResetButton() {
		return resetButton;
	}
}
