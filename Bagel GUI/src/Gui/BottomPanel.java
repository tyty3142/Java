package Gui;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class BottomPanel extends JPanel {

	private JButton calcButton;
	private JButton exitButton;
	private JSlider slider;

	private JPanel topPanel;
	private JPanel BottomPanel;

	public BottomPanel() {

		setLayout(new BorderLayout());

		slider = new JSlider();
		this.slider = new JSlider(JSlider.HORIZONTAL, 0, 10, 5);
		slider.setMajorTickSpacing(2);
		slider.setMinorTickSpacing(1);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);

		topPanel = new JPanel();
		topPanel.add(slider);

		calcButton = new JButton("Calculate");
		calcButton.setMnemonic(KeyEvent.VK_C);

		exitButton = new JButton("Exit");
		exitButton.setMnemonic(KeyEvent.VK_X);

		BottomPanel = new JPanel();
		BottomPanel.add(calcButton);
		BottomPanel.add(exitButton);

		this.add(topPanel, "North");
		this.add(BottomPanel, "South");

	}

	public JButton getCalcButton() {
		// TODO Auto-generated method stub
		return calcButton;
	}

	public JButton getExitButton() {
		return exitButton;
	}

	public JSlider getSlider() {
		return slider;
	}
}
