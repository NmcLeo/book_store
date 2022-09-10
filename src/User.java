
public class User {
	static Integer userNumber =0;
	static int adminNumber;
	String userId;
	String userName;
	String password;
	boolean isAdmin;
	
	
	public User (String name,String pw,boolean isAd) {
		userId = String.format("%09d",userNumber);
		userName = name;
		password = pw;
		isAdmin = isAd;
	}
	
}
