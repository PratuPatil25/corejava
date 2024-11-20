package lab6;

import java.util.ArrayList;

class Book {
    private int bookId;
    private String bookName;
    private String authorName;

    // Parameterized constructor
    public Book(int bookId, String bookName, String authorName) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Book ID: " + bookId + ", Book Name: " + bookName + ", Author Name: " + authorName);
    }
}

public class BookCollection {

	public static void main(String[] args) {
		
		 ArrayList<Book> b = new ArrayList<>();

	        // Add Book objects to the ArrayList
	        b.add(new Book(101, "The Alchemist", "Paulo Coelho"));
	        b.add(new Book(102, "1984", "George Orwell"));
	        b.add(new Book(103, "To Kill a Mockingbird", "Harper Lee"));

	       
	        System.out.println("Book Details:");
	        for (Book book : b) {
	            book.displayDetails();
	        }

	}

}
