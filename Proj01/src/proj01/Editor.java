package proj01;

public class Editor extends Person {

	public Editor(String name, String email) {
		super(name, email);
		// TODO Auto-generated constructor stub
	}

	public Editor(String name, String email, String title, String affiliation, String bio, String picturename) {
		super(name, email, title, affiliation, bio, picturename);
		// TODO Auto-generated constructor stub
	}
	
	protected Editor(Editor editor) {
		super(editor.name, editor.email, editor.title, editor.affiliation, editor.bio, editor.Picturename);
	}

	@Override
	public String toString() {
		return "\n\nEditor Name: " + name + "\nEmail: " + email + "\nTitle: " + title + "\nAffiliation: " + affiliation
				+ "\nBio: " + bio + "\nPicture Name: " + Picturename;
	}

}
