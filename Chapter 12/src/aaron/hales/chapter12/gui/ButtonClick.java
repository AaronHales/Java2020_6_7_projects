package aaron.hales.chapter12.gui;

import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;

import javax.swing.*;

public class ButtonClick  implements ActionListener{
	JFrame mainFrame;
	FlowLayout layout;
	JLabel instruct_lbl;
	JButton click_bttn;
	int clicks;
	int fontsize = 12;
	
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
		click_bttn.setText("Clicks: " + clicks);
		if (clicks % 10 == 0) {
			click_bttn.setFont(new Font("FONT", Font.PLAIN, fontsize + 2));
		}
		if (clicks >= 100) {
			mainFrame.getContentPane().setBackground(Color.red);
			JOptionPane.showMessageDialog(null, "You reached 100 clicks at " + Calendar.getInstance().getTime());
		}
		else if (clicks >= 75 && clicks < 100) {
			mainFrame.getContentPane().setBackground(Color.orange);
		}
		else if (clicks >= 50 && clicks < 75) {
			mainFrame.getContentPane().setBackground(Color.yellow);
		}
		else if (clicks >= 25 && clicks < 50) {
			mainFrame.getContentPane().setBackground(Color.green);
		}
		
	}

}
