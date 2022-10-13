package practise.conditionalsatement;

public class Non_primitivedatatype_If {
	public static String username = "starc@gmial.com ";
	public static String password = "1234567";
public static void main(String[] args) {
	if (username.equals("starc@gmial.com")&&password.equals("1234567")) {
		System.out.println("Welcome to FB");
	}else if (username.equals("starc@gmail.com")||password.equals("helo")) {
		System.out.println("Enter the otp");
			}else   {
				System.out.println("Invalid data");
				
			}
	
	
}
}
