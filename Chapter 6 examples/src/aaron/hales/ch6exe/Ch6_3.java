package aaron.hales.ch6exe;

// imports
import java.util.*;

public class Ch6_3 {

	public Ch6_3() {
		Scanner input = new Scanner(System.in);
		double gpa;
		/*
		System.out.print("Type your GPA and press enter: ");
		if (input.hasNextDouble()) {
			gpa = input.nextDouble();
			input.nextLine();
		}
		else {
			System.out.println("Invalid Entry: Must have low GPA");
			gpa = 0.1;
		}
		
		System.out.println("Your gpa is " + gpa);
		*/
		
		System.out.println("option2");
		
		System.out.print("Type your GPA and press enter: ");
		gpa = 0.0;
		boolean good = input.hasNextDouble();
		
		if (input.hasNextDouble()) {
			gpa = input.nextDouble();
		}
		
		else {
			
			while (good == false) {
				input.nextLine();
				System.out.println("not a good value");
				System.out.print("Type your GPA and press enter: ");
				good = input.hasNextDouble();
				
				if (good == true) {
					gpa = input.nextDouble();
				}
			}
			
		}
		
		System.out.println("Your gpa is " + gpa);
		/*
		 * relational operators / returns true or false
		 * <  less than
		 * >  greater than
		 * <= less than and equal to
		 * >= greater than and equal to
		 * == equal to / comparison
		 * =  assign a value to variable / assignment
		 * != not
		 * 
		 * && and both things must be true
		 * || or  one must be true
		 * !  not 
		 */
		
		input.close();
	}

	public static void main(String[] args) {
		new Ch6_3();

	}

}
