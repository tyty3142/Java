package BookeditingSolution;

import java.util.Arrays;

/**
 * 
 * @author Andrey
 *
 */
public class Chapter {

	/*
	 * ATTRIBUTES
	 */
	private Person[] authors;
	private String title;
	private String[] keywords;
	private String chapterAbstract;
	private int numberPages;
	private String chapterFilename;

	private int countAuthors = 0;
	private int countKeywords = 0;

	/*
	 * NO-ARG CONSTRUCTOR
	 */
	public Chapter() {
		// define size of lists
		authors = new Person[10];
		keywords = new String[10];
	}

	/*
	 * ARG CONSTRUCTOR
	 */
	public Chapter(String title) {
		this.title = title;
		// define size of lists
		authors = new Person[10];
		keywords = new String[10];
	}

	/*
	 * COPY CONSTRUCTOR
	 */
	public Chapter(Chapter object) {
		this.authors = object.authors; // implement deep copy for each author in
										// the list
		this.title = object.title;
		this.keywords = object.keywords;
		this.chapterAbstract = object.chapterAbstract;
		this.numberPages = object.numberPages;
		this.chapterFilename = object.chapterFilename;
		this.countAuthors = object.countAuthors;
		this.countKeywords = object.countKeywords;
	}

	/*
	 * GETs and SETs
	 */
	public Person[] getAuthors() {
		return authors;
	}

	public void setAuthors(Author[] authors) {
		this.authors = authors;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String[] getKeywords() {
		return keywords;
	}

	public void setKeywords(String[] keywords) {
		this.keywords = keywords;
	}

	public String getChapterAbstract() {
		return chapterAbstract;
	}

	public void setChapterAbstract(String chapterAbstract) {
		this.chapterAbstract = chapterAbstract;
	}

	public int getNumberPages() {
		return numberPages;
	}

	public void setNumberPages(int numberPages) {
		this.numberPages = numberPages;
	}

	public String getChapterFilename() {
		return chapterFilename;
	}

	public void setChapterFilename(String chapterFilename) {
		this.chapterFilename = chapterFilename;
	}

	/*
	 * TO STRING
	 */
	@Override
	public String toString() {
		return "\nChapter [authors=" + Arrays.toString(authors) + ", title=" + title + ", keywords="
				+ Arrays.toString(keywords) + ", chapterAbstract=" + chapterAbstract + ", numberPages=" + numberPages
				+ ", chapterFilename=" + chapterFilename + "]";
	}

	/*
	 * METHODS
	 */
	public void addAuthor(Person person) {
		if (person instanceof Author)
			authors[countAuthors] = new Author((Author) person);
		else if (person instanceof Editor)
			authors[countAuthors] = new Editor((Editor) person);

		countAuthors++;
	}

	public void addKeyword(String keyword) {
		keywords[countKeywords] = keyword;

		countKeywords++;
	}

	public int getCountAuthors() {
		return countAuthors;
	}

	public int getCountKeywords() {
		return countKeywords;
	}

}// end of class
