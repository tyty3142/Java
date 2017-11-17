package lab08;

public class CruiseShip extends ship {

	private int passengers;

	public int getPassengers() {
		return passengers;
	}

	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}

	public CruiseShip(String name, String yearBuilt) {
		super(name, yearBuilt);
	}
	public CruiseShip(CruiseShip object){
		super(object.name, object.yearBuilt);
		this.passengers = object.passengers;
	}

	@Override
	public String toString() {
		return "Ship name: " + name + "\nThis ship was built in: " + yearBuilt
				+ "\n" + passengers + " passengers are aboard the ship.";
	}
	public String ship(){
		return this.name + "" + this.yearBuilt;
	}


}
