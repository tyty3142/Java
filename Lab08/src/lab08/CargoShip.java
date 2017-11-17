package lab08;

public class CargoShip extends ship {

	private int tonnage;

	public int getTonnage() {
		return tonnage;
	}

	public void setTonnage(int tonnage) {
		this.tonnage = tonnage;
	}

	public CargoShip(String name, String yearBuilt) {
		super(name, yearBuilt);
	}

	public CargoShip(CargoShip object) {
		super(object.name, object.yearBuilt);
		this.tonnage = object.tonnage;
	}

	@Override
	public String toString() {
		return "Ship name: " + name + "\nThis ship was built in: " + yearBuilt + "\n" + tonnage
				+ " Tons is on the ship";
	}

	public String ship() {
		return this.name + "" + this.yearBuilt;
	}

}
