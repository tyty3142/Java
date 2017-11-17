package Lab04;

import javax.swing.JOptionPane;

public class SavingsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount savings = new SavingsAccount();
		savings.setBalance(
				Double.parseDouble(JOptionPane.showInputDialog("Please enter in your starting savings account:")));
		savings.setMonth(Double.parseDouble(
				JOptionPane.showInputDialog("How many months has it been since you've opened your account?")));
		savings.setAnrate(Double.parseDouble(JOptionPane.showInputDialog("Please enter in the annual rate")));

		for (int i = 0; i < savings.getMonth(); i++) {
			savings.setDeposit(Double.parseDouble(JOptionPane.showInputDialog("How much have you deposited?")));
			savings.setWithdrawl(Double.parseDouble(JOptionPane.showInputDialog("How much have you withdrawn?")));
			savings.getWithdrawl();
			savings.getDeposit();
			savings.getTotdep();
			savings.getmonthbal();
			savings.getTotwith();
			savings.getTotmonint();
		}
		System.out.print(savings);
	}

}
