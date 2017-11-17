package Tip_Calculator;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class TipCalculator extends JFrame {

	private ButtonPanel ButtonPanel;
	private AmountPanel AmountPanel;
	private TipPanel TipPanel;
	private SplitByPanel Split;
	private ResultPanel Result;

	public TipCalculator() {
		

		setTitle("Tip Calculator");
		
		ButtonPanel = new ButtonPanel();
		AmountPanel = new AmountPanel();
		TipPanel = new TipPanel();
		Split = new SplitByPanel();
		Result = new ResultPanel();
		
		setLayout(new GridLayout(5, 1));
		add(AmountPanel);
		add(TipPanel);
		add(Split);
		add(ButtonPanel);
		add(Result);

		this.ButtonPanel.getCalcButton().addActionListener(new CalcButtonListener());
		this.ButtonPanel.getResetButton().addActionListener(new ResetButtonListener());

		pack();
		
		URL imageURL = null;
		Image image = null;
		try {
			imageURL = TipCalculator.class.getResource("/images/calculator.jpg");
			image = Toolkit.getDefaultToolkit().getImage(imageURL);
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.setIconImage(image);

		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (int) ((dimension.getWidth() - this.getWidth()) / 2);
		int y = (int) ((dimension.getHeight() - this.getHeight()) / 2);
		this.setLocation(x, y);

		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			SwingUtilities.updateComponentTreeUI(this);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error setting the look and feel.");
			System.exit(0);
		}

		this.setVisible(true);
		this.setResizable(false);
	}
	public static void main(String[] args) {
		new TipCalculator();

	}

	private class CalcButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			// JOptionPane.showMessageDialog(null, "The price of your purchase
			// is $" + value);

		}
	}// end calcbutton listener

	private class ResetButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			//Make Reset Button Work
		}
	}// end exitbutton listener

	

}
