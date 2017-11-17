package Lab02;

public class linuxDistro {
	// Attributes
	private String Name;
	private String Developer;
	private int Year_of_initial_release;

	// GETs and SETs
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDeveloper() {
		return Developer;
	}

	public void setDeveloper(String developer) {
		Developer = developer;
	}

	public int getYear_of_initial_release() {
		return Year_of_initial_release;
	}

	public void setYear_of_initial_release(int year_of_initial_release) {
		Year_of_initial_release = year_of_initial_release;
	}

	public int getDistroAge() {
		return (2016 - this.Year_of_initial_release);
	}

}
