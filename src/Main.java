import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isLogin = false;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to the bookstore!\n" +"What Can I help you?\n" + "1. Buy books\n" + "2. Return books\n"
				+ "3. Log in\n" + "4. Sign in\n");
		
		System.out.println("Please enter the number");
		
		

		boolean isValid = false;
		while (isValid == false) {
			int choice = scanner.nextInt();
			switch(choice){
				case 1:
					System.out.println("1");
					isValid = true;
					break;
				case 2:
					System.out.println("2");
					isValid = true;
					break;
				case 3:
					System.out.println("3");
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
