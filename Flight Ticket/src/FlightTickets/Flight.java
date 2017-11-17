package FlightTickets;

public class Flight {

	private String number;
	private String departureDate;
	private String departureTime;
	private String arrivalDate;
	private String arrivalTime;
	private int mileage;
	private Airline airline;
	private Airport origin;
	private Airport destination;

	// Gets and Sets
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public String getArrivaleDate() {
		return arrivalDate;
	}

	public void setArrivaleDate(String arrivaleDate) {
		this.arrivalDate = arrivaleDate;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public Airline getAirline() {
		return airline;
	}

	public void setAirline(Airline airline) {
		this.airline = airline;
	}

	public Airport getOrigin() {
		return origin;
	}

	public void setOrigin(Airport origin) {
		this.origin = origin;
	}

	public Airport getDestination() {
		return destination;
	}

	public void setDestination(Airport destination) {
		this.destination = destination;
	}

	// constructors

	public Flight(Flight flight) {
		this.arrivalDate = flight.arrivalDate;
		this.arrivalTime = flight.arrivalTime;
		this.departureDate = flight.departureDate;
		this.departureTime = flight.departureTime;
		this.mileage = flight.mileage;
		this.airline = flight.airline;
		this.destination = flight.destination;
		this.number = flight.number;
		this.origin = flight.origin;
	}

	public Flight() {
		super();
	}

	public Flight(String number, Airport origin, Airport destination, int mileage, Airline airline,
			String departureDate, String departureTime, String arrivalDate, String arrivalTime) {
		super();
		this.number = number;
		this.origin = origin;
		this.destination = destination;
		this.mileage = mileage;
		this.airline = airline;
		this.departureDate = departureDate;
		this.departureTime = departureTime;
		this.arrivalDate = arrivalDate;
		this.arrivalTime = arrivalTime;
	}

	@Override
	public String toString() {
		return "Number: " + number + "\nAirline: " + airline + "\nOrigin: " + origin + "Departure: " + departureDate
				+ " " + departureTime + "\n\nDestination: " + destination + "Arrival: " + arrivalDate + " "
				+ arrivalTime + "\n\nMileage: " + mileage;
	}

}
