/**
 * 
 */
package aaron.hales.ch4.lesson3.activity;

/**
 * @author aaron.hales
 * 9/28/20
 * Ch4.3
 * Truncation and Max Value Activity
 *
 */
public class Truncation {

	/**
	 * 
	 */
	public Truncation() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
  	  // demonstrate truncation and max values
	  int intResult = 3 / 2;
	  double doubleResult1 = 3 / 2;
	  double doubleResult2 = 3.0 / 2.0;
	  float maxFloat = Float.MAX_VALUE;

	  System.out.println(intResult); // the answer will be 1 due to 3/2=1.5 but int can not store decimals so it gets rid of the .5
	  System.out.println(doubleResult1); // the answer will be 1 due to 3/2=1.5 but we did not specify it to store a decimal, it gets rind of .5
	  System.out.println(doubleResult2); // the answer will be 1.5 because 3/2=1.5 and we told it to store a decimal due to it being 3.0/2.0 so it knows it should use a decimal
	  System.out.println(maxFloat); // the max float a float can store from 3.402823467 x 10^38 to 3.402823467 x 10^38 the max being 3.4028235E38 due to rounding of the max value
	}

}
