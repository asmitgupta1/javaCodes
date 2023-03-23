package inheritance;

import inheritance.vehicles.Bike;

public class Demo {

	public static void main(String[] args) {
		
//		Bike bike = new Bike();
//		
//		System.out.println(bike.getHandle());
//		System.out.println(bike.getEngine());
		
		Bike bike1 = new Bike("long","diesel",4,4,40,"LED");
//		System.out.println("Handle: "+bike1.getHandle());
//        System.out.println("Engine type: "+bike1.getEngine());
//        System.out.println("Number of seats: "+bike1.getSeats());
//        System.out.println("Feul tank capacity: "+bike1.getFueltanks());
//	    System.out.println("Head lamp type: "+bike1.getLights());
//	    System.out.println("Number of wheels: "+bike1.getWheels());
		
//		System.out.println(bike1);
		bike1.run();

	}

}
