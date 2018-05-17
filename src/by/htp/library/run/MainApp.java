package by.htp.library.run;


import by.htp.library.entity.Author;
import by.htp.library.entity.Book;
//import by.htp.library.entity.BookWithDifferentAuthors;
import by.htp.library.entity.Library;
import by.htp.library.logic.Librarian;

public class MainApp {

	public static void main(String[] args) {

		Author a1 = new Author("Lev", "Tolstoy", "Nikolaevich", 1828);
		Author a2 = new Author("Aleksandr", "Pushkin", "Sergeevich", 1799);
		Author a3 = new Author("Sergey", "Esenin", "Aleksandrovich", 1895);
		

		Book b1 = new Book();
		b1.setTheYearOfPublishing(1876);
		b1.setTitle("Book1");
		b1.setAuthor(a1);

		Book b2 = new Book();
		b2.setTheYearOfPublishing(1865);
		b2.setTitle("Book2");
		b2.setAuthor(a1);

		Book b3 = new Book(1820, a2, "Book3");
		Book b4 = new Book(1825, a2, "Book4");
		Book b5 = new Book(1920, a3, "Book5");
		Book b6 = new Book(1925, a3, "Book6");
		
		Library library = new Library();
		library.addBook(b6);
		library.addBook(b4);
		library.addBook(b5);
		library.addBook(b1);
		library.addBook(b1);

		library.addBook(b3);
		library.addBook(b2);
		
		
	Librarian librarian = new Librarian();
		librarian.printLibrary(library);
		System.out.println("================");
						
		librarian.printBooksByAuthor("Esenin", library);
		System.out.println("================");
		
		
		librarian.printBookByAuthorTitleYear(library, "Book1", "Tolstoy", 1876);
		System.out.println("================");
		
		
		librarian.PrintOneBook(library, "Book1");
		System.out.println("================");

		
	}

}
