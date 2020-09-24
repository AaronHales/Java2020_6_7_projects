package aaron.chapter4.lesson2;


public class Lesson2exe {

	public Lesson2exe() {
		// variable declaration
		int bank_account_total$; // 4 bytes
		short num_of_hotdogs_i_can_eat; // 2 bytes
		byte my_age; // 1 byte
		long dream_total; // 8 bytes
		
		//fraction numbers
		float my_gpa; // 4 bytes
		//double PIE; // 8 bytes
		
		// boolean data types true or false
		boolean answer; // 1 byte
		
		// non numeric data type
		char letter; // 2 bytes
		String name;
		
		
		// Variable assignment statements
		bank_account_total$ = 900; // int assignment has to be in the range of -2,147,483,648 to 2,147,483,647
		num_of_hotdogs_i_can_eat = 500; // short assignment # can't be bigger than -32,768 to 32,767
		my_age = 17; // byte assignment has to be in the range of -128 to 127
		dream_total = 200000000000L; // long assignment has to be in the range of -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 and must end with the letter L
		
		my_gpa = 3.92F; // float assignment must be in the range 1.40239846 x 10^-45 to 3.402823467 x 10^38 and have the letter F
		final double PIE = 3.141579; // 4.94065645841246544 x 10^-324 to 1.79769313486231570 x 10^308
		
		
		letter = 'a';
		answer = true;
		
		//mathematical operations
		/*
		 - subtraction
		 + addition
		 * multiplication
		 / division
		 % modulus (reminder)
		 */
		bank_account_total$ = bank_account_total$+5000;
		System.out.println(bank_account_total$);
		bank_account_total$ = bank_account_total$-1000;
		System.out.println(bank_account_total$);
		bank_account_total$ = bank_account_total$*1000;
		System.out.println(bank_account_total$);
		bank_account_total$ = bank_account_total$/77;
		System.out.println(bank_account_total$);
		

		
		bank_account_total$+=200;
		System.out.println(bank_account_total$);
		bank_account_total$-=200;
		System.out.println(bank_account_total$);
		bank_account_total$*=200;
		System.out.println(bank_account_total$);
		bank_account_total$/=200;
		System.out.println(bank_account_total$);
		bank_account_total$%=200;
		System.out.println(bank_account_total$);
		
		my_age+=1;
		my_age++;
		my_age--;
		
		double value1 = 7.6;
		int value2 = (int) (value1+0.5); // manually cast double to an int, results in loss of data, due to truncating
		System.out.println(value2);
		
		int value3 = 7;
		double value4 = value3 + 3.5; //auto-casting prevents loss of data
		System.out.println(value4);
		
		System.out.println("my age is "+my_age); // concatenate
		System.out.print("abc"); //prints as one line
		System.out.print("def"); // prints on a line, but not a new line
		System.out.print("ghi"); // prints on a line, but not a new line
		System.out.print("jkl"); // prints on a line, but not a new line
		System.out.println();
		/*
		  \b backspace
		  \f form feed
		  \n new line
		  \r carriage return
		  \t horizontal tab
		  \' single quote (')
		  \" double quote (")
		  \\ backslash (\)
		 */
		System.out.println("I said, \"Hi\" \b \f \n \r \t \' \" \\");
		
		System.out.print("New line:\n#\n");
		System.out.print("Carriage return :\r#\n");
		System.out.print("Tab:\t#\n");
		System.out.print("Backslash:\\\n");
		
		
		
		
	}

	public static void main(String[] args) {
		new Lesson2exe();

	}

}
