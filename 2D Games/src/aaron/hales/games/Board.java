package aaron.hales.games;

//imports
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.CubicCurve2D;
import java.awt.geom.Line2D;
import java.awt.geom.RoundRectangle2D;
import java.awt.Image;
import javax.swing.*;

// Board is now a JPanel
public class Board extends JPanel{
	Image img;
	String location = "src/res/image/maxresdefault.jpg";
	
	private void loadImage() {
		ImageIcon ii = new ImageIcon(location);
		img = ii.getImage();
	}
	
	private void initBoard() {
		loadImage();
		int w = img.getWidth(this);
		int h = img.getHeight(this);
		setPreferredSize(new Dimension(w, h));
		
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img, 0, 0, null);
		drawShape(g);
		
	}
	
	private void drawShape(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		rh.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
		g2d.setRenderingHints(rh);
		
		Dimension size = getSize();
		double w = size.getWidth();
		double h = size.getHeight();
		
		Ellipse2D e = new Ellipse2D.Double(0, 0 , 130, 130);
		Rectangle2D r = new Rectangle2D.Double(-20, -20, 500, 250);
		CubicCurve2D c = new CubicCurve2D.Double(0, 0, 10, 500, 100, 30, 200, 100);
		Line2D l = new Line2D.Double(-500, 100, 300, -400);
		RoundRectangle2D rr = new RoundRectangle2D.Double(-500, -400, 200, 250, 90, 100);
		g2d.setStroke(new BasicStroke(1));
		g2d.setColor(Color.green);
		/*
		AffineTransform at = AffineTransform.getTranslateInstance(w/2, h/2);
		g2d.draw(at.createTransformedShape(e));
		g2d.draw(at.createTransformedShape(r));
		g2d.draw(at.createTransformedShape(c));
		g2d.draw(at.createTransformedShape(l));
		g2d.draw(at.createTransformedShape(rr));
		*/
		
		for (double deg = 0; deg < 360; deg += 25) {
			AffineTransform at = AffineTransform.getTranslateInstance(w/2, h/2);
			at.rotate(Math.toRadians(deg));
			g2d.draw(at.createTransformedShape(e));
		}

	}

	public Board() {
		initBoard();
	}

}
