package oopCar;

public class Main {

	public static void main(String[] args) {
		
		CarCompany carCompMer = new CarCompany(1,"Mercedes","Almanya");
		CarCompany carCompSeat = new  CarCompany(2, "Seat", "Ýspanya");
		CarCompany carCompBmw = new CarCompany(3,"BMW", "Almanya");

		CarCompany[] carCompanies = {carCompMer,carCompBmw,carCompSeat};
		
		Engine engine1= new Engine(1, "1.5", "184 Hp","Benzin - Elektrik", "1.5 184 Hp 0-100 Km/s : 9.9 sn");
		Engine engine2 = new Engine(1, "2.0", "250 Hp","Benzin - Elektrik", "2.0 250 Hp 0-100 Km/s : 7.9 sn");
		Engine engine3 = new Engine(1, "3.0", "314 Hp","Benzin - Elektrik", "3.0 314 Hp 0-100 Km/s : 5.9 sn");

		Engine[] engines = {engine1,engine2,engine3};
		
		Model modelA = new Model(1,"A180",new String[]{"Beyaz","Kýrmýzý", "Gri"},"Hatchback",150000, carCompMer);
		Model modelC = new Model(2,"C200",new String[]{"Beyaz","Kýrmýzý", "Gri"},"Sedan",550000, carCompMer);
		Model modelE = new Model(3,"E220",new String[]{"Beyaz","Kýrmýzý", "Gri"},"Sedan",800000, carCompMer);
		
		modelE.engines = engines;
		
		Model modelLeon = new Model(1,"Leon",new String[]{"Beyaz","Mavi", "Gri"},"Hatchback",210000, carCompSeat);
		Model modelIbiza = new Model(2,"Ibiza",new String[]{"Beyaz","Yarýþ Mavisi", "Gri"},"Hatchback",130000, carCompSeat);
		
		
		Model model3 = new Model(1,"3 Series",new String[]{"Kýrmýzý","Mavi", "Gri", "Siyah"},"Sedan",570000, carCompBmw);
		Model model7 = new Model(2,"7 Series",new String[]{"Mat Siyah","Yarýþ Mavisi", "Beyaz"},"Sedan",850000, carCompBmw);
		
		model7.engines = engines;
		
		Model[] models = {modelA, modelC, modelE, modelLeon, modelIbiza, model3, model7};
		
		for(Engine eng : engines) {
			System.out.println(eng.engCapacity + " - " + eng.power + " - " + eng.detail );
		}
		
		Manager manager = new Manager();
		
		manager.getCompanyName(carCompanies);
		
		manager.getModelsNameAndCompanyWithCountry(models);
		
		manager.getEnginesWithModelName(models);
		
		manager.getModelsColourOptions(models);
		
		manager.getModelsLowerThanGivenPrice(models, 300000);
	}

}
