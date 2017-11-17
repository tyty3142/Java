package Tip_Calculator;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class SplitByPanel extends JPanel{

	private JSlider slider;
	
	public SplitByPanel(){
		setBorder(BorderFactory.createTitledBorder("Split By"));
		
		slider = new JSlider();
		this.slider = new JSlider(JSlider.HORIZONTAL, 1, 10, 5);
		slider.setMajorTickSpacing(1);
		slider.setMinorTickSpacing(1);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		
		add(slider);
	}
	public JSlider getSlider(){
		return slider;
	}
}
