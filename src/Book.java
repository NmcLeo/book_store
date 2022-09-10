import java.util.UUID;


public class Book {
	private String bookId = UUID.randomUUID().toString();
	private String bookName = "Unknown";
	private String writerName = "Unknown";
	private String price;
	private int quantity;



	public Book(String bName, String wName, String p, int q) {

		bookName = bName;
		writerName = wName;
		price = p;
		quantity = q;
	}



	public String getBookId(){
		return bookId;
	}

	public void setBookName(String bName) {
		bookName = bName;
	}
	public String getBookName(){
		return bookName;
	}
	public void setWriterName(String wName) {
		writerName = wName;
	}
	public String getWriterName(){
		return writerName;
	}
	public void setPrice(String p) {
		price = p;
	}
	public String getPrice(){
		return price;
	}
	public void setQuantity(int q) {
		quantity = q;
	}
	public int getQuantity(){
		return quantity;
	}
	public void addQuantity(int n) {
		quantity+=n;
	}

}
