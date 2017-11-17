package Customer;

import javax.swing.JOptionPane;

public class PreferredCustomerDemo {

	public static void main(String[] args){
		PreferredCustomer prefcustomer = new PreferredCustomer(null, null, null, null, false);
		prefcustomer.setName(JOptionPane.showInputDialog(null, "What is the Customer's name?"));
		prefcustomer.setTelephone(JOptionPane.showInputDialog(null, "What is the Customer's telephone number?"));
		prefcustomer.setAddress(JOptionPane.showInputDialog(null, "What is the Customer's address?"));
		prefcustomer.setCustomerNumber(JOptionPane.showInputDialog("What is the Customer's number"));
		prefcustomer.isMailingList(JOptionPane.showConfirmDialog(null, "Is the Customer on the mailing list?", null, JOptionPane.YES_NO_OPTION));
		prefcustomer.setPurchases(Double.parseDouble(JOptionPane.showInputDialog("What is the Total amount of purchases?")));
		
		prefcustomer.getDiscountLevel();
		prefcustomer.gettotalAmount();
		
		JOptionPane.showMessageDialog(null, prefcustomer);
	}

}
