package proj01;

public class BookDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Author author2 = new Author("John Dane", "Jondan@cheese.org");
		author2.setAffiliation("SIU");
		author2.setBio("I wrote this");
		author2.setTitle("Supervisor");
		author2.setPicturename("Picture Here");

		Author author1 = new Author("John Doe", "Jordan@cheese.org");
		author1.setAffiliation("SIU");
		author1.setBio("I wrote part of this");
		author1.setTitle("Mater Chef");
		author1.setPicturename("Picture Here");

		Author author3 = new Author("Jackson Huet", "huet@cheese.org");
		author3.setAffiliation("SIU");
		author3.setBio("I wrote this");
		author3.setTitle("Supervisor");
		author3.setPicturename("Picture Here");

		Author author4 = new Author("Michael Santoro", "SantAel@cheese.org");
		author4.setAffiliation("SIU");
		author4.setBio("I wrote part of this");
		author4.setTitle("Mater Chef");
		author4.setPicturename("Picture Here");
		
		Author[] author = new Author[2];
		author[0] = author1;
		author[1] = author2;
		
		Author[] authorSet2 = new Author[2];
		authorSet2[0] = author3;
		authorSet2[1] = author4;

		Editor editor1 = new Editor("Jose Forman", "Jfor@google.df");
		editor1.setAffiliation("SIU");
		editor1.setBio("I wrote that");
		editor1.setTitle("Supervisor");
		editor1.setPicturename("Picture Here");

		Editor editor2 = new Editor("Hugh Jackman", "asdf@google.df");
		editor2.setAffiliation("SIU");
		editor2.setBio("I wrote this");
		editor2.setTitle("Supervisor");
		editor2.setPicturename("Picture Here");

		Editor[] editor = new Editor[2];
		editor[0] = editor1;
		editor[1] = editor2;

		Publisher publisher = new Publisher("Winsor Nelson", "3056 E. Blorp Street");
		publisher.setUrl("www.pengers.com");
		publisher.setPhone("800-896-6699");

		String[] keywords = new String[2];
		keywords[0] = "Consuela's Story";
		keywords[1] = "Hugh Jackman";

		Chapter chap1 = new Chapter("Consuela's Story", 80, "Julio");
		chap1.setAuthor(author);
		chap1.setKeywords(keywords);
		
		Chapter chap2 = new Chapter("Consuela's Heartache", 120, "Jackson");
		chap2.setAuthor(author);
		chap2.setKeywords(keywords);
		
		Chapter chap3 = new Chapter("Consuela's Divorce", 95, "Mario");
		chap3.setAuthor(authorSet2);
		chap3.setKeywords(keywords);
		
		Chapter chap4 = new Chapter("Consuela's Death", 130, "Jansen");
		chap4.setAuthor(authorSet2);
		chap4.setKeywords(keywords);
		
		Chapter[] Chapter = new Chapter[2];
		Chapter[0] = chap1;
		Chapter[1] = chap2;
		
		Book book = new Book("Super Mario", "3rd Edition", Chapter, publisher);
		book.setEditor(editor);
		book.setIsbn("94667466445456");
		book.setYear(1995);
		
		System.out.println(book);

	}

}
