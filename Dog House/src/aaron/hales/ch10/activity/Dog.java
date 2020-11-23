package aaron.hales.ch10.activity;

public class Dog {

	// declare and initialize private member variables here
	private int num_times_fed = 0;
	private boolean sleeping = false;
	private String name = "Dogo";
	
	public Dog() {
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}
	
	public void wakeUp() {
		System.out.println("WAKING UP");
		sleeping = false;
		num_times_fed = 0;
	}
	
	public void sleep() {
		sleeping = true;
		System.out.println("SLEEPING");
	}
	
	public void hear(String sound) {
		if (sleeping) {
			return;
		}
		if (sound.equals(name)) {
			System.out.println("×hears " + sound + "×");
			System.out.println("WAGS TAIL");
		}
		else if (sound.equals("ding-dong")) {
			System.out.println("×hears " + sound + "×");
			System.out.println("BARK");
			System.out.println("BARK");
		}
		else if (sound.equals("meow")) {
			System.out.println("×hears " + sound + "×");
			for (int i = 0; i < 3; i++) {
				System.out.println("BARK");
				System.out.println("BARK");
			}
		}
		else if (sound.equals("vroom")) {
			System.out.println("×hears " + sound + "×");
			for (int i = 0; i < 3; i++) {
				System.out.println("BARK");
			}
		}
	}
	
	public void feed() {
		if (sleeping) {
			return;
		}
		num_times_fed++;
		if (num_times_fed <= 2) {
			System.out.println("YUMMY");
		}
		else {
			System.out.println("YAWN");
		}
	}

}
