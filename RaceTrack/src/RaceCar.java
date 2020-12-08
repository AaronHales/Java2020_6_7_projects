
public class RaceCar implements IRacer{
	private String myName;
	private double myMaxSpeed;
	private double myAcceleration;
	private double myCurrentSpeed;
	
	public RaceCar(String name, double maxSpeed, double acceleration) {
		this.myName = name;
		this.myMaxSpeed = maxSpeed;
		this.myAcceleration = acceleration;
		this.myCurrentSpeed = 0.0;
	}
	
	public String getName() {
		return this.myName;
	}
	public double getCurrentSpeed() {
		return this.myCurrentSpeed;
	}
	public void resetCurrentSpeed() {
		this.myCurrentSpeed = 0.0;
	}
	public void accelerate() {
		this.myCurrentSpeed += this.myAcceleration;
		if (this.myCurrentSpeed > this.myMaxSpeed) {
			this.myCurrentSpeed = this.myMaxSpeed;
		}
	}
	
}
