package proj01;

public class Author extends Person {

	public Author(String name, String email) {
		super(name, email);
		// TODO Auto-generated constructor stub
	}

	public Author(String name, String email, String title, String affiliation,
			String bio, String picturename) {
		super(name, email, title, affiliation, bio, picturename);
		// TODO Auto-generated constructor stub
	}
	
	protected Author(Author author){
		super(author.name, author.email, author.title, author.affiliation, author.bio, author.Picturename);
	}

	public String toString() {
		return "\n\nAuthor name: " + name + "\nEmail: " + email + "\nTitle: " + title
				+ "\nAffiliation: " + affiliation + "\nBio: " + bio
				+ "\nPicture Name: " + Picturename;
	}
	
}