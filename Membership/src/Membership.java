import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Membership {

	//********************************
	// ATTRIBUTES
	//********************************
	private String id;
	private String name;
	private String phone;
	private String state;
	private String company;
	private Calendar dob;
	private Calendar membershipDate;
	private String email;
	
	//********************************
	// GETS / SETS
	//********************************
	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}

	/**
	 * @param company the company to set
	 */
	public void setCompany(String company) {
		this.company = company;
	}

	/**
	 * @return the dob
	 */
	public Calendar getDob() {
		return dob;
	}

	/**
	 * @param dob the dob to set
	 */
	public void setDob(Calendar dob) {
		this.dob = dob;
	}

	/**
	 * @return the membershipDate
	 */
	public Calendar getMembershipDate() {
		return membershipDate;
	}

	/**
	 * @param membershipDate the membershipDate to set
	 */
	public void setMembershipDate(Calendar membershipDate) {
		this.membershipDate = membershipDate;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	//********************************
	// CONSTRUCTORS
	//********************************
	
	/**
	 * 
	 */
	public Membership() {
	}

	/**
	 * @param iD
	 * @param name
	 */
	public Membership(String iD, String name) {
		this.id = iD;
		this.name = name;
	}

	public Membership(Membership object) {
		this.id = object.id;
		this.name = object.name;
		this.phone = object.phone;
		this.state = object.state;
		this.company = object.company;
		this.dob = object.dob;
		this.membershipDate = object.membershipDate;
		this.email = object.email;
	}
	
	//********************************
	// TOSTRING
	//********************************

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Membership [id=" + id + ", name=" + name + ", phone=" + phone + ", state=" + state + ", company="
				+ company + ", dob=" + dob + ", membershipDate=" + membershipDate + ", email=" + email + "]";
	}

	//********************************
	// METHODS
	//********************************
	
	public String formatToSave() {
		SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
		
		return "\n" + id + "," + name + "," + phone + "," + state + "," + 
				company + "," + format.format(dob.getTime()) + "," + 
				format.format(membershipDate.getTime()) + "," + email;
	}
	
} // end of class
