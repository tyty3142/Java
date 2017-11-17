package lab08;

public abstract class ship {

	protected String name;
	protected String yearBuilt;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getYearBuilt() {
		return yearBuilt;
	}

	public void setYearBuilt(String yearBuilt) {
		this.yearBuilt = yearBuilt;
	}

	public ship(String name, String yearBuilt) {
		this.name = name;
		this.yearBuilt = yearBuilt;
	}

	public ship() {
		super();
	}

	public abstract String ship();

	@Override
	public String toString() {
		return name + " " + yearBuilt;
	}

}
