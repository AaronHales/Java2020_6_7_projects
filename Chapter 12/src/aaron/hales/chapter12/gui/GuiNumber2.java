package aaron.hales.chapter12.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GuiNumber2 implements ActionListener{
	String name;
	JFrame mainFrame;
	FlowLayout layout;
	JLabel name_lbl;
	JTextField name_tb;
	JLabel dontClick_lbl;
	JButton dontClick_bttn;
	JLabel clickCounter_lbl;
	JButton clickCounter_bttn;
	
	
	public GuiNumber2() {
		// Initial default setup of frame
		mainFrame = new JFrame();
		layout = new FlowLayout();
		mainFrame.setLayout(layout);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setSize(300, 500);
		mainFrame.setLocation(200, 200);
		
		// Build the widgets
		name_lbl = new JLabel();
		name_lbl.setText("Enter your name");
		
		name_tb = new JTextField();
		name_tb.setPreferredSize(new Dimension(125, 25));
		
		dontClick_lbl = new JLabel();
		dontClick_lbl.setText("Do Not CLICK");
		
		dontClick_bttn = new JButton("           ");
		dontClick_bttn.addActionListener(this);
		
		clickCounter_lbl = new JLabel();
		clickCounter_lbl.setText("Clicks: 0");
		clickCounter_lbl.setSize(50, 25);
		clickCounter_lbl.setLocation(125, 100);
		
		clickCounter_bttn = new JButton();
		clickCounter_bttn.setText("Click Me!");
		clickCounter_bttn.setLocation(125, 125);
		
		
		
		
		
		
		
		
		
		// add widgets section
		mainFrame.add(name_lbl); // adding previously defined widget
		mainFrame.add(name_tb);
		//mainFrame.add(new JLabel("testing")); // anonymous adding widget
		mainFrame.add(dontClick_lbl);
		mainFrame.add(dontClick_bttn);
		mainFrame.add(clickCounter_lbl);
		mainFrame.add(clickCounter_bttn);
		
		//this needs to be the last line that gets ran
		mainFrame.setVisible(true);
		
	}

	public static void main(String[] args) {
		new GuiNumber2();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		name = name_tb.getText();
		mainFrame.getContentPane().setBackground(Color.red);
		dontClick_lbl.setForeground(Color.yellow);
		JOptionPane.showMessageDialog(null, name + ", I told you not to Click!");
		
		
	}
	
}
