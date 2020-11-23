package people.start;

import people.classes.*;

public class Mainentry {

	public Mainentry() {
		ParentClass parent = new ParentClass();
		ChildClass child = new ChildClass();
		System.out.println(child.getHairColor());
		System.out.println(child.getEyeColor());
		System.out.println(child.getEthnicity());
		child.speak("hello");
		parent.speak("hello");
		
		child.playInsturment();
	}

	public static void main(String[] args) {
		new Mainentry();

	}

}
