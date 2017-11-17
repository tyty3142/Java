package ParkingTicket;

public class ParkingMeter {

	private int timepurch;

	public int getTimepurch() {
		return timepurch;
	}

	public void setTimepurch(int timepurch) {
		this.timepurch = timepurch;
	}

	public ParkingMeter(int timepurch) {
		super();
		this.timepurch = timepurch;
	}

	public ParkingMeter() {
		super();
	}

	@Override
	public String toString() {
		return "Time Purch" + timepurch;
	}

}
