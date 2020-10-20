package aaron.hales.ch5.act;

// imports
import java.util.Calendar;

public class String_Theory {

	public String_Theory() {
		String str1 = "Bibbety";
		String str2 = "Bobbety";
		String str3 = "Boo";
		String str4 = "BIBBETY";
		
		System.out.println("str1 equals str4: " + str1.equals(str4)); // checks to see if all characters are equal, is case sensitive
		System.out.println("str1 equals str4 (ignore case) : " + str1.equalsIgnoreCase(str4)); // checks to see if characters are equal, ignores case
		System.out.println("str1 replacing 'b' with 'p': " + str1.replace('b', 'p')); // replaces b with p
		System.out.println("first three characters in str2: " + str2.subSequence(0, 3)); // starts at index 0 and goes to index 3 and creates new string
		System.out.println("uppercase str3: " + str3.toUpperCase()); // changes all characters to uppercase
		System.out.println(String.format("the current time is: %tr", Calendar.getInstance())); // gets the time and converts it to am/pm using %tr
		System.out.println(str1 + str2); // combines the strings
		System.out.println("parseInt resutls: " + Integer.parseInt("5")); // converts string 5 to int to get 5
		System.out.println("location of 'e' in str1: " + str1.indexOf('e')); // gets the index of e in str1, only the first one
		
	}

	public static void main(String[] args) {
		new String_Theory();

	}

}
