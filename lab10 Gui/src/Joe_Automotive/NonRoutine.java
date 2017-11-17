package Joe_Automotive;

import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;

public class NonRoutine extends JPanel {

	private JTextField Parts;
	private JSlider Labor;
	private JLabel parts;
	private JLabel labor;
	private JPanel Labels;
	private JPanel Java;

	public NonRoutine() {
		setLayout(new GridLayout(2, 1));

		setBorder(BorderFactory.createTitledBorder("Nonroutine Services"));

		Parts = new JTextField(20);

		this.Labor = new JSlider(JSlider.HORIZONTAL, 0, 50, 0);
		Labor.setMajorTickSpacing(10);
		Labor.setMinorTickSpacing(5);
		Labor.setPaintLabels(true);
		Labor.setPaintTicks(true);

		labor = new JLabel("Hours of Labor: ");
		parts = new JLabel("Parts Charges: ");

		Labels = new JPanel();
		Labels.add(parts, "West");
		Labels.add(Parts, "East");

		Java = new JPanel();
		Java.add(labor, "West");
		Java.add(Labor, "East");

		this.add(Labels, "North");
		this.add(Java, "South");
	}

	public JSlider getSlider() {
		return Labor;
	}

	public JTextField getValue() {
		return Parts;
	}
}
