import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		boolean isLogin = false;
		BookStore store = new BookStore();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to the bookstore!\n" +"What Can I help you?\n" + "1. Search book by book name\n" 
		+ "2. Search book by writer name\n"
		+ "3. Add new book\n" 
		+ "4. Sign in\n");
		
		System.out.println("Please enter the number");
		
		

		boolean isValid = false;
		while (isValid == false) {
			int choice = scanner.nextInt();
			switch(choice){
				case 1:
					System.out.println("Please enter the book name");
					String bName = scanner.next();
					store.searchByBookName(bName);
					isValid = true;
					break;
				case 2:
					System.out.println("Please enter the writer name");
					String wName = scanner.next();
					store.searchByBookName(wName);
					isValid = true;
					break;
				case 3:
					System.out.println("Please enter the new book name");
					String nbName = scanner.next();
					if (store.contains(nbName)){
						System.out.println("The book exist, how many you want to add?");
						int num = scanner.nextInt();
						store.findBook(nbName).addQuantity(num);
					}
					else {
						System.out.println("Please enter the new book writer name");
						String nwName = scanner.next();
						System.out.println("Please set the price");
						String price = scanner.next();
						System.out.println("How many you want to add?");
						int quantity = scanner.nextInt();
						store.addbook(new Book(nbName,nwName,price,quantity));
					}
					isValid = true;
					break;
				case 4:
					System.out.println("4");
					isValid = true;
					break;
				default:
					System.out.println("Please enter a valid number");
					break;
			}
		}
		
	}
	
	
	
	public void signIn(String name, String password) {
		User user = new User (name, password,false);
		
	}

}
