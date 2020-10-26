package aaron.hales.ch8;

import java.util.Scanner;

public class Ch8_1exe {

	public Ch8_1exe() {
		double allowance = 10.00;
		boolean generousParents = !(allowance < 10);
		System.out.println("generousParents: " + generousParents);
		print("hello");
		print(1);
		print(3.14);
		print(true);
		String x = input("will this work?");
		print(x);
		String y = input("testing a number input");
		print(y);
		
	}
	
	public static String input(String question) {
		Scanner input = new Scanner(System.in);
		System.out.println(question);
		String x = input.nextLine();
	
		return x;
	}

	public static void main(String[] args) {
		new Ch8_1exe();

	}
	
	// design functions and methods to do one task only
	// static makes it so new does not need to be used
	public static void steve() {
		System.out.println("my name is steve");
	}
	
	public static void print(Object x) {
		System.out.println(x);
	}


}
