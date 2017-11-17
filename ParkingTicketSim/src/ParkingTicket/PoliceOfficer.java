package ParkingTicket;

public class PoliceOfficer {

	// attributes
	private String name;
	private String number;
	private ParkedCar timeparked;
	private ParkingMeter timePurch;

	// gets and sets
	public String getName() {
		return name;
	}

	public ParkedCar getTimeparked() {
		return timeparked;
	}

	public void setTimeparked(ParkedCar timeparked) {
		this.timeparked = timeparked;
	}

	public ParkingMeter getTimePurch() {
		return timePurch;
	}

	public void setTimePurch(ParkingMeter timePurch) {
		this.timePurch = timePurch;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	// Constructor
	public PoliceOfficer(String name, String number) {
		super();
		this.name = name;
		this.number = number;
	}

	public PoliceOfficer() {
		super();
	}
	// methods

	// ToString
	@Override
	public String toString() {
		return "Police Officer name: " + name + "\nBadge Number: " + number;
	}
}