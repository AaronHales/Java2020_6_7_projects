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
		
		
		// guess 1, always runs
		if(!win) {
			System.out.println(guess_text);
			if (input.hasNextInt()) {
				guess = input.nextInt();
				if (guess == comp_num) {
					System.out.println("the number was: " + comp_num);
					System.out.println("YOU WIN!");
					win = true;
				}
			
				else if (guess < comp_num) {
					System.out.println(guess + " was too small\n");
				}
			
				else {
					System.out.println(guess + " was too large\n");
				}
			}
		
			else {
				System.out.println("Not a good value you lost a guess");
				System.out.println("Guess must be a number\n");
				input.nextLine();
			}
		}
		
		
		// guess 2, always execute unless win is true
		if (!win) {
			System.out.println(guess_text);
			if (input.hasNextInt()) {
				guess = input.nextInt();
				if (guess == comp_num) {
					System.out.println("the number was: " + comp_num);
					System.out.println("YOU WIN!");
					win = true;
				}
			
				else if (guess < comp_num) {
					System.out.println(guess + " was too small\n");
				}
			
				else {
					System.out.println(guess + " was too large\n");
				}
			}
		
			else {
				System.out.println("Not a good value you lost a guess");
				System.out.println("Guess must be a number\n");
				input.nextLine();
			}
		}
		
		
		// guess 4, only executes if diff is greater than 1
		if (!win) {
			if (diff > 1) {
				System.out.println(guess_text);
				if (input.hasNextInt()) {
					guess = input.nextInt();
					if (guess == comp_num) {
						System.out.println("the number was: " + comp_num);
						System.out.println("YOU WIN!");
						win = true;
					}
					
					else if (guess < comp_num) {
						System.out.println(guess + " was too small\n");
					}
					
					else {
						System.out.println(guess + " was too large\n");
					}
				}
				
				else {
					System.out.println("Not a good value you lost a guess");
					System.out.println("Guess must be a number\n");
					input.nextLine();
				}
			}
		}
		
		
		// guess 5, only executes if diff is greater than 1
		if (!win) {
			if (diff > 1) {
				System.out.println(guess_text);
				if (input.hasNextInt()) {
					guess = input.nextInt();
					if (guess == comp_num) {
						System.out.println("the number was: " + comp_num);
						System.out.println("YOU WIN!");
						win = true;
					}
					
					else if (guess < comp_num) {
						System.out.println(guess + " was too small\n");
					}
					
					else {
						System.out.println(guess + " was too large\n");
					}
				}
				
				else {
					System.out.println("Not a good value you lost a guess");
					System.out.println("Guess must be a number\n");
					input.nextLine();
				}
			}
		}
		
		
		// guess 6, only executes if diff is greater than 2
		if (!win) {
			if (diff > 2) {
				System.out.println(guess_text);
				if (input.hasNextInt()) {
					guess = input.nextInt();
					if (guess == comp_num) {
						System.out.println("the number was: " + comp_num);
						System.out.println("YOU WIN!");
						win = true;
					}
					
					else if (guess < comp_num) {
						System.out.println(guess + " was too small\n");
					}
					
					else {
						System.out.println(guess + " was too large\n");
					}
				}
				
				else {
					System.out.println("Not a good value you lost a guess");
					System.out.println("Guess must be a number\n");
					input.nextLine();
				}
			}
		}
		
		
		// guess 7, only executes if diff is greater than 2
		if (!win) {
			if (diff > 2) {
				System.out.println(guess_text);
				if (input.hasNextInt()) {
					guess = input.nextInt();
					if (guess == comp_num) {
						System.out.println("the number was: " + comp_num);
						System.out.println("YOU WIN!");
						win = true;
					}
					
					else if (guess < comp_num) {
						System.out.println(guess + " was too small\n");
					}
					
					else {
						System.out.println(guess + " was too large\n");
					}
				}
				
				else {
					System.out.println("Not a good value you lost a guess");
					System.out.println("Guess must be a number\n");
					input.nextLine();
				}
			}
		}
		
		
		// guess 8, only executes if diff is greater than 2
		if (!win) {
			if (diff > 2) {
				System.out.println(guess_text);
				if (input.hasNextInt()) {
					guess = input.nextInt();
					if (guess == comp_num) {
						System.out.println("the number was: " + comp_num);
						System.out.println("YOU WIN!");
						win = true;
					}
					
					else if (guess < comp_num) {
						System.out.println(guess + " was too small\n");
					}
					
					else {
						System.out.println(guess + " was too large\n");
					}
				}
				
				else {
					System.out.println("Not a good value you lost a guess");
					System.out.println("Guess must be a number\n");
					input.nextLine();
				}
			}
		}
		
		
		// guess 9, only executes if diff is greater than 2
		if (!win) {
			if (diff > 2) {
				System.out.println(guess_text);
				if (input.hasNextInt()) {
					guess = input.nextInt();
					if (guess == comp_num) {
						System.out.println("the number was: " + comp_num);
						System.out.println("YOU WIN!");
						win = true;
					}
					
					else if (guess < comp_num) {
						System.out.println(guess + " was too small\n");
					}
					
					else {
						System.out.println(guess + " was too large\n");
					}
				}
				
				else {
					System.out.println("Not a good value you lost a guess");
					System.out.println("Guess must be a number\n");
					input.nextLine();
				}
			}
		}
		
		
		// guess 10, only executes if diff is greater than 2
		if (!win) {
			if (diff > 2) {
				System.out.println(guess_text);
				if (input.hasNextInt()) {
					guess = input.nextInt();
					if (guess == comp_num) {
						System.out.println("the number was: " + comp_num);
						System.out.println("YOU WIN!");
						win = true;
					}
					
					else if (guess < comp_num) {
						System.out.println(guess + " was too small\n");
					}
					
					else {
						System.out.println(guess + " was too large\n");
					}
				}
				
				else {
					System.out.println("Not a good value you lost a guess");
					System.out.println("Guess must be a number\n");
					input.nextLine();
				}
			}
		}
		
		
		// last guess/guess 3, always run unless win is true
		if (!win || diff == 4) {
			System.out.println(guess_text);
			if (input.hasNextInt()) {
				guess = input.nextInt();
				if (guess == comp_num) {
					System.out.println("the number was: " + comp_num);
					System.out.println("YOU WIN!");
					win = true;
				}
				
				else {
					System.out.println("You Lost");
					System.out.println("The number was: " + comp_num);
				}
			}
			
			else {
				System.out.println("Not a good value you lost a guess");
				System.out.println("Guess must be a number");
				input.nextLine();
			}
		}
		
		
		
		input.close();
	}

	public static void main(String[] args) {
		new guess_my_number();

	}

}
