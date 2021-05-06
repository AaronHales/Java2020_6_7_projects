package aaron.hales.utilityTimer;

// Imports
import java.awt.EventQueue;
import javax.swing.JFrame;

public class UtilityTimerEX extends JFrame {

	public UtilityTimerEX() {
		initui();
	}
	
	private void initui() {
		add(new Board());
		setResizable(false);
		pack();
		setTitle("Shooting Star!");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(()-> {
			JFrame ex = new UtilityTimerEX();
			ex.setVisible(true);
		});
	}
}
