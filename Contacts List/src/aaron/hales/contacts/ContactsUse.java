package aaron.hales.contacts;

public class ContactsUse {

	public ContactsUse() {
		// pulls data from another class called Contacts to create a new variable
		Contacts lydia = new Contacts(); // creates a new contact called lydia, uses the default values of each variable
		System.out.println(lydia.name); // prints name for contact lydia
		System.out.println(lydia); // prints storage location of lydia
		
		Contacts jaiden = new Contacts(); // creates new contact called jaiden, uses default values of variables
		jaiden.name = "Jaiden"; // sets name of contact jaiden to Jaiden, changes the name from default values
		System.out.println(jaiden.name); // prints name of jaiden's  contact
		System.out.println(jaiden); // prints storage location of jaiden

		
	}

	public static void main(String[] args) {
		
		String first_name = "Aaron"; // creates and defines variable
		String last_name = new String(); // creates variable; does not declare value
		last_name = "Hales"; // declare variable
		String middle_name; // creates variable; does not declare value
		middle_name = "Michael"; // declares value
		// prints first_name middle_name last_name with spaces, the spaces are in the ""
		System.out.println(first_name + " " + middle_name + " " + last_name);
		
		new ContactsUse();

	}

}
