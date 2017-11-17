package Joe_Automotive;

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

public class DemoforAutomotive extends JFrame {

	private RoutinePanel RoutinePanel;
	private ButtonPanel ButtonPanel;
	private NonRoutine NonRoutine;

	public DemoforAutomotive() {
		setTitle("Joe's Automotive");

		RoutinePanel = new RoutinePanel();
		ButtonPanel = new ButtonPanel();
		NonRoutine = new NonRoutine();

		add(RoutinePanel, "North");
		add(NonRoutine, "Center");
		add(ButtonPanel, "South");

		this.ButtonPanel.getCalcButton().addActionListener(new CalcButtonListener());
		this.ButtonPanel.getExitButton().addActionListener(new ExitButtonListener());
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			SwingUtilities.updateComponentTreeUI(this);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error setting the look and feel.");
			System.exit(0);
		}

		pack();

		URL imageURL = null;
		Image image = null;
		try {
			imageURL = DemoforAutomotive.class.getResource("/images/index.jpg");
			image = Toolkit.getDefaultToolkit().getImage(imageURL);
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.setIconImage(image);

		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (int) ((dimension.getWidth() - this.getWidth()) / 2);
		int y = (int) ((dimension.getHeight() - this.getHeight()) / 2);
		this.setLocation(x, y);

		this.setVisible(true);
		this.setResizable(false);
	}

	private class CalcButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			int slider = NonRoutine.getSlider().getValue();
			String text = NonRoutine.getValue().getText();
			double textvalue = Double.parseDouble(text);
			double value = RoutinePanel.getRoutineOption() + (NonRoutine.getSlider().getValue() * 35) + textvalue;
			JOptionPane.showMessageDialog(null, "The price of your purchase is $" + (value));
		}
	}// end calcbutton listener

	private class ExitButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}// end exitbutton listener

	public static void main(String[] args) {
		new DemoforAutomotive();
	}
}
