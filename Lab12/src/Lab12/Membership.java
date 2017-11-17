package Lab12;

public class Membership {

	private String ID;
	private String Name;
	private String Phone;
	private String State;
	private String Company;
	private String DOB;
	private String MemDate;
	private String Email;
	
	public Membership(String iD, String name, String phone, String state, String company, String dOB, String memDate,
			String email) {
		super();
		ID = iD;
		Name = name;
		Phone = phone;
		State = state;
		Company = company;
		DOB = dOB;
		MemDate = memDate;
		Email = email;
	}

	public Membership() {
		super();
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getCompany() {
		return Company;
	}

	public void setCompany(String company) {
		Company = company;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public String getMemDate() {
		return MemDate;
	}

	public void setMemDate(String memDate) {
		MemDate = memDate;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	@Override
	public String toString() {
		return "Membership ID=" + ID + ", Name=" + Name + ", Phone=" + Phone + ", State=" + State + ", Company="
				+ Company + ", DOB=" + DOB + ", MemDate=" + MemDate + ", Email=" + Email + "]";
	}
	
	
	
}
