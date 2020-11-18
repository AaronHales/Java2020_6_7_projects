package aaron.hales.carcomponents;

public class Engine {

	public int cylinders;
	public String type;
	
	public Engine() {
		cylinders = 8;
		type = "V";
	}
	
	public void engine_dis() {
		System.out.println(type + " " + cylinders);
	}

}
