package aaron.hales.ch5.ls2;

public class StringMethods {

	public StringMethods() {
		
		/*
		 equals(X)
		 equalsIgnoreCase(X)	equals() returns true if String X is equal to the current String object.  This is a case-sensitive comparison.  You may perform a case-insensitive comparison using equalsIgnoreCase() instead.
		 charAt(X)				Returns the char value at the string location specified by the numeric index X.  The first char in a string is index 0.
		 compareTo(X)	
		 compareToIgnoreCase(X)	Returns 0 if the two strings are equal, or a negative number if this string is lexicographically less than the target X, or a positive number if this string is lexicographically greater than the target X.
		 contains(X)			Returns true if the current string contains the substring X, or false if not found.
		 indexOf(X)				Returns the numeric index of the first occurrence of the character or string X in the string, or -1 if the character or string X is not found.
		 lastIndexOf(X)			Returns the numeric index of the last occurrence of the character or string X in the string, or -1 if the character or string X is not found.
		 length()				Returns the number of characters in the string.  An empty string returns 0.
		 replace(X,Y)			Returns a new String formed by replacing all occurrences of the character or string X with the character or string Y.
		 substring(X)			Returns a new String copied from the current String starting at index X and running through the string end
		 substring(X,Y)			Returns a new String copied from the current String starting at index X and ending at index Y-1
		 toLowerCase()			Returns a new String where the contents of the current String have been converted to all lower case.  The original String is unchanged.
		 toUpperCase()			Returns a new String where the contents of the current String have been converted to all upper case.  The original String is unchanged.
		 */
		String let = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		String new_sub = let.substring(7, 11);
		System.out.println(new_sub);
		
		int first = let.indexOf("A");
		int second = let.indexOf("A");
		int third = let.indexOf("R");
		int forth = let.indexOf("O");
		int fifth = let.indexOf("N");
		
		char one = let.charAt(first);
		char two = let.charAt(second);
		char three = let.charAt(third);
		char four = let.charAt(forth);
		char five = let.charAt(fifth);
		
		System.out.print(one);
		System.out.print(two);
		System.out.print(three);
		System.out.print(four);
		System.out.println(five);
		
		System.out.println(let.length());
		
		String my_string2 = "moon";
		String my_string3 = "MOON";
		String new_test = my_string2.replace("o", "z");
		int lastO = my_string3.lastIndexOf("O");
		System.out.println(lastO);
		String test2 = my_string2.toUpperCase();
		String test3 = my_string3.toLowerCase();
		System.out.println(new_test);
		System.out.println(test2);
		System.out.println(test3);
		
		
	}

	public static void main(String[] args) {
		new StringMethods();

	}

}
