package compostion.laptop;

import compostion.laptop.components.GraphicCard;
import compostion.laptop.components.Processor;

public class Laptop {
	
	private float screen;
	private Processor processor;
	private String ram;
	private String hardDrive;
	private GraphicCard graphicsCard;
	private String opticalDrive;
	private String keyboard;
	public Laptop() {
		this.screen = 15.6f;
		this.processor = new Processor();
		this.ram = "DDR4";
		this.hardDrive = "2TB";
		this.graphicsCard = new GraphicCard();
		this.opticalDrive = "MLT layer";
		this.keyboard = "backlit";
	}
	public Laptop(float screen, Processor processor, String ram, String hardDrive, GraphicCard graphicsCard,
			String opticalDrive, String keyboard) {
		super();
		this.screen = screen;
		this.processor = processor;
		this.ram = ram;
		this.hardDrive = hardDrive;
		this.graphicsCard = graphicsCard;
		this.opticalDrive = opticalDrive;
		this.keyboard = keyboard;
	}
	@Override
	public String toString() {
		return "Laptop [screen=" + screen + ", processor=" + processor + ", ram=" + ram + ", hardDrive=" + hardDrive
				+ ", graphicsCard=" + graphicsCard + ", opticalDrive=" + opticalDrive + ", keyboard=" + keyboard + "]";
	}
	public Processor getProcessor() {
		return processor;
	}
	public float getScreen() {
		return screen;
	}
	public void setScreen(float screen) {
		this.screen = screen;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getHardDrive() {
		return hardDrive;
	}
	public void setHardDrive(String hardDrive) {
		this.hardDrive = hardDrive;
	}
	public GraphicCard getGraphicsCard() {
		return graphicsCard;
	}
	public void setGraphicsCard(GraphicCard graphicsCard) {
		this.graphicsCard = graphicsCard;
	}
	public String getOpticalDrive() {
		return opticalDrive;
	}
	public void setOpticalDrive(String opticalDrive) {
		this.opticalDrive = opticalDrive;
	}
	public String getKeyboard() {
		return keyboard;
	}
	public void setKeyboard(String keyboard) {
		this.keyboard = keyboard;
	}
	public void setProcessor(Processor processor) {
		this.processor = processor;
	}
	
	public String gamingMode() {
		
		processor.setFrequency(processor.getMaxfrequency());
		return "Success";
		
	}
	
	


}
