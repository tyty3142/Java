package Aggregation;

public class Person {
	private String firstName;
	private String lastName;
	private Address address;

	public Person(String firstName, String 
			lastName, Address address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}

	// end of constructor
	public String toString() {
		return this.firstName + " " + this.lastName
		+ ", " + this.address;
	}
	// end of method
}