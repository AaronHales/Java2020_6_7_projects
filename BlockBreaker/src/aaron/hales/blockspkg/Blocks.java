package aaron.hales.blockspkg;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;

public class Blocks extends Rectangle{
	Image pic;
	int dx = 3;
	int dy = -3;
	boolean destroyed = false;

	public Blocks(int xpos, int ypos, int w, int h, String s) {
		x = xpos;
		y = ypos;
		width = w;
		height = h;
		pic = Toolkit.getDefaultToolkit().getImage(s);
	}
	
	public void draw (Graphics g, Component c) {
		if (!destroyed) {
			g.drawImage(pic, x, y, width, height, c);
		}
	}

}
