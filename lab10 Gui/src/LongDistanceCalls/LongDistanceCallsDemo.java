package LongDistanceCalls;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JSlider;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class LongDistanceCallsDemo extends JFrame {

	private ButtonsPanel ButtonsPanel;
	private TimePanel TimePanel;
	private RatePanel RatePanel;

	public LongDistanceCallsDemo() {
		setTitle("Long Distance Calls");

		ButtonsPanel = new ButtonsPanel();
		TimePanel = new TimePanel();
		RatePanel = new RatePanel();

		add(RatePanel, "North");
		add(TimePanel, "Center");
		add(ButtonsPanel, "South");

		this.ButtonsPanel.getCalcButton().addActionListener(
				new CalcButtonListener());
		this.ButtonsPanel.getExitButton().addActionListener(
				new ExitButtonListener());

		pack();

		URL imageURL = null;
		Image image = null;
		try {
			imageURL = LongDistanceCallsDemo.class
					.getResource("/images/telephoto.jpg");
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
			UIManager
					.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			SwingUtilities.updateComponentTreeUI(this);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,
					"Error setting the look and feel.");
			System.exit(0);
		}

		this.setVisible(true);
		this.setResizable(false);
	}

	public static void main(String[] args) {
		new LongDistanceCallsDemo();
	}

	private class CalcButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			double value = (TimePanel.getSlider().getValue())
					* (RatePanel.getRateOption());

			JOptionPane.showMessageDialog(null, "The price of your call is $"
					+ value);
		}
	}// end calcbutton listener

	private class ExitButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}// end exitbutton listener
}
