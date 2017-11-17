package Lab04;

import javax.swing.JOptionPane;

public class PayrollDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payroll em1 = new Payroll();
		String name = JOptionPane.showInputDialog("What is the Employee's name?");
		em1.setEmName(name);

		String Idnum = JOptionPane.showInputDialog("What is the Employee's ID number?");
		int id = Integer.parseInt(Idnum);
		em1.setIDnumber(id);

		String payment = JOptionPane.showInputDialog("What is the Employee's Pay rate?");
		double pay = Double.parseDouble(payment);
		em1.setPay(pay);

		String hrs = JOptionPane.showInputDialog("How many hours have the employee worked?");
		int hrswork = Integer.parseInt(hrs);
		em1.setHrswork(hrswork);

		System.out.println(em1);
		System.out.printf("Your net pay is: $ %.2f", em1.getGrossPay());
	}

}
