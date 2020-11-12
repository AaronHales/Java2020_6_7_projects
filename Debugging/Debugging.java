public class Debugging{
	
	public static void main(String[] args) {
		/*
		String my_string = "12";
		String my_number = my_string;
		System.out.println(my_number);
		*/
		
		/*
		int numerator = 14;
		int denominator1 = 3+4;
		int denominator2 = 7;
		int result = 0;
		
		try {
		result = numerator / (denominator1 - denominator2);
		}
		catch (Exception x) {
			System.out.println("I can not divide by zero.\nDo it yourself!\n\n" + x);
		}
		System.out.println("result is " + result);
		*/
		
		/*
		String my_string = null;
		int length = my_string.length();
		System.out.println("String length = " + length);
		*/
		
		/*
		// example 1
		String username = "Elmer";
		char first_letter = username.charAt(5); // index out of range, IndexOutofBoundsException, index has to be 0-4
		System.out.println("First char: " + first_letter);
		*/
		
		/*
		// example 2 fixed by chaning input_password from null to "" or if(stored_password.equals(input_password))
		String input_password = "";
		String stored_password = "mystery";
		if (input_password.equals(stored_password)) {
			System.out.println("Login Successful");
		}
		*/
		
		
		// example 3  divided by zero error, ArithmeticException, fix by changing num_grades to something other than 0 or use a try catch block
		int num_grades = 0;
		int total_score = 500;
		double avg_grade = 0;
		try {
			avg_grade = total_score / num_grades;
		}
		catch (Exception x) {
			System.out.println("Divide by zero\n" + x);
		}
		System.out.println("Grade average: " + avg_grade);
		
		
		
		
		
		
		
		
	}
	
	
}