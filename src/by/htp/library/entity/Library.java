package by.htp.library.entity;

public class Library {

	private Book[] books;
	private int index;
	private int maxLengthOfLibrary = 2;

	public Library() {
		this.books = new Book[maxLengthOfLibrary];
	}

	public Library(int size) {
		this.books = new Book[size];
	}

	public void addBook(Book book) {
		if (index < maxLengthOfLibrary) { 
			books[index] = book;
			index++;
		} else if (index >= maxLengthOfLibrary) {
			Book[] newLibrary = new Book[index + 1]; 
			for (int i = 0; i < books.length; i++) { 
				newLibrary[i] = books[i];
			}
			newLibrary[index] = book; 
			books = newLibrary;
			index++;
			maxLengthOfLibrary++;
		}
	}
	
	
	
	public Book[] getBooks() {
		return books;
	}

	
	
}
