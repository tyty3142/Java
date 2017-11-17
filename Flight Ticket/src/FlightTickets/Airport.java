package FlightTickets;

public class Airport {

	private String code;
	private String name;
	private String location;

	public Airport(String code, String name, String location) {
		super();
		this.code = code;
		this.name = name;
		this.location = location;
	}
	// copy Constructor
	public Airport(Airport airport) {
		this.code = airport.code;
		this.name = airport.name;
		this.location = airport.location;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	public String toString() {
		return code + " - " + name + " - "
				+ location + "\n";
	}

}
