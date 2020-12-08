package aaron.hales.school;

public class School {

	public School() {
		//Student aaron_h = new Student();
		Student.total_students += 10;
		System.out.println(Student.total_students);
		Student Austin = new Student(2.8, 11);
		System.out.println(Student.total_students);
		Student bob = new Student("Bob", "1", 1, 0.0, 11, "06/18/2003", "n/a", "123", "a@a", "12353434");
		System.out.println(Student.total_students);
	}

	public static void main(String[] args) {
		new School();

	}

}
