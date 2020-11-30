/*
 * Java Programming
 * Chapter 10 Activity: Dog House
 * Aaron Hales
 * 11/30/20
 */

package aaron.hales.dogHouse;

public class Dog {
	// class-level variables
	private int numTimesFed = 0;
	private boolean sleeping = false;
	private String name = "Traeger";
	
	
	// public methods
	public String getName() {
		return this.name;
		// returns name so other functions can see name
		// also fixes error function was not returning a string when needed
		// the name of a certain dog, defined by this, gets this name
	}

	public void wakeUp() {
		System.out.println("WAKING UP");
		// prints what is in "'s
		this.sleeping = this.setSleeping(false);
		// uses setSleeping method to set sleeping to false
		this.numTimesFed = this.setNumTimesFed(0);
		// uses setNumTimesFed method to set times fed to 0
	}
	
	public int setNumTimesFed(int numTimesFed) {
		this.numTimesFed = numTimesFed; // sets numTimesFed equal to this times fed
		return numTimesFed; // returns numTimesFed
	}

	public boolean setSleeping(boolean sleeping) {
		this.sleeping = sleeping; // sets sleeping equal to this sleeping
		return sleeping; // returns sleeping
	}

	public void sleep() {
		System.out.println("SLEEPING"); // prints line
		this.sleeping = this.setSleeping(true);
		// uses setSleeping method to set sleeping to true
	}
	
	public void hear(String sound) {
		if (this.sleeping) {
			return; // checks to see if dog is sleeping and if sleeping do nothing
		}
		// checking what the sound is
		if (sound.equals(this.name)) { // if sound is equal to dogs name
			System.out.println("×hears " + sound + "×"); // prints hears the sound
			System.out.println("WAGS TAIL");
		}
		else if (sound.equals("footsteps")) { // if sound is equal to footsteps
			System.out.println("×hears " + sound + "×"); // prints hears the sound
			System.out.println("BARK");
		}
		else if (sound.equals("ding-dong")) { // if sound is equal to ding-dong
			System.out.println("×hears " + sound + "×"); // prints hears the sound
			for (int i = 0; i < 2; i++) { // prints text 2 times
				System.out.println("BARK");
			}
		}
		else if (sound.equals("vroom")) { // if sound is equal to vroom
			System.out.println("×hears " + sound + "×"); // prints hears the sound
			for (int i = 0; i < 3; i++) { // prints text 3 times
				System.out.println("BARK");
			}
		}
		else if (sound.equals("meow")) { // if sounds is equal to meow
			System.out.println("×hears " + sound + "×"); // prints hears the sound
			for (int i = 0; i < 4; i++) { // prints text 4 times
				System.out.println("BARK");
			}
		}
		else { // if sound is not equal to anything else
			System.out.println("×hears nothing×"); // prints line
			return; // do nothing
		}
	}
	
	public void feed() {
		System.out.println("×offered food×");
		if (this.sleeping) { // check to see if sleeping
			return; // if sleeping do nothing
		}
		else { // if not sleeping execute rest
			this.numTimesFed++;
			if (this.numTimesFed > 2) { // checks to see if times fed is greater than 2
				System.out.println("×ingores food×");
				System.out.println("YAWN"); // if greater then 2 yawn
			}
			else {
				System.out.println("×eats food×");
				System.out.println("YUMMY"); // if less then 2 yummy
			}
		}
	}
	
	
	public Dog() {
		// TODO Auto-generated constructor stub
	}

}
