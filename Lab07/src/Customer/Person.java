package Customer;

import javax.swing.JOptionPane;

public class Person {
	protected String name;
	protected String address;
	protected String telephone;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.equals("")&&!name.matches("[A-Za-z]")){
			while (name.equals("")||!name.matches("[A-Za-z]"))
			name = JOptionPane.showInputDialog(null, "The name is invalid");
			return;
		}
		else {
		this.name = name;
		}
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		if (name.equals("")||!name.matches("[0-9]")){
			while (name.equals("")||!name.matches("[0-9]{10}"))
			name = JOptionPane.showInputDialog(null, "The phoneNumber is invalid");
			return;
		}
		else {
		this.telephone = telephone;
	}
	}
	public Person(String name, String address, String telephone) {
		super();
		this.name = name;
		this.address = address;
		this.telephone = telephone;
	}

	public Person() {
		super();
	}

}
