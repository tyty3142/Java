package EmployeeAndProductionWorker;

import javax.swing.JOptionPane;

public class DemoEmpWork {

	public static void main(String[] args) {
		ProductionWorker worker = new ProductionWorker(null, null, null);
		worker.empName = JOptionPane.showInputDialog(null, "What is the employee's name?");
		worker.isValidEmpName(worker.empName = JOptionPane.showInputDialog(null, "What is the employee's name?"));
		worker.hireDate = JOptionPane.showInputDialog(null, "When was the employee hired?");
		worker.number = JOptionPane.showInputDialog(null, "What is the employee's number? \nIn the format XXX-A \nWhere the X's are numbers and the A is a letter");
		worker.setPayRate(Double.parseDouble(JOptionPane.showInputDialog(null, "What is the employee's payrate?")));
		worker.setShift(Integer.parseInt(JOptionPane.showInputDialog(null, "What is the employee's shift? \n1 = Day shift and 2 = Night shift")));
		JOptionPane.showMessageDialog(null, worker);
	}
}
