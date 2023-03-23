package compostion;

import compostion.laptop.Laptop;
import compostion.laptop.components.GraphicCard;
import compostion.laptop.components.Processor;

public class Hello {

	public static void main(String[] args) {
		
		Laptop lappy = new Laptop();
//		System.out.println(lappy.getProcessor().getBrand());
		
		Processor processor = new Processor("intel", "7200U", 7, 4, 4, "6MB"
				+ "", "2.5Ghz", "2.5Ghz", "3.1Ghz");
		GraphicCard graphicsCard = new GraphicCard("Nvidia", 1050, "4GB");
		Laptop gamingLaptop = new Laptop(17f, processor,
				"DDR4", "2TB", graphicsCard, null, "backlit");
		
		System.out.println(gamingLaptop);
		gamingLaptop.gamingMode();
		System.out.println(gamingLaptop.getProcessor().getFrequency());

	}

}
