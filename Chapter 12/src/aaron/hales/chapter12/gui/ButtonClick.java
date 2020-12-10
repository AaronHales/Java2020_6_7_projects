package aaron.hales.chapter12.gui;

import java.awt.*;
import java.awt.event.*;
import java.time.LocalDateTime;

import javax.swing.*;

public class ButtonClick  implements ActionListener{
	JFrame mainFrame;
	FlowLayout layout;
	JLabel instruct_lbl;
	JButton click_bttn;
	int clicks;
	int width;
	int x_loc;
	int height;
	int y_loc;
	
	public ButtonClick() {
		mainFrame = new JFrame();
		layout = new FlowLayout();
		mainFrame.setSize(300, 300);
		mainFrame.setLocation(20, 20);
		mainFrame.setLayout(layout);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		instruct_lbl = new JLabel();
		instruct_lbl.setText("Click the button as many times as possible");
		
		click_bttn = new JButton();
		click_bttn.setText("Clicks: " + clicks);
		click_bttn.setSize(100, 50);
		click_bttn.addActionListener(this);
		
		
		
		mainFrame.add(instruct_lbl);
		mainFrame.add(click_bttn);
		
		
		
		mainFrame.setVisible(true);
	}

	public static void main(String[] args) {
		new ButtonClick();

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		clicks++;
		int fontsize = 12;
		click_bttn.setText("Clicks: " + clicks);
		if (clicks % 10 == 0) {
			fontsize += 2;
			click_bttn.setFont(new Font("Dialog", Font.PLAIN, fontsize));
			if (clicks > 25) {
				mainFrame.getContentPane().setBackground(Color.green);
			}
			if (clicks > 50) {
				mainFrame.getContentPane().setBackground(Color.yellow);
			}
			if (clicks > 75) {
				mainFrame.getContentPane().setBackground(Color.ORANGE);
			}
			if (clicks > 100) {
				mainFrame.getContentPane().setBackground(Color.red);
				JOptionPane.showMessageDialog(null, LocalDateTime.now());
			}
		}
		
	}

}
