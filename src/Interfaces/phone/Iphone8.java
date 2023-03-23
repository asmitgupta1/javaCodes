package Interfaces.phone;

public class Iphone8 implements Phone{

	@Override
	public String processor() {
		
		return "A11";
	}

	@Override
	public String OS() {
		
		return "iOS";
	}

	@Override
	public int spaceInGB() {
		
		return 64;
	}

}
