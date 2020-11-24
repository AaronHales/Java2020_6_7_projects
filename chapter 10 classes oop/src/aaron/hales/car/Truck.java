package aaron.hales.car;

import aaron.hales.carcomponents.Engine;

public class Truck extends Vehicle{
	int bed_length;
	int num_doors;
	String door_type;
	long hardware;
	Engine engine = new Engine();
	
	public Truck() {
		
	}

	public void start() {
		System.out.print("You started the truck.");
	}
}
