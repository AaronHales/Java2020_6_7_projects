package aaron.hales.game;

// imports
import java.util.InputMismatchException;
import java.util.Scanner;

// Changes to be made 11/12 fixed my issues

/////////////////////////////////////////////////////////////////
// was getting null point exception
// need to fix check winner to not return null and change to ""
// change win to ""
// change game loop to check for ""
/////////////////////////////////////////////////////////////////
// was getting a -1 out of range exception
// add checks in computer move to check for -1
// it will require an if and else if
// if move != -1 do everything like normal
// else if move == -1 continue
// clear move if it was not -1
/////////////////////////////////////////////////////////////////

public class TicTacToeAi {

	Scanner input = new Scanner(System.in);
	String human = "";
	String computer = "";
	
	// build methods
	public void intro() {
		System.out.println("Welcome to the ultimate game of Tic-Tac-Toe.");
		System.out.println("This is a game between you and a computer.");
		System.out.println("You take turns placing a letter on the board.");
		System.out.println("The goal is to be the first to get three of your own letter in a row.");
		System.out.println("You can get three in a row horizontal, vertical, and even diagnal.\n");
		System.out.println("To place on the board enter the number 0-8 that corresponds to the square you want to play in.");
		System.out.println("The board will look like this: ");
		System.out.println("\t\t+-----------+");
		System.out.println("\t\t| 0 | 1 | 2 |");
		System.out.println("\t\t|-----------|");
		System.out.println("\t\t| 3 | 4 | 5 |");
		System.out.println("\t\t|-----------|");
		System.out.println("\t\t| 6 | 7 | 8 |");
		System.out.println("\t\t+-----------+\n");
		System.out.println("You can pick if you want to go first or the computer to go first.");
		System.out.println("Prepare for the game to start.");
		System.out.println("The game will now BEGIN!\n");
	}
	
	public String yes_no_response(String question) {
		String response = "";
		while (true) {
			System.out.println(question);
			response = input.nextLine();
			if (response.equalsIgnoreCase("yes")) {
				break;
			}
			else if (response.equalsIgnoreCase("no")) {
				break;
			}
		}
		return response.toLowerCase();
	}
	
	public int get_number(String question, int low, int high, String board[]) {
		while (true) {
			int num_input;
			try {
				System.out.println(question);
				num_input = input.nextInt();
				if (!(num_input >= low && num_input <= high)) {
					System.out.println("\n");
					System.out.println("-------------------------------------------------");
					System.out.println("Invalid input. re-enter square number: ");
					display_board(board);
					continue;
				}
				System.out.println("\n");
				System.out.println("-------------------------------------------------");
				System.out.println("You play in square: " + num_input);
				return num_input;
			}catch (InputMismatchException e) {
				System.out.println("\n");
				System.out.println("-------------------------------------------------");
				System.out.println("Invalid input. re-enter square number: ");
				display_board(board);
				input.nextLine();
				continue;
			}
		}
	}
	
	// Assigns the pieces to the human and computer
	public void pieces(String X, String O) {
		String go_first = yes_no_response("Do you want to make the first move? (yes/no): ");
		if (go_first.equals("yes")) {
			human = X;
			computer = O;
			System.out.println("You will go first this game");
		}
		else {
			human = O;
			computer = X;
			System.out.println("The computer will go first this game");
		}
	}

	public String[] new_board(int NUM_SQUARES, String EMPTY) {
		String[] board = new String[NUM_SQUARES];
		for (int i = 0; i < NUM_SQUARES; i++) {
			board[i] = EMPTY;
		}
		return board;
	}
	
	public void display_board(String[] board) {
		System.out.println("\n\t\t+-----------+");
		System.out.println("\t\t| " + board[0] + " | " + board[1] +" | " + board[2] + " |" );
		System.out.println("\t\t|-----------|");
		System.out.println("\t\t| " + board[3] + " | " + board[4] +" | " + board[5] + " |" );
		System.out.println("\t\t|-----------|");
		System.out.println("\t\t| " + board[6] + " | " + board[7] +" | " + board[8] + " |" );
		System.out.println("\t\t+-----------+");
	}
	
	// Creates a list of legal moves
	public int[] legal_moves(String[] board, int NUM_SQUARES, String EMPTY) {
		int[] moves = new int[NUM_SQUARES];
		for (int i = 0; i < NUM_SQUARES; i++) {
			if (board[i] == EMPTY) {
				moves[i] = i;
			}
			else {
				moves[i] = -1;
			}
		}
		return moves;
	}
	
	public int human_move(String[] board, int NUM_SQUARES, String EMPTY) {
		int[] moves = legal_moves(board, NUM_SQUARES, EMPTY);
		int move = -1;
		while (true) {
			move = get_number("Choose a square to place for your turn. (0-8):", 0, NUM_SQUARES, board);
			for (int x: moves) {
				if (move == x) {
					return move;
				}
			}
			System.out.println("That square is already taken, were you thinking human. Please choose another.");
			display_board(board);
		}
	}
	
	public String next_turn(String turn) {
		if (turn == "X") {
			return "O";
		}
		else {
			return "X";
		}
	}
	
	public String check_winner(String[] board, String EMPTY, String TIE) {
		for (int a = 0; a < 8; a++) {
			String line = null;
			switch(a) {
			// horizontal checks
			// top row
			case 0:
				line = board[0] + board[1] + board[2];
				break;
			// mid row
			case 1:
				line = board[3] + board[4] + board[5];
				break;
			// bottom row
			case 2:
				line = board[6] + board[7] + board[8];
				break;
				
			// vertical checks
			// vertical left
			case 3:
				line = board[0] + board[3] + board[6];
				break;
			// vertical mid
			case 4:
				line = board[1] + board[4] + board[7];
				break;
			// vertical right
			case 5:
				line = board[2] + board[5] + board[8];
				break;
				
			// diagonal checks
			// diagonal  top left to bottom right
			case 6:
				line = board[0] + board[4] + board[8];
				break;
			// diagonal bottom left to top right
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
			if(board[a] == EMPTY) {
				break;
			}
			else if (a == 8) {
				return TIE;
			}
		}
		return "";
	}
	
	public int comp_move(String[] board, String EMPTY, String TIE) {
		String[] test_board = new String[9];
		// creates test board
		for (int i = 0; i < 9; i++) {
			test_board[i] = board[i];
		}
		int[] best_moves = {4, 2, 3, 1, 6, 0, 5, 7, 8};
		int[] legalmoves = legal_moves(board,9,EMPTY);
		
		// checking if any of the legal moves the computer can win with
		for (int move: legalmoves) {
			if (move != -1) {
				test_board[move] = computer;
				String win = check_winner(test_board, EMPTY, TIE);
				if (win.equals(computer)) {
					return move;
				}
			}
			else if (move == -1) {
				continue;
			}
			test_board[move] = EMPTY;
		}
		
		// if human can win
		for (int move: legalmoves) {
			if (move != -1) {
				test_board[move] = human;
				String win = check_winner(test_board, EMPTY, TIE);
				if (win.equals(human)) {
					return move;
				}
			}
			else if (move == -1) {
				continue;
			}
			test_board[move] = EMPTY;
		}
		
		// choose best move
		for (int move:best_moves) {
			boolean inarray = contains(legalmoves, move);
				if (inarray) {
					return move;
				}
			}
		return best_moves[0];
	}
	
	public boolean contains(int[] array, int key) {
		for (int i: array) {
			if (i == key) {
				return true;
			}
		}
		return false;
	}
	
	//////////////////////////////////////////////////////////////////
	
	// build games
	public TicTacToeAi() {
		String X = "X";
		String O = "O";
		String EMPTY = " ";
		String TIE = "TIE";
		int NUM_SQUARES = 9;
		int move;
		String win = "";

		// game setup
		intro(); // intro to game
		pieces(X, O); // set pieces
		String[] board = new_board(NUM_SQUARES,EMPTY); // creates an empty board
		System.out.println("\n");
		System.out.println("-------------------------------------------------");
		String turn = "X";
		display_board(board);
		while (win == "") {
			if (turn == human) {
				move = human_move(board, NUM_SQUARES, EMPTY);
				board[move] = human;
			}
			else {
				move = comp_move(board, EMPTY, TIE);
				board[move] = computer;
				System.out.println("-------------------------------------------------");
				System.out.println("Computer placed in square: " + move);
			}
			display_board(board);
			win = check_winner(board, EMPTY, TIE);
			turn = next_turn(turn);
		}
		System.out.println("The winner is: " + win + "!");
		if (win == human) {
			System.out.println("Congratulations Human, You beat me. It was a long hard fight.");
		}
		else if (win == computer) {
			System.out.println("I outsmarted you Human, you need to try harder and think ahead.\nBetter luck next time!");
		}
		else if (win == TIE) {
			System.out.println("Human, we had a great fight, but neither of us won. We were evenly wise in our decisions, I will continue train.");
		}
		
		// testing
		/*
		int[] legal_moves = legal_moves(board, NUM_SQUARES, EMPTY);
		for (int var: legal_moves) {
			System.out.println(var);	
		}	
		*/
		
	}
	
	// starts game
	public static void main(String[] args) {
		new TicTacToeAi();

	}

}
