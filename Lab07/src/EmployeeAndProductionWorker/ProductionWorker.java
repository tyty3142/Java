package EmployeeAndProductionWorker;

public class ProductionWorker extends Employee {
	// Attributes
	private int shift;
	private double payRate;
	private String shiftName;
	
	public int Day_Shift = 1;
	public int night_shift = 2;

	public int getShift() {
		return shift;
	}

	public void setShift(int shift) {
		this.shift = shift;
	}

	public double getPayRate() {
		return payRate;
	}

	public void setPayRate(double payRate) {
		this.payRate = payRate;
	}

	public ProductionWorker(String empName, String number, String hireDate) {
		super();
	}

	public ProductionWorker(ProductionWorker worker, String empName, String number, String hireDate, double payRate,
			int shift) {
		super(empName, number, hireDate);
		this.shift = shift;
		this.payRate = payRate;
	}

	@Override
	public String toString() {
		return "The Employee's name is " + empName + "\nWith the ID number: " + number + "\nWho was hired on: "
				+ hireDate + "\nThe payrate for this employee is: " + payRate + "\nEmployee worked : " + shiftName;
	}

}
