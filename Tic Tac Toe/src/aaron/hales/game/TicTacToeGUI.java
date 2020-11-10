package aaron.hales.game;

// imports
import java.util.*;
import java.util.List;
/*
 * java.swing.* is used to create JFames
 * java.awt.* is used to  create labels and buttons
 * java.awt.event.* is used to create functions for buttons
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/*
 * Java Programming
 * Aaron Hales
 * Tic Tac Toe GUI
 * 11/20
 */

public class TicTacToeGUI extends JPanel {

	static String[] board;
	static String winner = null;
	static String turn;
	static int value = 0;
	
	// a list of buttons is created and when clicked can change array values in board[]
	// this will be used to see if someone won or if a draw occured
	static List<JButton> buttons = new ArrayList<JButton>();
	static JFrame frame = new JFrame();
	static JLabel info = new JLabel("Welcome to 2 Player Tic Tac Toe.\nX will play first.\nClick near the center of a square to place X");
	
	static void winning_text() {
		winner = check_winner();
		if (winner != null) {
			if(winner.equalsIgnoreCase("draw")) {
				info.setText("It's a draw!\nThanks for playing");
				System.out.println("test");
			}
			else {
				info.setText("Congratulations!\n" + winner + " has won!");
			}
		}
	}
	
	static String check_winner() {
		for (int a = 0; a < 8; a++) {
			String line = null;
			switch (a) {
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
					
		for (int i = 0; i < 9; i++) {
			if(board[i].equals("Empty")) {
				break;
			}
			else if (i == 8) {
				return "draw";
			}
		}
		info.setText(turn + "'s turn. Click near the cneter of a square to place " + turn + " in.");
		return null;
	}
	
	static void pop_empty_board() {
		frame.setLayout(null);
		info.setBounds(10,160,400,400);
		frame.add(info);
		int x_increase = 0;
		int y_increase = -100;
		
		for (int i = 0; i < 9; i++) {
			board[i] = "empty";
		}
		for(int y = 0; y < 3; y++) {
			x_increase = 0;
			y_increase += 100;
			for (int x = 0; x < 3; x++) {
				buttons.add(new JButton(""));
				buttons.get(value).setBounds(x_increase, y_increase, 100, 100);
				buttons.get(value).setOpaque(false);
				buttons.get(value).setContentAreaFilled(false);
				buttons.get(value).setBorderPainted(false);
				frame.add(buttons.get(value));
				buttons.get(value).addActionListener(new ActionListener());
			}
		}
	}

	public TicTacToeGUI() {
		
	}

	public static void main(String[] args) {
		new TicTacToeGUI();

	}

}
