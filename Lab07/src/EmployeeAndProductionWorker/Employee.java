package EmployeeAndProductionWorker;

public class Employee {
	// Attributes
	protected String empName;
	protected String number;
	protected String hireDate;

	// Gets and Sets
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	public String getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	public Employee() {
		super();
	}

	// constructors
	public Employee(String empName, String number, String hireDate) {
		this.empName = empName;
		this.number = number;
		this.hireDate = hireDate;
	}

	public void isValidEmpName(String empName) {
		while (empName == "null") {
			System.out.println("Employee Name invalid.");
			return;
		}
	}

	@Override
	public String toString() {
		return "Employee name: " + empName + "\nEmployee Number: " + number + "\nWas hired on: " + hireDate;
	}

}
