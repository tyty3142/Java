package Gui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class GreetingPanel extends JPanel {

	private JLabel message;

	public GreetingPanel() {
		message = new JLabel("Welcome to Brandi's Bagel House");
		message.setFont(new Font("Comic Sans MS", Font.BOLD + Font.ITALIC, 24));
		message.setForeground(Color.pink);
		
		add(message);
	}
}
