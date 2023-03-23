package Interfaces.phone;

public class OnePuls5 implements Phone {

	@Override
	public String processor() {
		
		return "SD385";
	}

	@Override
	public String OS() {
		
		return "Android";
	}

	@Override
	public int spaceInGB() {
		
		return 64;
	}
	
	
}
