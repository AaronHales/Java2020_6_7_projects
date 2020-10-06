package aaron.hales.ch6.lesson2.golfscoreaverage;

import java.util.Scanner;

public class Golf_Score_Average {

	public Golf_Score_Average() {
		
		// creates the variables
		String username;
		int course1;
		int course2;
	    int course3;
	    int average;
	    Scanner input = new Scanner(System.in);
	    
	    // waits for user input
	    System.out.print("Type your name and press Enter: ");
	    username = input.nextLine();

	    // asks for scores and then stores the entered data
	    System.out.print("Enter your round 1 score: ");
	    course1 = input.nextInt();
	    System.out.print("Enter your round 2 score: ");
	    course2 = input.nextInt();
	    System.out.print("Enter your round 3 score: ");
	    course3 = input.nextInt();

	    // adds the input for course and divides by 3
	    average = (course1 + course2 + course3) / 3;

	    // prints the data
	    System.out.println("");
	    System.out.println("Hello " + username);
	    System.out.println("Score for course 1: " + course1);
	    System.out.println("Score for course 2: " + course2);
	    System.out.println("Score for course 3: " + course3);
	    System.out.println("Average score: " + average);

	    input.close();
	}

	public static void main(String[] args) {
		new Golf_Score_Average();

	}

}
