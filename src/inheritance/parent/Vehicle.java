package inheritance.parent;

public class Vehicle {
	
	private String engine;
	private int wheels;
	private int seats;
	private int fueltanks;
	private String lights;
	
	
	public Vehicle() {
		this.engine="petrol";
		this.wheels=4;
		this.seats=4;
		this.fueltanks=35;
		this.lights="LED";
	}


	public Vehicle(String engine, int wheels, int seats, int fueltanks, String lights) {
		super();
		this.engine = engine;
		this.wheels = wheels;
		this.seats = seats;
		this.fueltanks = fueltanks;
		this.lights = lights;
	}


	public String getEngine() {
		return engine;
	}


	public int getWheels() {
		return wheels;
	}


	public int getSeats() {
		return seats;
	}


	public int getFueltanks() {
		return fueltanks;
	}


	public String getLights() {
		return lights;
	}
	
	public void run()
	{
		System.out.println("running vehicle");
	}
	
	
	
	
}
