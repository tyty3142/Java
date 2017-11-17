package Tip_Calculator;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AmountPanel extends JPanel{

	private JTextField amount;
	
	public AmountPanel(){
		setBorder(BorderFactory.createTitledBorder("Amount"));
		
		amount = new JTextField(15);
		
		add(amount);
	}

	public JTextField getAmount() {
		return amount;
	}

	public void setAmount(JTextField amount) {
		this.amount = amount;
	}
	
}
