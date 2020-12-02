package aaron.hales.ch11.exe;

public class NewKnight {

	public NewKnight() {
		Knight knight1 = new Knight();
		Knight knight2 = new Knight();
		System.out.println("Knight1 Name: " + knight1.getName());
		System.out.println("Knight2 Name: " + knight2.getName());
	}

	public static void main(String[] args) {
		new NewKnight();

	}

}
