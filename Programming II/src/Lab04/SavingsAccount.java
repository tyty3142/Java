package Lab04;

public class SavingsAccount {

	// attributes
	private double anrate;
	private double balance;
	private double withdrawl;
	private double deposit;
	private double monthInt;
	private double totwith;
	private double totdep;
	private double totmonint;
	private double month;

	// GETS and SETS
	public double getAnrate() {
		return anrate;
	}

	public void setAnrate(double anrate) {
		this.anrate = anrate;
	}

	public double getTotwith() {
		return this.totwith = totwith + this.withdrawl;
	}

	public double getTotdep() {
		return this.totdep = totdep + this.deposit;
	}

	public double getTotmonint() {
		return this.totmonint = totmonint + this.monthInt;
	}

	public double getBalance() {
		return (balance);
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getWithdrawl() {
		return balance = this.balance - this.withdrawl;
	}

	public void setWithdrawl(double withdrawl) {
		this.withdrawl = withdrawl;
	}

	public double getDeposit() {
		return this.balance = this.balance + this.deposit;
	}

	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}

	public double getMonth() {
		return month;
	}

	public void setMonth(double month) {
		this.month = month;
	}

	public double getMonthInt() {
		return (this.monthInt = this.anrate / 12);
	}

	public void setMonthInt(double monthInt) {
		this.monthInt = monthInt;
	}

	public double getmonthbal() {
		return (this.balance = (this.monthInt * this.balance) + this.balance);
	}

	// Constructors

	public SavingsAccount() {
		super();
	}

	public SavingsAccount(double anrate, double balance, double withdrawl, double deposit, double monthInt) {
		super();
		this.anrate = anrate;
		this.balance = balance;
		this.withdrawl = withdrawl;
		this.deposit = deposit;
		this.monthInt = monthInt;
	}

	@Override
	public String toString() {
		return " Your ending balance is $" + this.balance + " \n Your total withdrawls: $" + this.totwith
				+ " \n Your total deposits: $" + this.totdep + " \n And your total monthly interest: $"
				+ this.totmonint;
	}

	// Methods

}
