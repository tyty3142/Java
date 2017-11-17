package proj01;

import java.util.Arrays;

public class Chapter {
	public String title;
	public int totalpgs;
	public String[] keywords;
	public String[] abstracts;
	public int numpages;
	public Person[] author;
	public String chaptname;

	public int countAuthors;
	public int countKeywords;

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

	public String[] getAbstracts() {
		return abstracts;
	}

	public void setAbstracts(String[] abstracts) {
		this.abstracts = abstracts;
	}

	public int getNumpages() {
		return numpages;
	}

	public void setNumpages(int numpages) {
		this.numpages = numpages;
	}

	public Person[] getAuthor() {
		return author;
	}

	public void setAuthor(Person[] author) {
		this.author = author;
	}

	public String getChaptname() {
		return chaptname;
	}

	public void setChaptname(String chaptname) {
		this.chaptname = chaptname;
	}

	public Chapter(String title, String[] keywords, String[] abstracts, int numpages, Author[] author, String chaptname) {
		super();
		this.title = title;
		this.keywords = keywords;
		this.abstracts = abstracts;
		this.numpages = numpages;
		this.author = author;
		this.chaptname = chaptname;
	}

	public int getNumPages() {
		this.totalpgs = totalpgs + this.numpages;
		return totalpgs;
	}

	public Chapter(String title, int numpages, String chaptname) {
		super();
		this.title = title;
		this.numpages = numpages;
		this.chaptname = chaptname;
	}

	public Chapter(Chapter chapter) {
		super();
		this.title = chapter.title;
		this.keywords = chapter.keywords;
		this.abstracts = chapter.abstracts;
		this.numpages = chapter.numpages;
		this.author = chapter.author;
		this.chaptname = chapter.chaptname;
	}

	@Override
	public String toString() {
		return "Chapter title: " + title + "\nKeywords: " + Arrays.toString(keywords) + "\nAbstracts: " + Arrays.toString(abstracts)
				+ "\nNumber of pages in chapter: " + numpages + "\n\nAuthor: " + Arrays.toString(author) + "\n\nChaptname: "
				+ chaptname;
	}

}
