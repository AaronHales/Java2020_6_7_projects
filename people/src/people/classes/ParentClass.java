package people.classes;

import java.util.Scanner;

public class ParentClass {

	private String hairColor = "Brown";
	private int age;
	private String gender;
	private String eyeColor = "Blue";
	private int weight;
	private double height;
	private String ethnicity = "White";
	
	public ParentClass() {
		// TODO Auto-generated constructor stub
	}
	
	public void speak(String message) {
		System.out.print(message);
	}
	
	public void run() {
		System.out.println("Running");
	}

	public void jump() {
		System.out.println("Jumping");
	}
	
	public String getEthnicity() {
		String password = "123456";
		String my_password = "";
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter password: ");
		try {
			my_password = input.nextLine();
			System.out.println(my_password);
		}
		catch (Exception e) {
			System.out.println("Something went wrong\n" + e);
		}
		if (password.equals(my_password)) {
			return ethnicity;
		}
		else {
			System.out.println("The password is incorrect");
			return "You are not permitted";
		}
		
	}

	public String getHairColor() {
		return hairColor;
	}

	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEyeColor() {
		return eyeColor;
	}

	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
}
