/**
 * 
 */

package aaron.hales.casting.exe;

import java.lang.*;

/**
 * @author aaron.hales
 * 9/28/20
 * Casting
 */
public class Casting {

	/**
	 * byte		 java.lang.Byte
	 * short	 java.lang.Short
	 * int		 java.lang.Integer
	 * long		 java.lang.Long
	 * float	 java.lang.Float
	 * double	 java.lang.Double
	 * char		 java.lang.Character
	 * boolean	 java.lang.Boolean
	 */
	public Casting() {
		double value1 = 7.2;
		int value2 = (int) value1;
		
		int number55 = 55;
		char five = (char) number55;
		System.out.println(five);
		
		int value3 = 100;
		double value4 = value3;
		
		
		byte num1 = 127;
		Byte num2 = 127;
		System.out.println(num1);
		System.out.println(num2);
		
		short num3 = 3;
		Short num4 = 3;
		Integer num5 = 5;
		
		int max_int_value = Integer.MIN_VALUE;
		System.out.println(max_int_value);
		
		
		
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Casting();

	}

}
