/*
 * Java Programming
 * Chapter 10 Activity: Dog House
 * Aaron Hales
 * 11/30/20
 */

package aaron.hales.dogHouse;

public class Home {

	public Home() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Dog myDog = new Dog();
		String name = myDog.getName();
		System.out.println(name);
		System.out.println("A day in the life of my dog " + name);
		myDog.wakeUp();
		
		myDog.hear(name);
		System.out.println();
		myDog.hear("ding-dong");
		System.out.println();
		myDog.hear("vroom");
		System.out.println();
		myDog.hear("meow");
		System.out.println();
		myDog.feed();
		myDog.hear("me");
		System.out.println();
		myDog.feed();
		System.out.println();
		myDog.feed();
		System.out.println();
		
		System.out.println("\n\nNight-time...");
		myDog.sleep();
		myDog.feed();
		myDog.feed();
		myDog.hear("ding-dong");
		myDog.hear("vroom");
		myDog.hear("me");
		
		System.out.println("\n\n\nAnother day...");
		myDog.wakeUp();
		myDog.feed();
		System.out.println();
		myDog.feed();
		System.out.println();
		myDog.hear("");
		System.out.println();
		myDog.feed();

	}

}
