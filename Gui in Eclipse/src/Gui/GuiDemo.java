package Gui;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GuiDemo extends JFrame {

	public GuiDemo() {
		JFrame window = new JFrame();
		window.setSize(700, 500);
		window.setTitle("My First GUI.... B- baka");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// window.setExtendedState(JFrame.MAXIMIZED_BOTH);

		JPanel mainPanel = new JPanel();
		mainPanel.setBackground(Color.orange);

		JLabel label = new JLabel("My First Label-kun");
		// label.setText("My First Label-kin"); //same thing as above

		JButton button = new JButton("Send Data");

		mainPanel.add(label);
		mainPanel.add(button);

		window.add(mainPanel);

		window.setVisible(true);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new GuiDemo();
	}

}
