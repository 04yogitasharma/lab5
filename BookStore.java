package lab5;

import java.util.ArrayList;

class Book{
	private int bookId;
	private String bookName;
	private String authorName;
	public Book(int bookId, String bookName, String authorName) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.authorName = authorName;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	
	public void booksDetails()
	{
		System.out.println("Book Id : "+bookId);
		System.out.println("Book Name : "+bookName);
		System.out.println("Author Name : "+authorName);
		System.out.println("....................................................");
	}
}

public class BookStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ArrayList<Book> bookList=new ArrayList();
			bookList.add(new Book(1,"Chemistry","Pradeep"));
			bookList.add(new Book(2,"Mathematics","RD Sharma"));
			bookList.add(new Book(3,"Physics","RS Aggarwal"));
			
			for(Book book:bookList) {
				book.booksDetails();
			}
	}

}
//Create a Book class with bookId, bookName and authorName.Create parameterized 
//constructor to initialize the object. Create an ArrayList of type Book and store all 
//book objects into collections and display all book details. [Hint:Use advanced for loop 
//to display all Books details]