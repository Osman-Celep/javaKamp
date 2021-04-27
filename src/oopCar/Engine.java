package oopCar;

public class Engine {
	
	public Engine(int engId, String engCapacity, String power, String fuelType, String detail) {
		this.engId = engId;
		this.engCapacity = engCapacity;
		this.power = power;
		this.fuelType = fuelType;
		this.detail = detail;
	}
	
	int engId;
	String engCapacity;
	String power;
	String fuelType;
	String detail;
	Model model;
	
}
