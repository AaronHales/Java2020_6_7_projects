package aaron.hales.guess;

// imports
import java.util.Random;
import java.util.Scanner;

public class guess_my_number_1_3 {

	public guess_my_number_1_3() {
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
		} // switch result
		
		
		int comp_num = random.nextInt(max_range)+1;  // picking the random number from 0 to value in () but not including that number
		int guess;
		int guess_count = 0;
		
		System.out.println("Welcome to the Guess My Number game");
		System.out.println("I'm thinking of a number between 1 and " + max_range);
		// string format places second perm at %s
		System.out.println(String.format("You have %s guesses to get the number, good luck", total_guess));
		System.out.println();
		
		String guess_text = String.format("Pick a number between 1 and %s", max_range);
		
		
		
		System.out.println(comp_num);
		do {
			String guess_count_txt = String.format("You have %s guess remaining\n", (total_guess-guess_count-1));
			// guess 1
			System.out.println(guess_text);
			if (input.hasNextInt()) {
				guess = input.nextInt();
				if (guess == comp_num) {
					/*
					System.out.println("the number was: " + comp_num);
					System.out.println("YOU WIN!");
					*/
					win = true; // sets win to true so it runs the bottom if statement
				} // if guess == comp_num
			
				else if (guess < comp_num) {
					System.out.println(guess + " was too small");
					System.out.println(guess_count_txt);
					win = false;
				} // else if guess < comp_num
			
				else {
					System.out.println(guess + " was too large");
					System.out.println(guess_count_txt);
					win = false;
				} // else
			} // has next
		
			else {
				System.out.println("Not a good value you lost a guess");
				System.out.println("Guess must be a number");
				System.out.println(guess_count_txt);
				win = false;
			} //else
			input.nextLine();
			guess_count++;
		}while ((guess_count != total_guess) && (win == false)); // do while loop
		
		if ((win == true) && (guess_count == total_guess)) {
			System.out.println("YOU WIN!");
			System.out.println("The number was: " + comp_num);
		} // if win == true 
		else {
			System.out.println("You Lost");
			System.out.println("The number was: " + comp_num);
		} // else

		
		input.close();
	} // public guess_my_number_1_3()

	public static void main(String[] args) {
		new guess_my_number_1_3();

	} // public static void main(String[] args)

}
