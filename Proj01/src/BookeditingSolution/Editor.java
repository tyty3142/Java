package BookeditingSolution;

/**
 * 
 * @author Andrey
 *
 */
public class Editor extends Person {

	/*
	 * ARG CONSTRUCTOR
	 */
	public Editor(String name, String email) {
		super(name, email);
		// TODO Auto-generated constructor stub
	}

	/*
	 * COPY CONSTRUCTOR
	 */
	public Editor(Editor object) {
		super(object.name, object.email);
		this.affiliation = object.affiliation;
		this.bio = object.bio;
		this.title = object.title;
		this.Picturefilename = object.Picturefilename;
	}

	/* 
	 * TO STRING
	 */
	@Override
	public String toString() {
		return "\nEditor [name=" + name + ", title=" + title + ", email=" + email + ", affiliation=" + affiliation
				+ ", bio=" + bio + ", Picturefilename=" + Picturefilename + "]";
	}
	
	/* 
	 * METHODS
	 */
	public boolean isSame(Editor editor) {
		if(	this.affiliation.equals(editor.affiliation) &&
			this.name.equals(editor.name) &&
			this.email.equals(editor.email) &&
			this.bio.equals(editor.bio) &&
			this.title.equals(editor.title) &&
			this.Picturefilename.equals(editor.Picturefilename))
			return true;
		else 
			return false;
	}
	
}// end of class
