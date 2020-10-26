package aaron.hales.ch7.activity;

// imports
import java.util.Scanner;

/*
 * Java Programming
 * chapter # . Lesson #
 * purpose
 * aaron.hales
 * Oct 26, 2020
 */
public class Ch7_Act {

	
	public Ch7_Act() {
		Scanner input = new Scanner(System.in);
		
		// create integer variable that will hold the user's input
		int user_num = 0;
		
		// get input from the user, validating that they entered an integer
		System.out.print("Enter a number: ");
		if (!input.hasNextInt()) { // use input.hasNextInt() in an expression
			System.out.println("Oops! Please enter an integer.");
			input.close();
			return; // exit the program immediately
		}
		
		//  user has entered  number, get it from  input stream
		user_num = input.nextInt();
		input.nextLine();
		
		// declare our result variable and initialize it to one
		long factorial = 1;
		
		// use a for() loop to calculate the factorial
		for (long i = 1; i <= user_num; i++) {
			factorial = factorial * i;	
		}
		System.out.println("for() loop result: " + factorial);
		
		// resets factorial for while loop
		factorial = 1;
		
		// create variable to use in logical expression
		long index = 1;
		while (index <= user_num) {
			factorial = factorial * index;
			index++; // increase index by one
		}
		System.out.println("while() loop result: " + factorial);
		
		// reset factorial and logical expression variable for do-while loop
		factorial = 1;
		index = 1;
		do {
			factorial = factorial * index;
			index++; // increases by one
		} while (index <= user_num)
		
	}

	
	public static void main(String[] args) {
		new Ch7_Act();

	}

}
