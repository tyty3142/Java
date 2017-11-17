package proj01;

import java.util.Arrays;

public class Book {
	public String title;
	public String edition;
	public String isbn;
	public int year;
	public Publisher publisher;
	public Editor[] editor;
	public Chapter[] chapter;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEdition() {
		return edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	public Editor[] getEditor() {
		return editor;
	}

	public void setEditor(Editor[] editor) {
		this.editor = editor;
	}

	public Chapter[] getChapter() {
		return chapter;
	}

	public void setChapter(Chapter[] chapter) {
		this.chapter = chapter;
	}

	public Book(String title, String edition, Chapter[] chapter, Publisher publisher) {
		super();
		this.title = title;
		this.edition = edition;
		this.chapter = chapter;
		this.publisher = publisher;
	}
	
	public Book(Book book){
		this.title=book.title;
		this.chapter=book.chapter;
		this.editor=book.editor;
		this.publisher=book.publisher;
		this.edition=book.edition;
		this.isbn=book.isbn;
		this.year=book.year;
	}

	@Override
	public String toString() {
		return "The book title: " + title + "\nEdition: " + edition + "\nISBN: " + isbn + "\nYear published: " + year
				+ "\nThe publisher is: " + publisher + "\n\nEditor: " + Arrays.toString(editor) + "\n\nChapter: "
				+ Arrays.toString(chapter);
	}

}
