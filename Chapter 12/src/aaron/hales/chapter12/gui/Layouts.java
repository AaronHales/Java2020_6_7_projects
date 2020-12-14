package aaron.hales.chapter12.gui;

import javax.swing.*;
import java.awt.*;

public class Layouts {
	JFrame myFrame;
	JPanel contentPane; // gives access to default contentPane

	public Layouts() {
		myFrame = new JFrame(); // creates a new JFrame window
		contentPane = new JPanel(); // creates a new contentPane
		myFrame.setContentPane(contentPane); // replaces old JPanel with our new one
		
		myFrame.setLayout(new FlowLayout()); //option 1 no access to layout manager
		
		FlowLayout flowlayout = new FlowLayout(); // option 2 now have access to the layout manager
		GridLayout grid = new GridLayout(3, 2, 5, 10);
		grid.setHgap(20);
		grid.setVgap(20);
		BorderLayout border1 = new BorderLayout();
		BorderLayout border2 = new BorderLayout(5, 10);
		BoxLayout boxlayout1 = new BoxLayout(contentPane, BoxLayout.Y_AXIS);
		BoxLayout boxlayout2 = new BoxLayout(contentPane, BoxLayout.X_AXIS);
		contentPane.setLayout(boxlayout2); // set the layout manager
		
		myFrame.setSize(300, 500);
		myFrame.setLocation(200, 200);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/*
		for (int i = 0; i < 10; i++) {
			myFrame.add(new JButton("button " + (i+1)));
		}
		*/
		/* boarder layout button creation
		myFrame.add(new JButton("button 1"), border2.PAGE_START);
		myFrame.add(new JButton("button 2"), border2.PAGE_END);
		myFrame.add(new JButton("button 3"), border2.LINE_START);
		myFrame.add(new JButton("button 4"), border2.LINE_END);
		myFrame.add(new JButton("button 5"), border1.CENTER);
		*/
		
		/* horizontal box layout
		JButton bttn1 = new JButton("button 1");
		bttn1.setAlignmentX(Component.CENTER_ALIGNMENT);
		myFrame.add(bttn1);
		JButton bttn2 = new JButton("button 2");
		bttn2.setAlignmentX(Component.LEFT_ALIGNMENT);
		myFrame.add(bttn2);
		JButton bttn3 = new JButton("button 3");
		bttn3.setAlignmentX(Component.RIGHT_ALIGNMENT);
		myFrame.add(bttn3);
		JButton bttn4 = new JButton("button 4");
		bttn4.setAlignmentX(Component.CENTER_ALIGNMENT);
		myFrame.add(bttn4);
		JButton bttn5 = new JButton("button 5");
		bttn5.setAlignmentX(Component.LEFT_ALIGNMENT);
		myFrame.add(bttn5);
		*/
		
		// vertical box layout
		JButton bttn1 = new JButton("button 1");
		bttn1.setAlignmentY(Component.CENTER_ALIGNMENT);
		myFrame.add(bttn1);
		JButton bttn2 = new JButton("button 2");
		bttn2.setAlignmentY(Component.TOP_ALIGNMENT);
		myFrame.add(bttn2);
		JButton bttn3 = new JButton("button 3");
		bttn3.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		myFrame.add(bttn3);
		JButton bttn4 = new JButton("button 4");
		bttn4.setAlignmentY(Component.CENTER_ALIGNMENT);
		myFrame.add(bttn4);
		JButton bttn5 = new JButton("button 5");
		bttn5.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		myFrame.add(bttn5);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		myFrame.setVisible(true);
	}

	public static void main(String[] args) {
		new Layouts();

	}

}
