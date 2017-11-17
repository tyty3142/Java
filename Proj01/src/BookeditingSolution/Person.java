package BookeditingSolution;

/**
 * 
 * @author Andrey
 *
 */
public abstract class Person {

	/*
	 * ATTRIBUTES
	 */
	protected String name;
	protected String title;
	protected String email;
	protected String affiliation;
	protected String bio;
	protected String Picturefilename;

	/*
	 * ARG CONSTRUCTOR
	 */
	public Person(String name, String email) {
		this.name = name;
		this.email = email;
	}

	/*
	 * GETs and SETs
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getPicturefilename() {
		return Picturefilename;
	}

	public void setPicturefilename(String picturefilename) {
		Picturefilename = picturefilename;
	}

	/*
	 * TO STRING
	 */
	@Override
	public String toString() {
		return "\nPerson [name=" + name + ", title=" + title + ", email=" + email + ", affiliation=" + affiliation
				+ ", bio=" + bio + ", Picturefilename=" + Picturefilename + "]";
	}

}// end of class
