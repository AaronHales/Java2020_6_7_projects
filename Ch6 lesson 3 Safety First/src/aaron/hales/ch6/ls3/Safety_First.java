package aaron.hales.ch6.ls3;

import java.util.*; // imports all of java util, this includes Scanner

public class Safety_First {

	public Safety_First() {
	      String username;
	      int course1;
	      int course2;
	      int course3;
	      int average;

	      Scanner input = new Scanner(System.in);

	      System.out.print("Type your name and press Enter: ");
	      username = input.nextLine();

	      System.out.print("Enter your round 1 score: ");
	      if (input.hasNextInt())
	      { 
	         course1 = input.nextInt();
	      } 
	      else
	      {
	         course1 = 0;
	         input.nextLine(); // clear out bad data
	      } 
	      
	      System.out.print("Enter your round 2 score: ");
	      if (input.hasNextInt())
	      { 
	         course2 = input.nextInt();
	      } 
	      else
	      {
	         course2 = 0;
	         input.nextLine(); // clear out bad data
	      }
	      
	      System.out.print("Enter your round 3 score: ");
	      if (input.hasNextInt())
	      { 
	         course3 = input.nextInt();
	      } 
	      else
	      {
	         course3 = 0;
	         input.nextLine(); // clear out bad data
	      }

	      average = (course1 + course2 + course3) / 3;

	      System.out.println("");
	      System.out.println("Hello " + username);
	      System.out.println("Score for course 1: " + course1);
	      System.out.println("Score for course 2: " + course2);
	      System.out.println("Score for course 3: " + course3);
	      System.out.println("Average score: " + average);

	      input.close();				
	}

	public static void main(String[] args) {
		new Safety_First();

	}

}
