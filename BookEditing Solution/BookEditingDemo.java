/**
 * 
 * @author Andrey
 *
 */
public class BookEditingDemo {

	public static void main(String[] args) {

		/*
		 * Create Publishers
		 */
		Publisher p1 = new Publisher("Pearson Education", "1(800)677-6337");
		p1.setAddress("Upper Saddle River, NJ");
		p1.setUrl("http://www.pearsoned.com");

		Publisher p2 = new Publisher("Penguin Books", "866-761-6685");
		p2.setAddress("New York, NY");
		p2.setUrl("http://www.penguin.com/");

		/*
		 * Create Editors
		 */
		Editor e1 = new Editor("John Doe", "jdoe@example.com");
		e1.setAffiliation("SIU");
		e1.setBio("Expert in Artificial Intelligence and Biomedical Informatics");
		e1.setTitle("Dr.");
		e1.setPicturefilename("john");

		Editor e2 = new Editor("Bob Mart", "bob@example.com");
		e2.setAffiliation("NYU");
		e2.setBio("Expert in Data Mining and Analytics");
		e2.setTitle("Dr.");
		e2.setPicturefilename("Bob");

		Editor e3 = new Editor("Mark Samuk", "ms@example.com");
		e3.setAffiliation("BU");
		e3.setBio("Expert in Social Networking");
		e3.setTitle("Dr.");
		e3.setPicturefilename("mark");

		/*
		 * Create Authors
		 */
		Author a1 = new Author("Bill Sanot", "bill@example.com");
		a1.setAffiliation("MSU");
		a1.setBio("Expert in Cybersecurity");
		a1.setTitle("Dr.");

		Author a2 = new Author("Telma Bistek", "telma@example.com");
		a1.setAffiliation("CU");
		a1.setBio("Expert in Natural Language Processing and Knowledge Representation");
		a1.setTitle("Dr.");

		/*
		 * Create Chapters
		 */
		Chapter c1 = new Chapter("Intro to Java");
		c1.setChapterAbstract("Introduction to Java Programming and GUI Programming");
		c1.setNumberPages(25);
		c1.addKeyword("Java");
		c1.addKeyword("Programming");
		c1.addKeyword("Arrays");
		c1.addKeyword("GUI");
		c1.addAuthor(e1);
		c1.addAuthor(a1);

		Chapter c2 = new Chapter("Java2");
		c2.setChapterAbstract("Array of Objects");
		c2.setNumberPages(20);
		c2.addKeyword("Object-Oriented Programming");
		c2.addKeyword("Arrays");
		c2.addAuthor(a1);
		c2.addAuthor(a2);

		/*
		 * Create Books
		 */
		Book b1 = new Book("Java Programming");
		b1.setEdition(1);
		b1.setYear(2010);
		b1.addChapter(c1);
		b1.addChapter(c2);
		b1.addEditor(e1);
		b1.addEditor(e2);
		b1.addEditor(e3);
		b1.setPublisher(p1);

		Book b2 = new Book("HTML, CSS and JavaScript");
		b2.setEdition(1);
		b2.setYear(2015);
		b2.addEditor(e3);
		b2.setPublisher(p2);

		/*
		 * Print Book Information
		 */
		System.out.println(b1);
		
		System.out.println(b2);

		/*
		 * Get number of chapters
		 */
		System.out.println(b1.getCountChapters() + " chapters");
		
		System.out.println(b2.getCountChapters() + " chapters");

		/*
		 * Get total of pages
		 */
		System.out.println(b1.getTotalPages() + " pages");
		
		System.out.println(b2.getTotalPages() + " pages");

		/*
		 * Get Chapters written by Editor 1
		 */
		Chapter[] listC = b1.getListChapterByEditor(e1); // retrieve list of
															// chapters
		for (int i = 0; i < listC.length; i++) {
			Chapter c = listC[i];
			System.out.println("Chapter by " + e1.getName() + " = " + c.getTitle());
		}

		/*
		 * Get Chapters by Keyword
		 */
		Chapter[] listK = b1.getListChapterByKeyword("Arrays"); // retrieve list
																// of chapters
		for (int i = 0; i < listK.length; i++) {
			Chapter c = listK[i];
			System.out.println("Chapter in " + b1.getTitle() + " with keyword 'Arrays' = " + c.getTitle());
		}

		/*
		 * Check book with same Publisher It could be implement as an array of
		 * books
		 */
		if (b1.samePublisher(p1)) {
			System.out.println(p1.getName() + " - " + b1.getTitle());
		}
		if (b2.samePublisher(p1)) {
			System.out.println(p1.getName() + " - " + b2.getTitle());
		}

		/*
		 * Print Book Citation
		 */
		System.out.println("APA Citation: " + b1.getAPACitation());
		
		System.out.println("APA Citation: " + b2.getAPACitation());

	} // end of main method

}// end of class
