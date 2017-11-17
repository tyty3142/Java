package Joe_Automotive;

import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JPanel;

public class RoutinePanel extends JPanel {

	private JCheckBox Oil;
	private JCheckBox Lube;
	private JCheckBox Radiator;
	private JCheckBox Trans;
	private JCheckBox Inspect;
	private JCheckBox Muffler;
	private JCheckBox Tire;

	private final double OIL = 26;
	private final double LUBE = 18;
	private final double RADIATOR = 30;
	private final double TRANS = 80;
	private final double INSPECT = 15;
	private final double MUFFLER = 100;
	private final double TIRE = 20;

	public RoutinePanel() {
		setLayout(new GridLayout(7, 1));

		setBorder(BorderFactory.createTitledBorder("Routine Services"));

		Oil = new JCheckBox("Oil Change ($26.00)");
		Lube = new JCheckBox("Lube Job ($18.00)");
		Radiator = new JCheckBox("Radiator Flush ($30.00)");
		Trans = new JCheckBox("Transmission Flush ($80.00)");
		Inspect = new JCheckBox("Inspection ($15.00)");
		Muffler = new JCheckBox("Muffler Replacement ($100.00)");
		Tire = new JCheckBox("Tire Rotation ($20.00)");

		add(Oil);
		add(Lube);
		add(Radiator);
		add(Trans);
		add(Inspect);
		add(Muffler);
		add(Tire);
	}

	public double getRoutineOption() {
		double value = 0;
		if (this.Oil.isSelected()) {
			value += this.OIL;
		}
		if (this.Lube.isSelected()) {
			value += this.LUBE;
		}
		if (this.Radiator.isSelected()) {
			value += this.RADIATOR;
		}
		if (this.Trans.isSelected()) {
			value += this.TRANS;
		}
		if (this.Inspect.isSelected()) {
			value += this.INSPECT;
		}
		if (this.Muffler.isSelected()) {
			value += this.MUFFLER;
		}
		if (this.Tire.isSelected()) {
			value += this.TIRE;
		}

		return value;
	}
}
