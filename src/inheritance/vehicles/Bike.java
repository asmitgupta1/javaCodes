package inheritance.vehicles;

import inheritance.parent.Vehicle;

public class Bike extends Vehicle {
	private String handle;

	public Bike() {
		super();
		this.handle ="short";
	}

	public Bike(String handle,String engine, int wheels, int seats, int fueltanks, String lights) {
		super(engine,wheels,seats,fueltanks,lights);
		this.handle = handle;
	}

	public String getHandle() {
		return handle;
	}

	public void setHandle(String handle) {
		this.handle = handle;
	}

	@Override
	public String toString() {
		return "Bike [handle=" + handle + ", getHandle()=" + getHandle() + ", getEngine()=" + getEngine()
				+ ", getWheels()=" + getWheels() + ", getSeats()=" + getSeats() + ", getFueltanks()=" + getFueltanks()
				+ ", getLights()=" + getLights() + "]";
	}
	
	public void run() {
		System.out.println("running bike");
		System.out.println(toString());
	}
	
	

}
