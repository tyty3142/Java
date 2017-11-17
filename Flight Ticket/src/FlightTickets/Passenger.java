package FlightTickets;

import java.util.Calendar;

public class Passenger {

	private String firstName;
	private String lastName;
	private String email;
	private int frequentFlyerPoints;
	private String membershipDate;

	// Gets and Sets
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getFrequentFlyerPoints(int years) {
		if (years >= 5) {
			frequentFlyerPoints = +100;
		}
		if (years >= 10) {
			frequentFlyerPoints = +200;
		}
		return frequentFlyerPoints;
	}

	public void setFrequentFlyerPoints(int frequentFlyerPoints) {
		this.frequentFlyerPoints = frequentFlyerPoints;
	}

	public String getMembershipDate() {
		return membershipDate;
	}

	public void setMembershipDate(String membershipDate) {
		this.membershipDate = membershipDate;
	}

	// constructors

	public int timeSinceMembership() {
		int years = 0;

		// check if membershipDate is not null
		if (this.membershipDate != null) {

			// get todays year
			Calendar today = Calendar.getInstance();
			int tYear = today.get(Calendar.YEAR);

			// get member year
			String[] memberDate = this.membershipDate.split("/");
			int mYear = Integer.parseInt(memberDate[2]);

			// calc total years
			years = tYear - mYear;
		}
		return years;
	}

	public String toString() {
		if (this.membershipDate.equals(null)) {
			return ("No");
		} else {
			return (this.firstName + " " + this.lastName + "\nFrequent Flyer: member since " + this.membershipDate + "("
					+ this.frequentFlyerPoints + " points)");
		}
	}

	// copy constructor
	public Passenger(Passenger passenger) {
		this.firstName = passenger.firstName;
		this.lastName = passenger.lastName;
		this.email = passenger.email;
		this.frequentFlyerPoints = passenger.frequentFlyerPoints;
		this.membershipDate = passenger.membershipDate;
	}

	public Passenger(String firstName, String lastName, String email, int frequentFlyerPoints, String membershipDate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.frequentFlyerPoints = frequentFlyerPoints;
		this.membershipDate = membershipDate;
	}

}
