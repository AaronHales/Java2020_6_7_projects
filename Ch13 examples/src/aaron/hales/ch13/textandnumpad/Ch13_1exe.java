package aaron.hales.ch13.textandnumpad;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Ch13_1exe implements ActionListener{

	JFrame frame;
	JTextField firstName;
	JTextField lastName;
	JButton my_bttn;
	JTextArea description;
	JSpinner ageSpinner;
	JButton my_bttn2;
	
	public Ch13_1exe() {
		frame = new JFrame();
		JPanel contentPane = (JPanel)frame.getContentPane();
		FlowLayout flowlayout = new FlowLayout();
		BoxLayout box = new BoxLayout(contentPane, BoxLayout.Y_AXIS);
		contentPane.setLayout(box);
		frame.setTitle("My First GUI");
		frame.setSize(500, 500);
		frame.setLocation(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		firstName = new JTextField(20);
		lastName = new JTextField();
		
		description = new JTextArea(5, 20);
		//description.setLineWrap(true);
		description.setLineWrap(false);
		
		JScrollPane disWithScrollbar = new JScrollPane(description, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		
		ageSpinner = new JSpinner(new SpinnerNumberModel(18, 0, 130, 1));
		
		
		
		
		
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
		contentPane.add(disWithScrollbar); // with scroll always have verticle, horizontal as needed
		contentPane.add(new JLabel("Age"));
		contentPane.add(ageSpinner);
		contentPane.add(my_bttn);
		contentPane.add(my_bttn2);
		
		
		
		
		
		
		
		
		
		
		
		frame.pack();
		frame.setVisible(true);
		
	}

	public static void main(String[] args) {
		new Ch13_1exe();

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object control = e.getSource();
		if (control == my_bttn) {
			String fName = firstName.getText();
			String lName = lastName.getText();
			String desText = description.getText();
			int age = (int) ageSpinner.getValue();
			JOptionPane.showMessageDialog(frame, "Hello " + fName + " " + lName + "!\nYour description:\n" + desText + 
					".\nYou said you are " + age + "years old.");
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

}
