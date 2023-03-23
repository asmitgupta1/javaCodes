package Interfaces;

import Interfaces.phone.OnePuls5;
import Interfaces.phone.Phone;

public class Hello {

	public static void main(String[] args) {
		
		Phone phone = new OnePuls5();
		
		System.out.println(phone.processor());
		

	}

}
