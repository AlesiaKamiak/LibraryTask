package by.htp.library.logic;

import by.htp.library.entity.Author;
import by.htp.library.entity.Book;
import by.htp.library.entity.Library;

public class Librarian {

	// Вывод списка книг на экран. 
	public void printLibrary(Library library) {

		Book[] books = library.getBooks();
		/*
		 * for (int i = 0; i < books.length; i++) {
		 * System.out.println(books[i].toString()); }
		 */
		for (Book b : books) {
			System.out.println(b.toString());
		}
	}

	// Поиск всех книг одного автора
	public void printBooksByAuthor(String surname, Library library) {
		// Library library = null;
		int count = 0;
		Book[] books = library.getBooks();
		for (int i = 0; i < books.length; i++) {
			if (books[i].getAuthor().getSurname().equals(surname)) {
				count++;
				System.out.println(books[i].toString());
			}
		}
		if (count == 0) {
			System.out.println("There are no such books");
		}

	}

	// Поиск книги по автору, названию и году издания. 
	public void printBookByAuthorTitleYear(Library library, String title, String surnameOfauthor, int year) {
		Book[] books = library.getBooks();
		int count = 0;
		Book b = null;
		for (int i = 0; i < books.length; i++) {
			if ((books[i].getTitle().equals(title)) && (books[i].getAuthor().getSurname().equals(surnameOfauthor))
					&& (books[i].getTheYearOfPublishing() == year)) {
				// System.out.println(books[i].toString());
				b = books[i];
				count++;
			}
		}
		System.out.println(b);

		if (count == 0) {
			System.out.println("Поиск не дал результатов");

		}
	}

	// Вывод информации об одной книге на экран. 
	public void PrintOneBook(Library library, String book) {
		Book[] books = library.getBooks();
		int count = 0;
		Book b = null;
		for (int i = 0; i < books.length; i++) {
			if (books[i].getTitle().equals(book)) {
				count++;
				b = books[i];
			}
		}
		System.out.println(b);

		if (count == 0) {
			System.out.println("Нет такой книги");
		}
	}
}
