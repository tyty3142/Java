package Customer;

import javax.swing.JOptionPane;

public class CustomerDemo {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setName(JOptionPane.showInputDialog(null, "What is the Customer's name?"));
		customer.setTelephone(JOptionPane.showInputDialog(null, "What is the Customer's telephone number?"));
		customer.setAddress(JOptionPane.showInputDialog(null, "What is the Customer's address?"));
		customer.setCustomerNumber(JOptionPane.showInputDialog("What is the Customer's number"));
		customer.isMailingList(JOptionPane.showConfirmDialog(null, "Is the Customer on the mailing list?", null, JOptionPane.YES_NO_OPTION));
		System.out.println(customer);
	}

}
