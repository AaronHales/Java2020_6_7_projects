package aaron.hales.utilityTimer;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Board extends JPanel {

	private final int B_WIDTH = 500;
	private final int B_HEIGHT = 500;
	private final double START_X = B_WIDTH / 2 + 25;
	private final double START_Y = B_HEIGHT / 2 + 25;
	private final int INITIAL_DELAY = 100;
	private final int PERIOD_INTERVAL = 25;
	
	private Image star;
	private Timer timer;
	private int x;
	private int y;
	
	public Board() {
		initBoard();
	}
	
	private void initBoard() {
		setBackground(Color.BLACK);
		setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));
		
		loadImage();
		x = (int) START_X;
		y = (int) START_Y;
		
		timer = new Timer();
		timer.scheduleAtFixedRate(new ScheduleTask(), INITIAL_DELAY, PERIOD_INTERVAL);
	}

	
	private void loadImage() {
		ImageIcon ii = new ImageIcon("src/resources/gold-star.png");
		star = ii.getImage();
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		drawStar(g);
	}
	
	private void drawStar(Graphics g) {
		g.drawImage(star, x, y, this);
		g.drawImage(star, x + 50, y + 50, this);
		Toolkit.getDefaultToolkit().sync();
	}
	
	
	
	
	
	private class ScheduleTask extends TimerTask {

		@Override
		public void run() {
			x+=5;
			repaint();
			
		}
		
	}
}
