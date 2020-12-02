package aaron.hales.ch11.exe;

import java.util.Scanner;

public class Knight {
	private String name;
	
	public Knight() {
		Scanner input = new Scanner(System.in);
		System.out.print("What is your name: ");
		String inputname = input.nextLine();
		setName(inputname);
		input.close();
		
	}

	public Knight(String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	

}
