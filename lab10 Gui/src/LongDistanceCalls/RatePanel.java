package LongDistanceCalls;

import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class RatePanel extends JPanel {

	private JRadioButton point5;
	private JRadioButton point7;
	private JRadioButton point12;
	
	private final double POINT5 = .05;
	private final double POINT7 = .07;
	private final double POINT12 = .12;
	
	public RatePanel(){
		setLayout(new GridLayout(3, 1));
		
		setBorder(BorderFactory.createTitledBorder("Select a Rate Category"));
	
		point5 = new JRadioButton("Daytime ($0.05 per minute)");
		point7 = new JRadioButton("Daytime ($0.07 per minute)");
		point12 = new JRadioButton("Daytime ($0.12 per minute)");
	
		ButtonGroup group = new ButtonGroup();
		group.add(point5);
		group.add(point7);
		group.add(point12);
		
		add(point5);
		add(point7);
		add(point12);
	}	
	public double getRateOption() {
		double value = 0;
		if (this.point5.isSelected()) {
			value += this.POINT5;
		}else if (this.point7.isSelected()) {
			value += this.POINT7;
		}else if (this.point12.isSelected()) {
			value += this.POINT12;
		}
		
		return value;
	}
}
