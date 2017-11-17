package Tip_Calculator;

import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ResultPanel extends JPanel{

	private JLabel Tip;
	private JLabel Total;
	private JLabel Tippp;
	private JLabel TotPP;
	
	private JTextField TIP;
	private JTextField TOTAL;
	private JTextField TIPPP;
	private JTextField TOTPP;
	
	private JPanel first;
	private JPanel second;
	private JPanel third;
	private JPanel fourth;
	
	public ResultPanel(){
		
		setBorder(BorderFactory.createTitledBorder("Result"));
	
		Tip = new JLabel("Tip");
		Total = new JLabel("Total");
		Tippp = new JLabel("Tip per Person");
		TotPP = new JLabel("Total per Person");
		
		TIP = new JTextField(5);
		TOTAL = new JTextField(5);
		TIPPP = new JTextField(5);
		TOTPP = new JTextField(5);
		
		TIP.setEditable(false);
		TOTAL.setEditable(false);
		TIPPP.setEditable(false);
		TOTPP.setEditable(false);
		
		
		first = new JPanel();
		first.add(Tip, "West");
		first.add(TIP, "East");
		
		second = new JPanel();
		second.add(Total, "West");
		second.add(TOTAL, "East");
		
		third = new JPanel();
		third.add(Tippp, "West");
		third.add(TIPPP, "East");
		
		fourth = new JPanel();
		fourth.add(TotPP, "West");
		fourth.add(TOTPP, "East");
		
		setLayout(new GridLayout(4, 1));
		
		add(first);
		add(second);
		add(third);
		add(fourth);
	}
}
