package aaron.hales.guess;

// imports
import java.util.Random;
import java.util.Scanner;

/*
 * Java Programming
 * guess my number game
 * aaron.hales
 * Oct 8, 2020
 */

public class guess_my_number {

	public guess_my_number() {
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		int guess;
		
		// picking the random number
		int comp_num = random.nextInt(10)+1;
		
		System.out.println("Welcome to the Guess My Number game");
		System.out.println("I'm thinking of a number between 1 and 10");
		System.out.println("You have 3 guesses to get the number, good luck");
		System.out.println();
		
		System.out.println("Pick a number between 1 and 10 and press enter");
		if (input.hasNextInt()) {
			guess = input.nextInt();
			if (guess == comp_num) {
				System.out.println("the number was: " + comp_num);
				System.out.println("YOU WIN!");
			}
			
			else if (guess < comp_num) {
				System.out.println(guess + " was too small");
			}
			
			else {
				System.out.println(guess + " was too large");
			}
		}
		
		else {
			System.out.println("Not a good value you lost a guess");
			input.nextLine();
		}
		
		System.out.println("Pick a number between 1 and 10 and press enter");
		if (input.hasNextInt()) {
			guess = input.nextInt();
			if (guess == comp_num) {
				System.out.println("the number was: " + comp_num);
				System.out.println("YOU WIN!");
			}
			
			else if (guess < comp_num) {
				System.out.println(guess + " was too small");
			}
			
			else {
				System.out.println(guess + " was too large");
			}
		}
		
		else {
			System.out.println("Not a good value you lost a guess");
			input.nextLine();
		}
		
		System.out.println("Pick a number between 1 and 10 and press enter");
		if (input.hasNextInt()) {
			guess = input.nextInt();
			if (guess == comp_num) {
				System.out.println("the number was: " + comp_num);
				System.out.println("YOU WIN!");
			}
			
			else if (guess < comp_num) {
				System.out.println(guess + " was too small");
			}
			
			else {
				System.out.println(guess + " was too large");
			}
		}
		
		else {
			System.out.println("Not a good value you lost a guess");
			input.nextLine();
		}
		
		
		input.close();
	}

	public static void main(String[] args) {
		new guess_my_number();

	}

}
