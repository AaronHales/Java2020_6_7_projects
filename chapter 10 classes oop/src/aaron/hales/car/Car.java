package aaron.hales.car;
import java.util.Scanner;
import aaron.hales.carcomponents.*;

public class Car extends Vehicle{
	String color;
	int num_doors;
	String door_type;
	long hardware;
	Engine engine = new Engine();

	public Car() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter car color: ");
		color = input.nextLine();
		
		System.out.print("\nenter number of doors");
		num_doors = input.nextInt();
		price = 250000.00;
		brand = "chevy";
		
		
		
		
		
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
	public void start() {
		System.out.print("You started the car.");
	}

}
