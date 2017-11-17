package ParkingTicket;

public class ParkingTicket {

	// attributes
	private ParkedCar car;
	private double fine;
	private PoliceOfficer officer;
	private ParkingMeter timepurch;

	// gets and sets


	
	public ParkingMeter getTimepurch() {	
		return timepurch;
	}

	public ParkedCar getCar() {
		return car;
	}

	public void setCar(ParkedCar car) {
		this.car = car;
	}

	public double getFine() {
		return fine;
	}

	public void setFine(double fine) {
		this.fine = fine;
	}

	public PoliceOfficer getOfficer() {
		return officer;
	}

	public void setOfficer(PoliceOfficer officer) {
		this.officer = officer;
	}

	public void setTimepurch(ParkingMeter timepurch) {
		this.timepurch = timepurch;
	}

	// constructors


	public ParkingTicket() {
		super();
	}

	public ParkingTicket(ParkedCar car, PoliceOfficer officer,
			ParkingMeter timepurch) {
		super();
		this.car = car;
		this.officer = officer;
		this.timepurch = timepurch;
	}
	
	public ParkingTicket(ParkingTicket ticket){
		this.car = ticket.car;
		this.fine = ticket.fine;
		this.officer = ticket.officer;
		this.timepurch = ticket.timepurch;
	}
	public double calcFine(int timeParked, int timepurch){
		if (timeParked > timepurch){
			if(timeParked>(timepurch-1)){
				fine = 25+((timepurch-1)*10);
			}
			else{
				fine = timepurch * 10;
			}
		}
		
		return fine;
	}

	@Override
	public String toString() {
		return car + "\nfine= $" + fine +  "\n" + officer ;
	}

	// To String Aggregation
	
}