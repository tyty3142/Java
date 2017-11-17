
public class Ta extends Person{

	private String skills;

	public Ta(String firstName, String lastName, int age) {
		super(firstName, lastName, age);
	}
	
	public Ta(Ta object){
		super(object.firstName, object.lastName, object.age);
		this.skills = object.skills;
	}
	
	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	@Override
	public String toString() {
		return "Ta [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	public String fullName(){
		return this.firstName + " " + this.lastName;
	}
}
