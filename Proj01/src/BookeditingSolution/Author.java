package BookeditingSolution;

/**
 * 
 * @author Andrey
 *
 */
public class Author extends Person {

	/*
	 * ARG CONSTRUCTOR
	 */
	public Author(String name, String email) {
		super(name, email);
	}

	/*
	 * COPY CONSTRUCTOR
	 */
	public Author(Author object) {
		super(object.name, object.email);

		this.affiliation = object.affiliation;
		this.bio = object.affiliation;
		this.title = object.title;
		this.Picturefilename = object.Picturefilename;
	}

	/*
	 * TO STRING
	 */
	@Override
	public String toString() {
		return "\nAuthor [name=" + name + ", title=" + title + ", email=" + email + ", affiliation=" + affiliation
				+ ", bio=" + bio + ", Picturefilename=" + Picturefilename + "]";
	}

} // end of class
