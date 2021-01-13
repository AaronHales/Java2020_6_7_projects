package aaron.hales.games;

// imports
import javax.swing.JFrame;
import java.awt.EventQueue;

// Application is now a JFrame
public class Application extends JFrame{
	
	int height = 200;
	int width = 250;
	String title = "title";

	public Application() {
		initUI();
		
	}
	
	private void initUI() {
		add(new Board());
		
		setSize(width, height);
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		pack(); // do not use with shapes in this example
	}

	public static void main(String[] args) {
		
		EventQueue.invokeLater(()->{
			Application ex = new Application();
			ex.setVisible(true);
		});

	}

}
