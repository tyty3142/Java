
public class Faculty extends Person{

	private String degree;

	public Faculty(String firstName, String lastName, int age) {
		super(firstName, lastName, age);
	}
	
	public Faculty(Faculty object) {
		super(object.firstName, object.lastName, object.age);
		this.degree = object.degree;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	@Override
	public String toString() {
		return "Faculty [degree=" + degree + ", firstName=" + firstName
				+ ", lastName=" + lastName + "]";
	}
	
	public String fullName(){
		return this.firstName + " " + this.lastName;
	}
	
}
