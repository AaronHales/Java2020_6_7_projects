package aaron.hales.guess;

import java.util.Random;
import java.util.Scanner;

public class guess_number_1_2 {

	public guess_number_1_2() {
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		boolean win = false;
		int diff;
		int max_range;
		int total_guess;
		
		System.out.println("Choose your Dificulty: Easy Medium Hard");
		String result = input.nextLine();
		
		switch (result)
		{
			case "Easy":
				diff = 1;
				max_range = 10;
				total_guess = 3;
				break;
			case "easy":
				diff = 1;
				max_range = 10;
				total_guess = 3;
				break;
			case "Medium":
				diff = 2;
				max_range = 50;
				total_guess = 5;
				break;
			case "medium":
				diff = 2;
				max_range = 50;
				total_guess = 5;
				break;
			case "Hard":
				diff = 3;
				max_range = 100;
				total_guess = 10;
				break;
			case "hard":
				diff = 3;
				max_range = 100;
				total_guess = 10;
				break;
			default:
				win = true;
				diff = 4;
				max_range = 1000;
				total_guess = 1;
				break;
		}
		
		
		int comp_num = random.nextInt(max_range)+1;  // picking the random number from 0 to value in () but not including that number
		int guess;
		
		
		
		
		
		
		System.out.println("Welcome to the Guess My Number game");
		System.out.println("I'm thinking of a number between 1 and " + max_range);
		// string format places second perm at %s
		System.out.println(String.format("You have %s guesses to get the number, good luck", total_guess));
		System.out.println();
		
		String guess_text = String.format("Pick a number between 1 and %s", max_range);
		
		int guess_count = 0;
		
		while ((guess_count < total_guess) && (win == false)) {
			// guess 1
			System.out.println(guess_text);
			if (input.hasNextInt()) {
				guess = input.nextInt();
				if (guess == comp_num) {
					System.out.println("the number was: " + comp_num);
					System.out.println("YOU WIN!");
					win = true;
				} // if guess == comp_num
			
				else if (guess < comp_num) {
					System.out.println(guess + " was too small\n");
				} // else if
			
				else {
					System.out.println(guess + " was too large\n");
				} // else
			} // has next
		
			else {
				System.out.println("Not a good value you lost a guess");
				System.out.println("Guess must be a number\n");
				input.nextLine();
			} //else
			guess_count++;
		} // while loop
		
		/*
		if ((guess_count <= (total_guess--)) && (win == false)) {
			if (input.hasNextInt()) {
				guess = input.nextInt();
				if (guess == comp_num) {
					System.out.println("the number was: " + comp_num);
					System.out.println("YOU WIN!");
				} // if guess == comp_num
			
				else if (guess < comp_num) {
					System.out.println("You Lost");
					System.out.println("The number was: " + comp_num);
				} // else if
			
				else {
					System.out.println("You Lost");
					System.out.println("The number was: " + comp_num);
				} // else
			} // has next
		
			else {
				System.out.println("Not a good value you lost a guess");
				System.out.println("Guess must be a number\n");
				input.nextLine();
			} //else
		}
		*/
		
		if (win == true) {
			System.out.println("the number was: " + comp_num);
			System.out.println("YOU WIN!");
		} // if win == true 
		else {
			System.out.println("You Lost");
			System.out.println("The number was: " + comp_num);
		}

		
		input.close();
	}

	public static void main(String[] args) {
		new guess_number_1_2();

	}

}
