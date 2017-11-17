package Gui;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BagelPanel extends JPanel {

	// attributes
	private JComboBox bagel;
	private String[] options = {"White", "Wheat"};
	private JLabel bagelImage;
	

	private final double WHITE_BAGEL = 1.25;
	private final double WHEAT_BAGEL = 1.50;

	// constructor
	public BagelPanel() {
		

		setBorder(BorderFactory.createTitledBorder("Bagel"));
		
		bagel = new JComboBox(options);
		
		ImageIcon image = new ImageIcon(this.getClass().getResource("/images/WhiteBagel.jpg"));
		bagelImage = new JLabel(image);
		
		add(bagel);
		add(bagelImage);

		
	}

	// methods
	public double getBagelOption() {
		double value = 0;
		if (this.bagel.getSelectedItem().equals("Wheat")) {
			value = this.WHEAT_BAGEL;
		} else if (this.bagel.getSelectedIndex() == 0) {
			value = this.WHITE_BAGEL;
		}
		return value;
	}
	
	public void setBagelImage(){
		if(bagel.getSelectedIndex() == 0){
			ImageIcon image = new ImageIcon(this.getClass().getResource("/images/WhiteBagel.jpg"));
			bagelImage.setIcon(image);
		}
		else if(bagel.getSelectedIndex()==1){
			ImageIcon image = new ImageIcon(this.getClass().getResource("/images/WheatBagel.jpg"));
			bagelImage.setIcon(image);
		}
	}
	
	public JComboBox getBagel(){
		return bagel;
	}
}
