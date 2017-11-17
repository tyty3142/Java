import java.util.Arrays;

/**
 * 
 * @author Andrey
 *
 */
public class Book {

	/*
	 * ATTRIBUTES
	 */
	private String title;
	private Editor[] editors;
	private Publisher publisher;
	private int edition;
	private String isbn;
	private Chapter[] chapters;
	private int year;

	private int countEditors = 0;
	private int countChapters = 0;

	/*
	 * NO-ARG CONSTRUCTOR
	 */
	public Book() {
		// define size of lists
		editors = new Editor[10];
		chapters = new Chapter[100];
	}

	/*
	 * ARG CONSTRUCTOR
	 */
	public Book(String title) {
		super();
		this.title = title;
		// define size of lists
		editors = new Editor[10];
		chapters = new Chapter[100];
	}

	/*
	 * COPY CONSTRUCTOR
	 */
	public Book(Book object) {
		this.title = object.title;
		this.editors = object.editors; // implement deep copy for each editor in
										// the list
		this.publisher = new Publisher(object.publisher);
		this.edition = object.edition;
		this.isbn = object.isbn;
		this.chapters = object.chapters; // implement deep copy for each chapter
											// in the list
	}

	/*
	 * GETs and SETs
	 */
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Editor[] getEditors() {
		return editors;
	}

	public void setEditors(Editor[] editors) {
		this.editors = editors;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	public int getEdition() {
		return edition;
	}

	public void setEdition(int edition) {
		this.edition = edition;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Chapter[] getChapters() {
		return chapters;
	}

	public void setChapters(Chapter[] chapters) {
		this.chapters = chapters;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	/*
	 * TO STRING
	 */
	@Override
	public String toString() {
		return "\nBook [title=" + title + ", editors=" + Arrays.toString(editors) + ", publisher=" + publisher
				+ ", edition=" + edition + ", isbn=" + isbn + ", chapters=" + Arrays.toString(chapters) + ", year="
				+ year + ", countEditors=" + countEditors + ", countChapters=" + countChapters + "]";
	}

	/*
	 * METHODS
	 */
	public void addEditor(Editor editor) {
		editors[countEditors] = new Editor(editor);

		countEditors++;
	}

	public void addChapter(Chapter chapter) {
		chapters[countChapters] = new Chapter(chapter);

		countChapters++;
	}

	public int getCountEditors() {
		return countEditors;
	}

	public int getCountChapters() {
		return countChapters;
	}

	public int getNumberOfChapters() {
		return countChapters;
	}

	public int getTotalPages() {
		int total = 0;
		for (int i = 0; i < countChapters; i++) {
			total += chapters[i].getNumberPages();
		}
		return total;
	}

	public Chapter[] getListChapterByEditor(Editor editor) {
		Chapter[] tempChapters = new Chapter[100];
		int count = 0;

		// find chapters
		for (int i = 0; i < countChapters; i++) {

			for (int j = 0; j < chapters[i].getCountAuthors(); j++) {
				Person p = chapters[i].getAuthors()[j];

				if (p instanceof Editor) {
					if (((Editor) p).isSame(editor)) {
						tempChapters[count] = new Chapter(chapters[i]);
						count++;
					}
				}
			}
		}

		// filter array
		Chapter[] listChapters = null;
		if (count > 0) {
			listChapters = new Chapter[count];

			for (int i = 0; i < count; i++) {
				listChapters[i] = new Chapter(tempChapters[i]);
			}
		}

		return listChapters;
	}

	public Chapter[] getListChapterByKeyword(String keyword) {
		Chapter[] tempChapters = new Chapter[100];
		int count = 0;

		// find chapters
		for (int i = 0; i < countChapters; i++) {

			for (int j = 0; j < chapters[i].getCountKeywords(); j++) {

				if (chapters[i].getKeywords()[j].equals(keyword)) {
					tempChapters[count] = new Chapter(chapters[i]);
					count++;
				}
			}
		}

		// filter array
		Chapter[] listChapters = null;
		if (count > 0) {
			listChapters = new Chapter[count];

			for (int i = 0; i < count; i++) {
				listChapters[i] = new Chapter(tempChapters[i]);
			}
		}

		return listChapters;
	}

	public String getAPACitation() {
		String citation = "";

		for (int i = 0; i < this.countEditors; i++) {
			if (i > 0) {
				citation += ", ";
			}
			Editor e = this.editors[i];
			String[] Names = e.getName().split(" ");
			int size = Names.length;
			String lastName = Names[size - 1];
			char firstLetter = Names[0].charAt(0);

			citation += lastName + ", " + firstLetter + ".";
		}

		return citation + " (" + this.getYear() + ") " + this.getTitle() + ", " + this.getPublisher().getName();

	}

	public boolean samePublisher(Publisher publisher) {
		if (this.publisher.getName().equals(publisher.getName()) && 
			this.publisher.getAddress().equals(publisher.getAddress()) &&
			this.publisher.getPhone().equals(publisher.getPhone()) && 
			this.publisher.getUrl().equals(publisher.getUrl()))
			return true;
		else
			return false;

	}

}// end of class
