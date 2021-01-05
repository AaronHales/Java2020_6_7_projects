package aaron.hales.chapter12.gui;

import java.awt.*;
import javax.swing.*;

public class ContentPanes {
	JFrame topRightPanel;
	JPanel contentPane;
	JFrame myFrame;
	
	public ContentPanes() {
		myFrame = new JFrame();
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//main JPanel and overall layout manager
		contentPane = (JPanel)myFrame.getContentPane();
		myFrame.setSize(200, 200);
		myFrame.setLocation(200, 200);
		GridLayout grid = new GridLayout(2, 2);
		BorderLayout border = new BorderLayout();
		contentPane.setLayout(grid);
		
		// child JPanel for the top area
		JPanel topLeftPanel = new JPanel(grid);
		JPanel topRightPanel = new JPanel(border);
		JPanel bottomLeftPanel = new JPanel();
		BoxLayout boxlayout1 = new BoxLayout(bottomLeftPanel, BoxLayout.Y_AXIS);
		JPanel bottomRightPanel = new JPanel();
		BoxLayout boxlayout2 = new BoxLayout(bottomRightPanel, BoxLayout.X_AXIS);
		
		for (int i = 0; i < 10; i++) {
			topLeftPanel.add(new JButton("button" + (i+1)));
		}
		
		topRightPanel.add(new JButton("button 1"), border.PAGE_START);
		topRightPanel.add(new JButton("button 2"), border.PAGE_END);
		topRightPanel.add(new JButton("button 3"), border.LINE_START);
		topRightPanel.add(new JButton("button 4"), border.LINE_END);
		
		//bottomLeftPanel.add(new JButton("button 1"))
		
		
		contentPane.add(topLeftPanel);
		contentPane.add(topRightPanel);
		contentPane.add(bottomLeftPanel);
		contentPane.add(bottomRightPanel);
		
		
		
		
		myFrame.setVisible(true);
	}

	public static void main(String[] args) {
		new ContentPanes();

	}

}
