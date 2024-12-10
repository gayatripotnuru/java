package extraExercises;
import java.util.*;
public class LibraryServices{

	ArrayList<BookEntity>BookList=new ArrayList<BookEntity>();
	void addBook(String bookTitle, String bookAuthor, String zonar, int bookID) {
		BookEntity b=new BookEntity(bookTitle,bookAuthor,zonar,bookID);
		
		BookList.add(b);
		System.out.println("Book added successfully!");
		
	}
	void RemoveBook(int bookID) {
	BookList.remove(bookID);
	System.out.println("Sucessfully removed from library!");
	}
	void UpdateBook(String  bookTitle) {
	     for(BookEntity y : BookList) {
	          if(y.BookTitle== bookTitle) {
	        	  System.out.println("Sucessfully found the book  is to update!");
	        	  y.setBookTitle("bigbang theory");
	        	 }
	      }
     }
	
	void displayBooks() {
		for(BookEntity x: BookList) {
			 System.out.println("Title: " + x.getBookTitle());
	            System.out.println("Author: " + x.getBookAuthor());
	            System.out.println("Genre: " + x.getZonar());
	            System.out.println("ID: " + x.getBookID());
	            System.out.println("----------------------------");
		}
}
public static void main(String args[]) {
	 LibraryServices ls=new LibraryServices();
		ls.addBook("physics","albert einstein","science",0);
		ls.addBook("chemistry","albert einstein","science",1);
		ls.displayBooks();
	    ls.UpdateBook("physics");
	    ls.displayBooks();
	}
}
