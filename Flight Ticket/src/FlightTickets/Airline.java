package FlightTickets;

public class Airline {

	private String name;
	private String phone;

	public Airline(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}

	// Copy Constructor
	public Airline(Airline airline) {
		this.name = airline.name;
		this.phone = airline.phone;
	}
	// Flight Ticket diagram on D2L, 2nd line under Airline

	public String toString() {
		return name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
