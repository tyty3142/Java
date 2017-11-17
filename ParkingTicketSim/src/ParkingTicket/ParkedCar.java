package ParkingTicket;

public class ParkedCar {

	// attributes
	private String carMake;
	private String carModel;
	private String carColor;
	private String LicenseNum;
	private int timeParked;

	// Gets and Sets
	public String getCarMake() {
		return carMake;
	}

	public void setCarMake(String carMake) {
		this.carMake = carMake;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public String getCarColor() {
		return carColor;
	}

	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}

	public String getLicenseNum() {
		return LicenseNum;
	}

	public void setLicenseNum(String licenseNum) {
		this.LicenseNum = licenseNum;
	}

	public int getTimeParked() {
		return timeParked;
	}

	public void setTimeParked(int timeParked) {
		this.timeParked = timeParked;
	}

	// constructors
	public ParkedCar(String carMake, String carModel, String carColor, String licenseNum, int timeParked) {
		super();
		this.carMake = carMake;
		this.carModel = carModel;
		this.carColor = carColor;
		this.LicenseNum = licenseNum;
		this.timeParked = timeParked;
	}

	// make it all have a toString so that it will
	// print out like the plane ticket!
	@Override
	public String toString() {
		return "Car Make: " + carMake + "\nCar model: " + carModel 
				+ "\nCar color: " + carColor + "\nLicense Plate Num: "
				+ LicenseNum + "\nTime parked: " + timeParked;
	}

	public ParkedCar() {
		super();
	}

}
