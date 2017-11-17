package FlightTickets;

public class FlightTicket {

	private int number;
	private double price;
	private Flight flight;
	private Passenger passenger;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	public FlightTicket(FlightTicket flightTicket) {
		this.number = flightTicket.number;
		this.price = flightTicket.price;
		this.flight = flightTicket.flight;
		this.passenger = flightTicket.passenger;
	}

	public FlightTicket(int number, double price, Flight flight, Passenger passenger) {
		super();
		this.number = number;
		this.price = price;
		this.flight = flight;
		this.passenger = passenger;
	}

	@Override
	public String toString() {
		return "Ticket Number: " + number + "\nFlight: " + flight + "\nprice: $" + price + "\npassenger=" + passenger;
	}

}
