package aaron.hales.contacts;

public class ContactsUse {

	public ContactsUse() {
		Contacts lydia = new Contacts(); // creates a new contact called lydia
		System.out.println(lydia.name); // prints name for contact lydia
		System.out.println(lydia); // prints storage location of lydia
		
		Contacts jaiden = new Contacts(); // creates new contact called jaiden
		jaiden.name = "Jaiden"; // sets name of contact jaiden to Jaiden
		System.out.println(jaiden.name); // prints name of jaiden's  contact
		System.out.println(jaiden); // prints storage location of jaiden
		
		
	}

	public static void main(String[] args) {
		new ContactsUse();

	}

}
