package proj01;

public abstract class Person {

	protected String name;
	protected String email;
	protected String title;
	protected String affiliation;
	protected String bio;
	protected String Picturename;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAffiliation() {
		return affiliation;
	}

	public void setAffiliation(String affiliation) {
		this.affiliation = affiliation;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public String getPicturename() {
		return Picturename;
	}

	public void setPicturename(String picturename) {
		Picturename = picturename;
	}

	public Person(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public Person(Person person) {
		this.name = person.name;
		this.email = person.email;
		this.title = person.title;
		this.affiliation = person.affiliation;
		this.bio = person.bio;
		this.Picturename = person.Picturename;
	}

	public Person(String name, String email, String title, String affiliation, String bio, String picturename) {
		super();
		this.name = name;
		this.email = email;
		this.title = title;
		this.affiliation = affiliation;
		this.bio = bio;
		Picturename = picturename;
	}

	@Override
	public String toString() {
		return "Name: " + name + "\nEmail: " + email + "\nTitle: " + title + "\nAffiliation: " + affiliation + "\nBio: "
				+ bio + "\nPicture Name: " + Picturename;
	}

}
