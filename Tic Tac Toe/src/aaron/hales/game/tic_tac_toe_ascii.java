package aaron.hales.game;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class tic_tac_toe_ascii {
	public Scanner input;
	public String[] board;
	public String turn;
	
	
	public tic_tac_toe_ascii() {
		// create the input tool
		input = new Scanner(System.in);
		board = new String[9];
		turn = "X";
		String winner = null;
		pop_empty_board();
		print_board();
		intro_text();
		
		while (winner == null) { // checks to see if winner is null
			System.out.println("Its " + turn + " turn");
			int number = get_good_int("Enter the number of a square to place:", 9, 0);
			
			if (board[number-1].equals(String.valueOf(number))) {
				board[number-1] = turn;
				if (turn.equals("X")) {
					turn = "O";
					System.out.println("\n");
					System.out.println("-------------------------------------------------");
					System.out.println();
				}
				else {
					turn = "X";
					System.out.println("\n");
					System.out.println("-------------------------------------------------");
					System.out.println();
				}
			}
			else {
				System.out.println("\n");
				System.out.println("-------------------------------------------------");
				System.out.println("Square already taken");
				System.out.println();
				print_board();
				continue;
			}
			print_board();
			winner = check_winner();
			
		} // while !winner
		if (winner.equalsIgnoreCase("draw")) {
			System.out.println("It's a draw! Thanks for playing.");
		}
		else {
			System.out.print("Congratulations! " + winner + "'s have won! Thanks for playing.");
		}
		
		
		//System.out.println(board[8]);
	}
	
	// methods
	public String check_winner() {
		for (int a = 0; a < 8; a++) {
			String line = null;
			switch(a) {
			// horizontal checks
			case 0:
				line = board[0] + board[1] + board[2];
				break;
			case 1:
				line = board[3] + board[4] + board[5];
				break;
			case 2:
				line = board[6] + board[7] + board[8];
				break;
				
			// vertical checks
			case 3:
				line = board[0] + board[3] + board[6];
				break;
			case 4:
				line = board[1] + board[4] + board[7];
				break;
			case 5:
				line = board[2] + board[5] + board[8];
				break;
			
			// diagonal checks
			case 6:
				line = board[0] + board[4] + board[8];
				break;
			case 7:
				line = board[2] + board[4] + board[6];
				break;
			}
			if (line.equals("XXX")) {
				return "X";
			}
			else if (line.equals("OOO")) {
				return "O";
			}
		}
		for (int a = 0; a < 9; a++) {
			if(Arrays.asList(board).contains(String.valueOf(a+1))) {
				break;
			}
			else if (a == 8) {
				return "Draw";
			}
		}
		return null;
	}
	
	public int get_good_int(String question, int high, int low) {
		while (true) {
			int num_input;
			try {
				System.out.println(question);
				num_input = input.nextInt();
				if (!(num_input > low && num_input <= high)) {
					System.out.println("\n");
					System.out.println("-------------------------------------------------");
					System.out.println("Invalid input: re-enter square number: ");
					System.out.println();
					print_board();
					continue;
				} // if num_input > 0 && num_input <= 9
				return num_input;
				
			}catch (InputMismatchException e) {
				System.out.println("\n");
				System.out.println("-------------------------------------------------");
				System.out.println("Invalid input: re-enter square number: ");
				System.out.println();
				print_board();
				input.nextLine();
				continue;
			} // catch
		}
	}
	
	public void intro_text() {
		System.out.println("Welcome to the game: Tic Tac Toe.");
		System.out.println("This is a 2 Player version, grab a friend to play.");
		System.out.println("----------------------------------------------------");
		print_board();
		System.out.println("X will play first.");
		System.out.println();
		
	}

	public static void main(String[] args) {
		new tic_tac_toe_ascii();

	}
	
	public void pop_empty_board() {
		for (int a = 0; a < 9; a++) {
			board[a] = String.valueOf(a+1);
		}
	}
	
	public void print_board() {
		System.out.println("\t\t+-----------+");
		System.out.println("\t\t| " + board[0] + " | " + board[1] +" | " + board[2] + " |" );
		System.out.println("\t\t|-----------|");
		System.out.println("\t\t| " + board[3] + " | " + board[4] +" | " + board[5] + " |" );
		System.out.println("\t\t|-----------|");
		System.out.println("\t\t| " + board[6] + " | " + board[7] +" | " + board[8] + " |" );
		System.out.println("\t\t+-----------+");
		
	}

}
