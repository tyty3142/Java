package Tip_Calculator;

import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class TipPanel extends JPanel {

	private JRadioButton t10;
	private JRadioButton t15;
	private JRadioButton t20;
	private JRadioButton t25;

	private final double T10 = .1;
	private final double T15 = .15;
	private final double T20 = .2;
	private final double T25 = .25;

	public TipPanel() {
		setLayout(new GridLayout(1, 4));

		setBorder(BorderFactory.createTitledBorder("Tip"));

		t10 = new JRadioButton("10%");
		t15 = new JRadioButton("15%");
		t20 = new JRadioButton("20%");
		t25 = new JRadioButton("25%");

		ButtonGroup group = new ButtonGroup();
		group.add(t10);
		group.add(t15);
		group.add(t20);
		group.add(t25);

		add(t10);
		add(t15);
		add(t20);
		add(t25);
	}

	public double getTipOption() {
		double value = 0;
		if (this.t10.isSelected()) {
			value = this.T10;
		} else if (this.t15.isSelected()) {
			value = this.T15;
		} else if (this.t20.isSelected()) {
			value = this.T20;
		} else if (this.t25.isSelected()) {
			value = this.T25;
		}
		return value;
	}
}
