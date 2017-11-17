package Gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Converter extends JFrame {
	
	// Attributes
	private JPanel mainPanel;
	private JLabel message;
	private JTextField kilometers;
	private JButton calcButton;
	private JLabel result;
	
	

	public Converter() {
		setSize(350, 250);
		setTitle("Kilometer Converter");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		message = new JLabel("Enter a distance in kilometers");
		kilometers = new JTextField(10);
		result = new JLabel();
		calcButton = new JButton("Calculate");
		
		mainPanel = new JPanel();
		mainPanel.add(message);
		mainPanel.add(kilometers);
		mainPanel.add(calcButton);
		mainPanel.add(result);
		
		this.add(mainPanel);

		calcButton.addActionListener(new CalcButtonListener());
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Converter();

	}
	
	private class CalcButtonListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			int km = Integer.parseInt(kilometers.getText());
			double miles = km*0.621;
			result.setText(miles+"");
		}
	}

}
