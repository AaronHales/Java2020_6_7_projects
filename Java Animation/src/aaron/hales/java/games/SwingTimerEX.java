package aaron.hales.java.games;

// imports
import java.awt.EventQueue;
import javax.swing.*;

public class SwingTimerEX extends JFrame {

	public SwingTimerEX() {
		initUI();
	}
	
	private void initUI() {
		add( new Board());
		setResizable(false);
		pack();
		setTitle("Shooting Star");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(()-> {
			SwingTimerEX ex = new SwingTimerEX();
			ex.setVisible(true);
		});

	}

}
