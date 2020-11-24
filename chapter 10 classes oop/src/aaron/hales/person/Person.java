package aaron.hales.person;

import aaron.hales.car.*;

public class Person {
	int age;
	String name;
	
	public Person() {
		
	}
	
	public void startCar(Car car) {
		car.start();
	}
	
	public void startTruck(Truck truck) {
		truck.start();
	}
}
