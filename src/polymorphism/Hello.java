package polymorphism;

import polymorphism.phone.Nokia3310;
import polymorphism.phone.Phone;
import polymorphism.phone.samsungNote8;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Phone phone = new Phone("Nokis 3310");
//		System.out.println(phone.getModel());
//		
//		phone.features();
//		
//		samsungNote8 note8 = new samsungNote8("Note 8");
//		System.out.println(note8.getModel());
//		note8.features();
		
//		Phone nokia3310 = new Phone("Note 8");
//		System.out.println(nokia3310.getModel());
//		nokia3310.features();
//		
//		
//		Phone note8 = new samsungNote8("Note 8");
//		System.out.println(note8.getModel());
//		note8.features();
		
		Phone nokia3310 = new Hello().phone(1);
		System.out.println(nokia3310.getModel());
		nokia3310.features();
		
		
		Phone note8 = new Hello().phone(2);
		System.out.println(note8.getModel());
		note8.features();
		
		
		

	}
	
	 public Phone phone(int dailyDriver) {
		switch(dailyDriver)
		{
		case 1: return new Nokia3310("3310");
		case 2: return new samsungNote8("Note5");
		}
		return null;
	}

}
