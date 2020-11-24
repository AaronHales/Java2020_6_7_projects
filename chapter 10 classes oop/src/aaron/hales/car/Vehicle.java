package aaron.hales.car;

public class Vehicle {
	private int occupancy;
	protected int top_speed;
	private int weight = 2500;
	private int length;
	protected double price;
	public String brand = "ford";
	private String model;
	private int num_wheels;
	
	public Vehicle() {
		
		final int weight = 5;
		
	}

	public int getOccupancy() {
		return occupancy;
	}

	public void setOccupancy(int occupancy) {
		this.occupancy = occupancy;
	}

	public int getTop_speed() {
		return top_speed;
	}

	public void setTop_speed(int top_speed) {
		this.top_speed = top_speed;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price <= 50000.00) {
			this.price = price;
		}
		else {
			System.out.println("That price is too high.");
		}
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getNum_wheels() {
		return num_wheels;
	}

	public void setNum_wheels(int num_wheels) {
		this.num_wheels = num_wheels;
	}
	
	
}
