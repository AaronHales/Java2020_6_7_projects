package aaron.hales.ch6.act;

import java.util.Scanner;

/*
 * Java Programming
 * Chapter: 6, Activity: Conversation Piece 
 * purpose
 * aaron.hales
 * Oct 20, 2020
 */
public class conversations {

	public conversations() {
		Scanner input = new Scanner(System.in);
		
		// declares variables
		String name;
		String noun;
		String verb;
		int int1 = 0;
		double double1 = 2.0;
		String new_line = "";
		
		// get the name
		System.out.println("Enter your name");
		name = input.nextLine(); // stores input under name
		System.out.println(new_line);
		
		// get the noun
		System.out.println("Enter a noun");
		noun = input.nextLine(); // stores input under noun
		System.out.println(new_line);
		
		// get the verb
		System.out.println("Enter a verb");
		verb = input.nextLine(); // stores input under verb
		System.out.println(new_line);
		
		// get the int
		System.out.println("Enter an integer");
		if (input.hasNextInt()) { // verifies that input is int
			int1 = input.nextInt(); // stores input under int
		}
		System.out.println(new_line);
		input.nextLine(); // clears remainders, including newline
		
		// get the double
		System.out.println("Enter a real or decimal number");
		if (input.hasNextDouble()) { // verifies that input is double
			double1 = input.nextDouble(); // stores input under double
		}
		System.out.println(new_line);
		input.nextLine(); // clears remainders, including newline
		
		// creates story
		String story = "One day, " + name + " picked up a " + noun;
		story += " and decided to " + verb + " it.\n";
		story += "After getting arrested, spending " + int1;
		story += " days in jail, and paying a $" + String.format("%.2f",double1) + " fine,\n";
		story += name + " decided that was a bad idea!";
		
		// prints story
		System.out.println(""); // prints a blank line
		System.out.println(story); // prints the story
		
		
		// closes Scanner when done
		input.close();
	}

	public static void main(String[] args) {
		new conversations();

	}

}
