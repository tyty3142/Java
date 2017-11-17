package lab11;

public class Membership {

	private String name;
	private String ID;
	private String email;
	private String phone;
	private String state;
	private String company;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public Membership( String iD, String name, String email, String phone, String state, String company) {
		super();
		ID = iD;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.state = state;
		this.company = company;
	}

	public Membership() {
		super();
	}

	@Override
	public String toString() {
		return "Membership name=" + name + ", ID=" + ID + ", email=" + email + ", phone=" + phone + ", state=" + state
				+ ", company=" + company;
	}

}
