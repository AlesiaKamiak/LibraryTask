package by.htp.library.entity;

public class Book {
 
	private int theYearOfPublishing;
	private Author author;
	private String title;
	
	
	public Book() {
		
	}

	public Book(int theYearOfPublishing, Author author, String title) {
		this.theYearOfPublishing = theYearOfPublishing;
		this.author = author;
		this.title = title;
	}
	
	public String toString() {
		String n = "Title: " + this.title + "\t" + "Author " + author.toString()+ "\t" + "Year: " + this.getTheYearOfPublishing();
		return n;
	
	};
	

	public int getTheYearOfPublishing() {
		return theYearOfPublishing;
	}

	public void setTheYearOfPublishing(int theYearOfPublishing) {
		this.theYearOfPublishing = theYearOfPublishing;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	
	
	
	
}
