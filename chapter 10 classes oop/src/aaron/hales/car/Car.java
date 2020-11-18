package aaron.hales.car;
import java.util.Scanner;

import aaron.hales.carcomponents.*;

public class Car {
	
	public String color;
	public int num_doors;
	public String door_type;
	public int num_wheels;
	public String brand;
	public long hardware;
	public double price;
	Engine engine = new Engine();

	public Car() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter car color: ");
		color = input.nextLine();
		
		System.out.print("\nenter number of doors");
		try {
			num_doors = input.nextInt();
		}
		catch (java.lang.Exception ex) {
			String error = ex.getMessage();
			System.out.println("Please enter a valid number " + error);
		}
		
		
		
		
		
		input.close();
	}
	
	public void drive() {
		if (engine.cylinders == 8) {
			System.out.println("I'm driving really fast");
		}
		else {
			System.out.println("I'm driving");
		}
	}

}
