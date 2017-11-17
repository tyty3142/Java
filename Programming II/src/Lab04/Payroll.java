package Lab04;

public class Payroll {
	// attributes
	private String emName;
	private int IDnumber;
	private double pay;
	private int hrswork;

	// GETs and SETs
	public String getEmName() {
		return emName;
	}

	public void setEmName(String emName) {
		this.emName = emName;
	}

	public int getIDnumber() {
		return IDnumber;
	}

	public void setIDnumber(int iDnumber) {
		IDnumber = iDnumber;
	}

	public double getPay() {
		return pay;
	}

	public void setPay(double pay) {
		this.pay = pay;
	}

	public double getHrswork() {
		return hrswork;
	}

	public void setHrswork(int hrswork) {
		this.hrswork = hrswork;
	}

	// Constructors
	public Payroll(String emName, int iDnumber, double pay, int hrswork) {
		super();
		this.emName = emName;
		this.IDnumber = iDnumber;
		this.pay = pay;
		this.hrswork = hrswork;
	}

	public Payroll() {
		super();
	}

	@Override
	public String toString() {
		return "Employee name: " + emName + ", ID number: " + IDnumber;
	}

	// Methods
	public double getGrossPay() {
		return (this.pay * this.hrswork);
	}
}
