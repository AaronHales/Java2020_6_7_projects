package aaron.hales.ch2.lesson2.activity;

import java.awt.*; 
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.*;

/*
 * Java Programming
 * Aaron Hales
 * CH 12 : Lesson 4
 * Activity: Work With Me: Two Buttons Layouts
 * 12/16
 */

public class TwoButtons implements ActionListener {
	JButton redButton;
	JButton greenButton;
	JFrame myFrame;
	JPanel myPanel;
	Border myBorder;

    public static void main ( String[] args ) {
    	// create instance of TwoButtons to do all the work! 
    	new TwoButtons();
    }

    // constructor
    public TwoButtons() { 
    	// create new JFrame
    	myFrame = new JFrame();
    	myPanel = (JPanel)myFrame.getContentPane();
    	myBorder = BorderFactory.createLineBorder(Color.BLACK, 4);

    	// set the frame title, size, location
    	myFrame.setTitle("Choose Your Color");
    	myFrame.setSize(550, 150);
    	myFrame.setLocation(200, 300);

    	// make sure program terminates when window is closed
    	myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    	// assign a layout
    	//FlowLayout myLayout = new FlowLayout();
    	//GridLayout myLayout = new GridLayout(3,2);
    	//JPanel myPanel = (JPanel)myFrame.getContentPane(); 
    	//BoxLayout myLayout = new BoxLayout(myPanel, BoxLayout.Y_AXIS);
    	BorderLayout myLayout = new BorderLayout();
    	myPanel.setBorder(myBorder);
    	myFrame.setLayout(myLayout);

    	// create and add buttons to the frame
        redButton = new JButton("Red");
        greenButton = new JButton("Green");

        /*
         * grid includes all JLabels
         * border excludes empty JLables
        myFrame.add(redButton);

        myFrame.add(new JLabel(""));
        myFrame.add(new JLabel(""));
        myFrame.add(new JLabel(""));
        myFrame.add(new JLabel(""));
        
        myFrame.add(greenButton);
        */
        
        // border 
        myFrame.add(redButton,BorderLayout.LINE_START);
        myFrame.add(greenButton,BorderLayout.LINE_END);

        // link buttons to our actionPerformed() function
        redButton.addActionListener(this);
        greenButton.addActionListener(this);

    	// make the frame visible
    	myFrame.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent event) {
    	Object control = event.getSource();

    	// if redButton was clicked
    	if (control == redButton) {
    		myFrame.getContentPane().setBackground(Color.red);
    		myPanel.setBorder(BorderFactory.createLineBorder(Color.ORANGE, 4));
    	}
    	// else if greenButton was clicked
    	else if (control == greenButton) {
    		myFrame.getContentPane().setBackground(Color.green);
    		myPanel.setBorder(BorderFactory.createLineBorder(Color.BLUE, 4));
    	}
    }
}