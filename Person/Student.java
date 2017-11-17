
public class Student extends Person{

	private String status;

	public Student(String firstName, String lastName, int age) {
		super(firstName, lastName, age);
		
		if(age > 24)
			this.status = "Non-traditional";
		else 
			this.status = "Traditional";
	} // end of constructor

	public Student(Student object){
		super(object.firstName, object.lastName, object.age);
		this.status = object.status;
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "Student: " + this.getFirstName() + " " + lastName + " (" + this.status + ")";
	}	
	
	public String fullName(){
		return this.firstName + " " + this.lastName;
	}
	
}
