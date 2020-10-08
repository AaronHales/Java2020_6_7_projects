package aaron.hales.ch6exe;

//import java.util.*; // imports every class in java.util
import java.util.Scanner; // imports just Scanner from java.util

public class ch6_2 {

	public ch6_2() {
		
		Scanner input = new Scanner(System.in);
		
		/*
		System.out.print("Type your name and press Enter: ");
		String user_name = input.nextLine();
		
		System.out.print("Type your age and press Enter: ");
		int user_age = input.nextInt();
		user_age+=5;
		input.nextLine();
		
		System.out.print("Type your job title and press Enter: ");
		String user_job_title = input.nextLine();
		
		System.out.print("Type a boolean and press Enter: ");
		boolean input_bool = input.nextBoolean();
		
		System.out.print("Type a double and press Enter: ");
		double input_double = input.nextDouble();
		
		
		int test3 = 4;
		String test2 = "age " + test3;
		System.out.println(test2);
		String num = Integer.toString(3);
		

		System.out.println("Hello " + user_name);
		System.out.println("age " + user_age);
		System.out.println("job title " + user_job_title);
		System.out.println("boolean " + input_bool);
		System.out.println("double " + input_double);
		*/
		
		System.out.println("enter a number");
		int test2 = input.nextInt();
		String test5 = input.next();
		int test3 = input.nextInt();
		int test4 = input.nextInt();
		
		
		//int int2 = Integer.parseInt(test2);
		//int2+=42;
		System.out.println(test2);
		System.out.println(test5);
		System.out.println(test3);
		System.out.println(test4);
		
		
		
	}

	public static void main(String[] args) {
		new ch6_2();
	}

}
