package aaron.hales.ch5.ls2;

public class Example {

	public Example() {
		
		// Declare a String named stored_username
		String stored_username;
		// Declare a String named stored_password
		String stored_password;
		
		// set store_username and store_password equal to "captainbob" and "ahoy"
		stored_username = "captainbob";
		stored_password = "Ahoy";
		
		
		String input_username;
		String input_password;
		
		input_username = "CAPTAINBOB";
		input_password = "Ahoy";
		
		boolean username = false;
		boolean password = false;
		
		if (stored_username.equalsIgnoreCase(input_username)) {
			username = true;
		}
		if (stored_password.equals(input_password)) {
			password = true;
		}
		
		if (username) {
			if (password) {
				System.out.println("you got in");
			}
			else {
				System.out.println("you didn't get in");
			}
		}
		else {
			System.out.println("wrong username");
		}
		
	}

	public static void main(String[] args) {
		new Example();

	}

}
