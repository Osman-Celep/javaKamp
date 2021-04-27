package oopCar;

public class Model {

	public Model(int modelId, String modelName, String[] colours, String bodyType, double startPrice, CarCompany carCompany) {
		this.modelId = modelId;
		this.modelName = modelName;
		this.colours = colours;
		this.bodyType = bodyType;
		this.startPrice = startPrice;
		this.carCompany = carCompany;
	}
	
	int modelId;
	String modelName;
	String[] colours;
	String bodyType;
	double startPrice;
	CarCompany carCompany;
	Engine[] engines;
}
