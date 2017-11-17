package FlightTickets;

public class FlightTicketDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int years = 0;
		Passenger pass = new Passenger("John", "Doe", "jdoe@example.com", 930, "09/13/1997");
		Airline airline = new Airline("Delta", "123-456-789");
		Airport origin = new Airport("SLO", "Lambert-St. Louis International Airport", "St. Louis, MO");
		Airport destination = new Airport("JFK", "John F Kennedy Airport", "New York, NY");
		Flight flight = new Flight("D1201", origin, destination, 879, airline, "02/02/2015", "09:45",
				"02/10/2015", "2:30");
		FlightTicket ticket = new FlightTicket(223344, 250.0, flight, pass);
		System.out.println(ticket);
		
	}
}
