package aaron.hales.blockspkg;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.JPanel;

public class BlockBreaker extends JPanel{
	
	ArrayList<Blocks> blocks = new ArrayList<Blocks>();
	ArrayList<Blocks> balls = new ArrayList<Blocks>();
	
	Blocks paddle;
	Thread thread;
	Animate animate;
	
	public BlockBreaker() {
		paddle = new Blocks(175, 525, 150, 25, "paddle.png");
		balls.add(new Blocks(220, 437, 25, 25, "ball.png"));
		for (int i = 0; i < 8; i++) {
			blocks.add(new Blocks((i*60+2), 0, 60, 25, "green.png"));
		}
		for (int i = 0; i < 8; i++) {
			blocks.add(new Blocks((i * 60 + 2), 25, 60, 25, "blue.png"));
		}
		for (int i = 0; i < 8; i++) {
			blocks.add(new Blocks((i * 60 + 2), 50, 60, 25, "red.png"));
		}
		for (int i = 0; i < 8; i++) {
			blocks.add(new Blocks((i * 60 + 2), 75, 60, 25, "yellow.png"));
		}
		for (int i = 0; i < 8; i++) {
			blocks.add(new Blocks((i * 60 + 2), 100, 60, 25, "purple.png"));
		}
		
		addKeyListener(this);
		setFocusable(true);
		
	}
	
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		for(Blocks b :blocks) {
			b.draw(g,this);
		}
		for (Blocks b: balls) {
			b.draw(g,this);
		}
		paddle.draw(g, this);
	}
	
	public void update() {
		for (Blocks ba :balls) {
			ba.x += ba.dx;
			ba.y += ba.dy;
			
			if (ba.x > (getWidth() - 25) && ba.dx > 0 || ba.x < 0)) {
				ba.dx *= -1;
			}
			if (ba.y < 0 || ba.intersects(paddle)) {
				ba.dy *= -1;
			}
			for (Blocks b :blocks) {
				if (ba.intersects(b) && !b.destroyed) {
					b.destroyed = true;
					ba.dy *= -1;
				}
			}
		}
		repaint();
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			animate = new Animate(this);
			thread = new Thread(animate);
			thread.start();
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT && paddle.x > 0) {
			paddle.x -= 15;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT && paddle.x < (getWidth() - paddle.width)) {
			paddle.x += 15;
		}
	}

}
