import java.util.ArrayList;
import java.util.UUID;

public class BookStore {
	
//	ArrayList<String>bookId = new ArrayList<String>();
//	ArrayList<String>bookName = new ArrayList<String>();
//	ArrayList<String>writer = new ArrayList<String>();
//	ArrayList<String>quantity = new ArrayList<String>();
	ArrayList<Book> books = new ArrayList<>();

	public void addbook(Book book) {
//		bookIds.add(book.getBookId());
//		bookNames.add(book.getBookName());
//		writerNames.add(book.getWriterName());
		books.add(book);

	}
	
	//public void deleteBook(int i) {
		
	//}
	
	
	public void searchByBookName(String bookName) {
		boolean found = false;
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).getBookName() == bookName) {
				System.out.println(books.get(i).getBookId());
				System.out.println(books.get(i).getBookName());
				System.out.println(books.get(i).getWriterName());
				System.out.println(books.get(i).getPrice());
				System.out.println(books.get(i).getQuantity());
				found = true;
			}
		}
		if (!found) {
			System.out.println("Sorry, we don't have it");
		}
	}
	
	public void searchWriter(String writerName) {
		boolean found = false;
		for (int i = 0; i < books.size(); i++) {
			if(books.get(i).getWriterName() == writerName){
				System.out.println(books.get(i).getBookId());
				System.out.println(books.get(i).getBookName());
				System.out.println(books.get(i).getWriterName());
				System.out.println(books.get(i).getPrice());
				System.out.println(books.get(i).getQuantity());
				found = true;
			}
		}
		if(!found) {
			System.out.println("Writer absent");
		}
	}
	
	public boolean contains(String bookName) {
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).getBookName() == bookName) {
				return true;
			}
		}
		return false;
	}
	
	public Book findBook(String bookName) {
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).getBookName() == bookName) {
				return books.get(i);
			}
		}
		//change later
		return books.get(0);
	}
}


