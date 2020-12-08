package aaron.hales.school;

import java.util.Random;
import java.util.Scanner;

public class Student {
	Scanner input = new Scanner(System.in);
	static int total_students;
	private String name;
	private String idnum;
	private long lunch_num;
	private double gpa;
	private int grade;
	private Classes[] classes = new Classes[10];
	private String bday;
	private String health;
	private String address;
	private String email;
	private String phone;
	
	private void pickClasses() {
		
		String[] class_list = {"Math",
				"English",
				"History",
				"Science",
				"Programming_Java",
				"Programming_Python",
				"Programming_C_Sharp",
				"PE",
				"Pro_Start",
				"Cosmo",
				"Health",
				"Chior",
				"Internship",
				"Accounting",
				"Business",
				"Auto_Shop",
				"Wood_Shop",
				"Metal_Shop",
				"A_plus"};
		
		class_list[0] = "Math";
		for (int i = 0; i < 19; i++) {
			System.out.println(class_list[i]);
		}
		System.out.println("What class would you like for Period 1");
		String inputclass = input.nextLine();
		if (inputclass.equals("math")) {
			classes[0] = Classes.Math;
		}
		else if (inputclass.equals("english")) {
			classes[0] = Classes.English;
		}
		else {
			classes[0] = Classes.Programming_Java;
		}
		
		
	}

	public Student(String name, String idnum, int lunch_num, double gpa, int grade, String bday, String health,
			String address, String email, String phone) {
		super();
		this.name = name;
		this.idnum = idnum;
		this.lunch_num = lunch_num;
		this.gpa = gpa;
		this.grade = grade;
		this.bday = bday;
		this.health = health;
		this.address = address;
		this.email = email;
		this.phone = phone;
		total_students++;
	}

	public Student(double gpa, int grade) {
		super();
		this.gpa = gpa;
		this.grade = grade;
		total_students++;
	}
	
	private String genId() {
		Random rand = new Random();
		int num1 = rand.nextInt(10);
		String pos1 = Integer.toString(num1);
		int num2 = rand.nextInt(10);
		String pos2 = Integer.toString(num2);
		int num3 = rand.nextInt(10);
		String pos3 = Integer.toString(num3);
		int num4 = rand.nextInt(10);
		String pos4 = Integer.toString(num4);
		int num5 = rand.nextInt(10);
		String pos5 = Integer.toString(num5);
		int num6 = rand.nextInt(10);
		String pos6 = Integer.toString(num6);
		int num7 = rand.nextInt(10);
		String pos7 = Integer.toString(num7);
		int num8 = rand.nextInt(10);
		String pos8 = Integer.toString(num8);
		
		String id = pos1 + pos2 + pos3 + pos4 + pos5 + pos6 + pos7 + pos8;
		System.out.println(id);
		return id;
	}
	
	public long genLunchnum(String id, int grade) {
		long lunchnum;
		String x = id + grade;
		lunchnum = Long.parseLong(x);
		System.out.println(lunchnum);
		return lunchnum;
	}
	
	public Student() {
		setIdnum(genId());
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name");
		setName(input.nextLine());
		System.out.println("Enter your birthday (MM/DD/YYYY)");
		setBday(input.nextLine());
		System.out.println("Enter your GPA");
		setGpa(input.nextDouble());
		input.nextLine();
		System.out.println("Enter your health conditions");
		setHealth(input.nextLine());
		System.out.println("Enter your address");
		setAddress(input.nextLine());
		System.out.println("Enter your grade level");
		setGrade(input.nextInt());
		input.nextLine();
		System.out.println("Enter your email");
		setEmail(input.nextLine());
		System.out.println("Enter your phone number");
		setPhone(input.nextLine());
		setLunch_num(genLunchnum(this.idnum, this.grade));
		pickClasses();
		total_students++;
		
		input.close();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdnum() {
		return idnum;
	}

	public void setIdnum(String idnum) {
		this.idnum = idnum;
	}

	public Long getLunch_num() {
		return lunch_num;
	}

	public void setLunch_num(Long lunch_num) {
		this.lunch_num = lunch_num;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getBday() {
		return bday;
	}

	public void setBday(String bday) {
		this.bday = bday;
	}

	public String getHealth() {
		return health;
	}

	public void setHealth(String health) {
		this.health = health;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Student(String name) {
		this.name = name;
	}

}
