package aaron.hales.ch8.activity;

/*
 * Java Programming
 * chapter 8 Activity
 * purpose
 * aaron.hales
 * Nov 10, 2020
 */
public class Checkerboard {
	
	public static void printCheckerboard(int numCols, int numRows)
	  {
	    // outer for loop will iterate over each row, 
	    // building one row at a time
	    for (int row=0; row<numRows; row++)
	    {
	       // to build this row, need to iterate
	       // over each column
	       for (int col=0; col<numCols; col++)
	       {
	         // we have to identify 4 separate cases and print
	         // either a "#" or " " in each case.
	         // even row / even col = "#"
	         // even row / odd  col = " "
	         // odd  row / even col = " "
	         // odd  row / odd  col = "#"
	         if (row%2 == 0)      // if even row
	         {
	            if (col%2 == 0)   // if even column
	            {
	               System.out.print("#");
	            }
	            else
	            {
	               System.out.print(" ");
	            }
	         }
	         else                 // for odd rows
	         {
	            if (col%2 == 0)   // if even column
	            {
	               System.out.print(" ");
	            }
	            else
	            {
	               System.out.print("#");
	            }
	         }
	      }
	      // after final column, advance to the next row
	      System.out.println();   
	   }
	   // after entire checkerboard, print a blank line
	   System.out.println();   
	  }
	
	public Checkerboard() {
		
	}

	public static void main(String[] args) {
		printCheckerboard(3, 5);
		
		printCheckerboard(4, 3);
		
		printCheckerboard(8, 8);

	}

}
