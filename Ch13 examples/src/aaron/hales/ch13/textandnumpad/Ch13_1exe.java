package aaron.hales.ch13.textandnumpad;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.*;


public class Ch13_1exe implements ActionListener, ChangeListener{

	JFrame frame;
	JTextField firstName;
	JTextField lastName;
	JButton my_bttn;
	JTextArea description;
	JSpinner ageSpinner;
	JButton my_bttn2;
	String[] gamesList = {"Destiny 2", "Minecraft", "Horizon Zero Dawn", "A Hat in Time", "Halo Master Chief Collection",
			"Star Wars Jedi Fallen Order", "Terraria", "Star Wars BattleFront 2", "Beat Saber", "Hollow Knight", "Minecraft Dungeons",
			"Mario Kart Double Dash", "Flight Simulator", "Splatoon 2", "Luigi Mansion", "Rocket League", "JackBox Part Pack",
			"Super Smash Bros", "Celeste", "Mario"};
	int index = 0;
	JComboBox cbTestBox;
	
	public Ch13_1exe() {
		/*
		String[][] testArray = new String[3][3]; // 2D array
		testArray[1][1] = "mid mid";
		testArray[0][0] = "top left";
		testArray[1][0] = "left mid";
		
		String[][][] testArray3 = new String[3][3][3]; // 3D array
		String[][][][] testArray4 = new String[3][3][3][3]; // 4D array, possible to make even more dimensions to arrays to get 5D, 6D, etc.
		*/
		
		
		 
		frame = new JFrame();
		JPanel contentPane = (JPanel)frame.getContentPane();
		FlowLayout flowlayout = new FlowLayout();
		BoxLayout box = new BoxLayout(contentPane, BoxLayout.Y_AXIS);
		contentPane.setLayout(box);
		frame.setTitle("My First GUI");
		frame.setSize(500, 500);
		frame.setLocation(500, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		firstName = new JTextField(20);
		lastName = new JTextField();
		
		description = new JTextArea(5, 20);
		//description.setLineWrap(true);
		description.setLineWrap(false);
		
		JScrollPane disWithScrollbar = new JScrollPane(description, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
													// start, min, max, step
		ageSpinner = new JSpinner(new SpinnerNumberModel(0.01, 0, 1, 0.001));
		//ageSpinner.addChangeListener(this);
		
		JList favGames = new JList(gamesList);
		favGames.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // allow only single selection
		//favGames.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION); // allow multiple no matter what, default
		//favGames.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION); // allow multiple selection if they are next to each other
		JScrollPane favGamesWithScrollbar = new JScrollPane(favGames, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		favGames.setSelectedIndex(1);
		
		cbTestBox = new JComboBox();
		cbTestBox.setEditable(true);
		
		
		my_bttn = new JButton("Submit");
		my_bttn.addActionListener(this);
		
		my_bttn2 = new JButton("Colors?");
		my_bttn2.addActionListener(this);
		
		contentPane.add(new JLabel("First Name"));
		contentPane.add(firstName);
		contentPane.add(new JLabel("Last Name"));
		contentPane.add(lastName);
		contentPane.add(new JLabel("description"));
		//contentPane.add(description); // without scroll
		contentPane.add(disWithScrollbar); // with scroll always have vertical, horizontal as needed
		contentPane.add(favGamesWithScrollbar);
		contentPane.add(cbTestBox);
		contentPane.add(new JLabel("Age"));
		contentPane.add(ageSpinner);
		contentPane.add(my_bttn);
		contentPane.add(my_bttn2);
		
		
		
		
		
		
		
		frame.pack();
		frame.setVisible(true);
		
	}
	
	// button event listener
	@Override
	public void actionPerformed(ActionEvent e) {
		Object control = e.getSource();
		if (control == my_bttn) {
			description.setText(gamesList[index]);
			index++;
			String fName = firstName.getText();
			String lName = lastName.getText();
			String desText = description.getText();
			JOptionPane.showMessageDialog(frame, "Hello " + fName + " " + lName + "!\nYour description:\n" + desText);
			//favGamesWithScrollbar.getSelectedValue();
			cbTestBox.addItem(fName);
			cbTestBox.addItem(lName);
			cbTestBox.addItem(desText);
			String selected = (String) cbTestBox.getSelectedItem();
			firstName.setText(selected);
		}
		else {
			JOptionPane messagebox = new JOptionPane();
			//String title = messagebox.showInputDialog(frame, "Enter your favorite color", "your Color", JOptionPane.WARNING_MESSAGE);
			String result = messagebox.showInputDialog(frame, "Enter your favorite color", "Your Color", JOptionPane.WARNING_MESSAGE);
			if (result == null) {
				JOptionPane.showMessageDialog(null, "Why did you just close me? Do you hate me?\nI'll record this in my memory bank.");
			}
			else if (result.equals("")) {
				JOptionPane.showMessageDialog(null, "Why didn't you enter anything? Do you hate colors?");
			}
			else {
				JOptionPane.showMessageDialog(null,  "Your favorite color is: " + result + ". But why though?\nIs " + result + " even a color,"
						+ " I am unable to locate "+ result + " in my color database.\nI'll add " + result + " to my color database.");
				JOptionPane.showMessageDialog(null, "Task completed. " + result + " has been successfully added to my color database.");
			}
		}
		
	}
	
	public static void main(String[] args) {
		new Ch13_1exe();

	}
	
	// spinner event listener
	@Override
	public void stateChanged(ChangeEvent e) {
		int userAge = (int) ageSpinner.getValue();
		int targetAge = 25;
		if (userAge < targetAge) {
			int toTAge = targetAge - userAge;
			JOptionPane.showMessageDialog(null, "You are " + toTAge + " years from the Target age");
		}
		else {
			JOptionPane.showMessageDialog(null, "Wow, why are you so old");
		}
		
	}
	

}
