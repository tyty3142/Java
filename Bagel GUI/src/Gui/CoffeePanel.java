package Gui;

import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class CoffeePanel extends JPanel {

	private JRadioButton None;
	private JRadioButton Reg;
	private JRadioButton Decaf;
	private JRadioButton Capp;

	private final double NONE = 0.0;
	private final double REGULAR = 1.25;
	private final double DECAF = 1.25;
	private final double CAPPUCCINO = 2.00;

	public CoffeePanel() {
		setLayout(new GridLayout(4, 1));

		setBorder(BorderFactory.createTitledBorder("Coffee Choice"));

		None = new JRadioButton("None");
		Reg = new JRadioButton("Regular Coffee");
		Decaf = new JRadioButton("Decaff Coffee");
		Capp = new JRadioButton("Cappuccino");

		ButtonGroup group = new ButtonGroup();
		group.add(None);
		group.add(Reg);
		group.add(Decaf);
		group.add(Capp);

		add(None);
		add(Reg);
		add(Decaf);
		add(Capp);

	}

	public double getCoffeeOption() {
		double value = 0;
		if (this.Reg.isSelected()) {
			value = this.REGULAR;
		} else if (this.Decaf.isSelected()) {
			value = this.DECAF;
		} else if (this.Capp.isSelected()) {
			value = this.CAPPUCCINO;
		} else if (this.None.isSelected()) {
			value = this.NONE;
		}
		return value;
	}
}
