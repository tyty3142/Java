package Customer;

public abstract class Customer extends Person {

	protected String customerNumber;
	protected boolean mailingList;

	public Customer(String name, String address, String telephone, String customerNumber, boolean mailingList) {
		super(name, address, telephone);
		this.customerNumber = customerNumber;
		this.mailingList = mailingList;
	}

	public Customer(String name, String address, String telephone) {
		super(name, address, telephone);
	}

	public Customer() {
		super();
	}

	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	public boolean isMailingList(int response) {
		if (response == 1) {
			mailingList = false;
		} else if (response == 0) {
			mailingList = true;
		}
		return mailingList;
	}

	public void setMailingList(boolean mailingList) {
		this.mailingList = mailingList;
	}

	@Override
	public String toString() {
		return "Customer name: " + name + "\nAddress: " + address + "\nTelephone: " + telephone
				+ "\nCustomer Number is: " + customerNumber + "\nMailing list: " + mailingList;
	}

}
