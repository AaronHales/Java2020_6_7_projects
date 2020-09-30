package aaron.hales.ch5.ls1.assignment;

public class Assignment {

	public Assignment() {
		
		String first_name = "Aaron"; // creates and defines variable
		String last_name = new String(); // creates variable; does not declare value
		last_name = "Hales"; // declare variable
		String middle_name; // creates variable; does not declare value
		middle_name = "Michael"; // declares value
		// prints first_name middle_name last_name with spaces, the spaces are in the ""
		System.out.println(first_name + " " + middle_name + " " + last_name);
	}

	public static void main(String[] args) {
		
		new Assignment();

	}

}
