package oopCar;

public class Manager {

	public void getCompanyName(CarCompany[] carCompanies) {
		
		for(CarCompany carCompany : carCompanies) {
			System.out.println(carCompany.companyName);
		}
	}
	
	public void getModelsNameAndCompanyWithCountry(Model[] models) {
		for(Model model : models) {
			System.out.println(model.carCompany.counrty + " - " + model.carCompany.companyName + " -- Model : " + model.modelName);
		}
	}
	
	public void getEnginesWithModelName(Model[] models) {
		for(Model model : models) {
			if(model.engines != null && model.engines.length > 0)
				for(Engine engine : model.engines)
					System.out.println(engine.detail + " -- Model : " + model.modelName + " - Ülkesi : " + model.carCompany.counrty);
		}
	}
	
	public void getModelsColourOptions(Model[] models) {
		for(Model model : models) {
			String colour = "";
			for (int i = 0; i < model.colours.length; i++) {
				if(i < model.colours.length - 1)
					colour += model.colours[i] + " - "; 
				else
					colour += model.colours[i];
			}
			
			System.out.println(model.carCompany.companyName + " " + model.modelName + " - " + colour);
		}
	}
	
	public void getModelsLowerThanGivenPrice(Model[] models, double price) {
		Boolean exists = false;
		System.out.println(price + " ' den düþük olanlar : ");
		for(Model model : models) {
			if(model.startPrice < price) {
				exists = true;
				System.out.println(model.carCompany.counrty + " - " + model.carCompany.companyName + " -- Model : " + model.modelName + " " + model.startPrice);
			}
		}
		if(!exists)
			System.out.println("Bulunamadý.");
	}
}
