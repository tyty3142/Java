package Gui;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class OrderCalc extends JFrame {

	private GreetingPanel topmessage;
	private BagelPanel bagelOptions;
	private BottomPanel buttonPanel;
	private CoffeePanel CoffeePanel;
	private ToppingPanel ToppingPanel;

	public OrderCalc() {
		setTitle("Order Calculator");

		topmessage = new GreetingPanel();
		bagelOptions = new BagelPanel();
		buttonPanel = new BottomPanel();
		CoffeePanel = new CoffeePanel();
		ToppingPanel = new ToppingPanel();

		add(topmessage, "North");
		add(bagelOptions, "West");
		add(buttonPanel, "South");
		add(CoffeePanel, "East");
		add(ToppingPanel, "Center");

		this.buttonPanel.getCalcButton().addActionListener(
				new CalcButtonListener());
		this.buttonPanel.getExitButton().addActionListener(
				new ExitButtonListener());
		this.bagelOptions.getBagel().addActionListener(
				new BagelListener());

		pack();
		
//		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		URL imageURL = null;
		Image image =null;
		try{
			imageURL = OrderCalc.class.getResource("/images/index.jpg");
			image = Toolkit.getDefaultToolkit().getImage(imageURL);
		} catch (Exception e){
			e.printStackTrace();
		}
		this.setIconImage(image);
		
		
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (int) ((dimension.getWidth() - this.getWidth()) /2);
		int y = (int) ((dimension.getHeight() - this.getHeight()) /2);
		this.setLocation(x, y);
		
		
		try{
			UIManager.setLookAndFeel(
					"com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			SwingUtilities.updateComponentTreeUI(this);
		}catch (Exception e)
		{
			JOptionPane.showMessageDialog(null, "Error setting the look and feel.");
			System.exit(0);
		}
//		try{
//			UIManager.setLookAndFeel(
//					"com.sun.java.swing.plaf.motif.MotifLookAndFeel");
//			SwingUtilities.updateComponentTreeUI(this);
//		}catch (Exception e)
//		{
//			JOptionPane.showMessageDialog(null, "Error setting the look and feel.");
//			System.exit(0);
//		}
		
		
		
		this.setVisible(true);
		this.setResizable(false);
	}

	public static void main(String[] args) {
		new OrderCalc();

	}
	
	private class BagelListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			bagelOptions.setBagelImage();
			
		}
		
	}

	private class CalcButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			double value = bagelOptions.getBagelOption()
					+ CoffeePanel.getCoffeeOption()
					+ ToppingPanel.getToppingOption();
			int satisfaction = buttonPanel.getSlider().getValue();
			
			JOptionPane.showMessageDialog(null, "The price of your purchase is $" + value +
					"\nSatisfaction Index: " + satisfaction);
		}
	}// end calcbutton listener

	private class ExitButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}// end exitbutton listener

}
