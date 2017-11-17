package Gui;

import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class ToppingPanel extends JPanel {

	private JCheckBox CreChe;
	private JCheckBox Butter;
	private JCheckBox PeJelly;
	private JCheckBox BluJelly;
	
	private final double CREAM_CHEESE = .50;
	private final double BUTTER = .25;
	private final double PEACH_JELLY = .75;
	private final double BLUEBERRY_JELLY = .75;
	
	public ToppingPanel(){
		setLayout(new GridLayout(4, 1));

		setBorder(BorderFactory.createTitledBorder("Toppings"));
 
		CreChe = new JCheckBox("Cream Cheese");
		Butter = new JCheckBox("Butter");
		PeJelly = new JCheckBox("Peach Jelly");
		BluJelly = new JCheckBox("Blueberry Jelly");
		
		
		add(CreChe);
		add(Butter);
		add(PeJelly);
		add(BluJelly);
	}
	public double getToppingOption() {
		double value = 0;
		if (this.CreChe.isSelected()) {
			value += this.CREAM_CHEESE;
		}if (this.Butter.isSelected()) {
			value += this.BUTTER;
		}if (this.PeJelly.isSelected()) {
			value += this.PEACH_JELLY;
		}if (this.BluJelly.isSelected()) {
			value += this.BLUEBERRY_JELLY;
		}
		
		return value;
	}
}
