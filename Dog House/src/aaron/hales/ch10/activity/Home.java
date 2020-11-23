package aaron.hales.ch10.activity;

public class Home {

	public Home() {
		Dog my_dog = new Dog();
		String name =  my_dog.getName();
		
		System.out.println("A day in a life of my dog " + name);
		// test all of the dog's behavioral commands while awake
		my_dog.wakeUp();
		my_dog.feed();
		my_dog.hear("ding-dong");
		my_dog.hear("ding-dong");
		my_dog.hear(name);
		my_dog.hear("vroom");
		my_dog.hear("ding-dong");
		my_dog.feed();
		my_dog.feed();

		// test to ensure the dog doesn't do anything while asleep
		System.out.println("\nNight-time...");
		my_dog.sleep();
		my_dog.feed();
		my_dog.hear("ding-dong");
		my_dog.wakeUp();

		// test to ensure the dog resets correctly when woken for a new day
		System.out.println("\nAnother day...");
		my_dog.hear("ding-dong");
		my_dog.feed();
		my_dog.feed();
		my_dog.feed();
		my_dog.hear("meow");
		
	}

	public static void main(String[] args) {
		new Home();

	}

}
