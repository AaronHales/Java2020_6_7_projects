package aaron.hales.chapter12.gui;

import javax.swing.*;
import java.awt.*;

public class GUI1 {

	public GUI1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		FlowLayout flowlayout = new FlowLayout();
		frame.setLayout(flowlayout);
		frame.setTitle("My First GUI");
		frame.setSize(500, 500);
		frame.setLocation(0, 0);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel my_label = new JLabel("This is a Label/nGeT rEaCtEd");
		my_label.setText("Why must I do this?");
		my_label.setForeground(Color.red);
		my_label.setBackground(Color.yellow);
		my_label.setToolTipText("RUN");
		
		
		JButton my_bttn = new JButton("NO CLICKING!");
		my_bttn.setToolTipText("click me, please.");
		JButton my_bttn1 = new JButton("NO CLICKING!");
		JButton my_bttn2 = new JButton("NO CLICKING!");
		JButton my_bttn3 = new JButton("NO CLICKING!");
		JButton my_bttn4 = new JButton("NO CLICKING!");
		
		frame.add(my_label);
		frame.add(my_bttn);
		frame.add(my_bttn1);
		frame.add(my_bttn2);
		frame.add(my_bttn3);
		frame.add(my_bttn4);
		frame.pack();
		frame.setVisible(true);
		

	}

}
