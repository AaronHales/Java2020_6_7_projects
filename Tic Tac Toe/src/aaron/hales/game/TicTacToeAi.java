package aaron.hales.game;

import java.util.InputMismatchException;
import java.util.Scanner;

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
	
	public int get_number(String question, int low, int high) {
		while (true) {
			int num_input;
			try {
				System.out.println(question);
				num_input = input.nextInt();
				if (!(num_input >= low && num_input <= high)) {
					System.out.println("\n");
					System.out.println("-------------------------------------------------");
					System.out.println("Invalid input: re-enter square number: ");
					System.out.println();
					continue;
				}
				return num_input;
				
			}catch (InputMismatchException e) {
				System.out.println("\n");
				System.out.println("-------------------------------------------------");
				System.out.println("Invalid input: re-enter square number: ");
				System.out.println();
				input.nextLine();
				continue;
			}
		}
	}
	
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
		for(int i = 0; i < NUM_SQUARES; i++) {
			board[i] = EMPTY;
		}
		
		return board;
	}
	
	public void display_board(String[] board) {
		System.out.println("\t\t+-----------+");
		System.out.println("\t\t| " + board[0] + " | " + board[1] +" | " + board[2] + " |" );
		System.out.println("\t\t|-----------|");
		System.out.println("\t\t| " + board[3] + " | " + board[4] +" | " + board[5] + " |" );
		System.out.println("\t\t|-----------|");
		System.out.println("\t\t| " + board[6] + " | " + board[7] +" | " + board[8] + " |" );
		System.out.println("\t\t+-----------+");
	}
	
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
	
	
	//////////////////////////////////////////////////////////////////
	
	// build games
	public TicTacToeAi() {
		String X = "X";
		String O = "O";
		String EMPTY = " ";
		String TIE = "TIE";
		int NUM_SQUARES = 9;

		
		
		intro();
		
		pieces(X, O);
		//System.out.println(human);
		//System.out.println(computer);
		
		//String x = yes_no_response("is this working");
		//System.out.println(x);
		
		//int number = get_number("Enter the number of a square to place for 0-8:", 0, 8);
		//System.out.println(number);
		
		
		String[] board = new_board(NUM_SQUARES,EMPTY);
		board[0] = X;
		board[8] = O;
		int[] legal_moves = legal_moves(board, NUM_SQUARES, EMPTY);
		for (int var: legal_moves) {
			System.out.println(var);	
		}	
		
		//display_board(board);
		
		/*
		for (String var: board) {
			System.out.println(var);	
		}
		*/
		
	}
	
	// starts game
	public static void main(String[] args) {
		new TicTacToeAi();

	}

}
