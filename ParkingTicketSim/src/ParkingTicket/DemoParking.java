package ParkingTicket;

public class DemoParking {

	public static void main(String[] args) {
		ParkingMeter meter = new ParkingMeter(2);
		ParkedCar car = new ParkedCar("Kia", "Spectra", "red", "V855226", 3);
		PoliceOfficer officer = new PoliceOfficer("Kendal Morse", "2146292");
		ParkingTicket ticket = new ParkingTicket(car, officer, meter);
		ticket.calcFine(car.getTimeParked(), meter.getTimepurch());
		if (car.getTimeParked() >= meter.getTimepurch()) {
			System.out.println(ticket);
		} else {
			System.out.println("Car does not deserve ticket");
		}

	}
}
