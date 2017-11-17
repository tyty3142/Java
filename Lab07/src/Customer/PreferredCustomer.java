package Customer;

public class PreferredCustomer extends Customer {

	private double purchases;
	private double discountLevel;
	private double totalAmount;

	public double getPurchases() {
		return purchases;
	}

	public void setPurchases(double purchases) {
		this.purchases = purchases;
	}

	public double gettotalAmount() {
		this.totalAmount = this.purchases - (this.purchases * this.discountLevel);

		return totalAmount;
	}
	
	public double getDiscountLevel() {
		if (this.purchases >= 2000) {
			discountLevel = .1;
		} else if (this.purchases >= 1500) {
			discountLevel = .07;
		} else if (this.purchases >= 1000) {
			discountLevel = .06;
		} else if (this.purchases >= 500) {
			discountLevel = .05;
		}

		return discountLevel;
	}

	public PreferredCustomer(String name, String address, String telephone, String customerNumber,
			boolean mailingList) {
		super(name, address, telephone, customerNumber, mailingList);
	}

	public PreferredCustomer(String name, String address, String telephone, String customerNumber, boolean mailingList,
			double purchases, double discountLevel) {
		super(name, address, telephone, customerNumber, mailingList);
		this.purchases = purchases;
		this.discountLevel = discountLevel;
	}

	@Override
	public String toString() {
		return "Customer name: " + name + "\nAddress: " + address + "\nTelephone: " + telephone
				+ "\nCustomer Number is: " + customerNumber + "\nMailing list: " + mailingList
				+ "\nTotal amount of purchases: $" + purchases + "\nYour discount was :" + (discountLevel * 100)
				+ "\nYour total Amount is : $" + totalAmount;

	}
}
