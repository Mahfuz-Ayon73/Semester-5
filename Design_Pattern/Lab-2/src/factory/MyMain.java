package factory;

public class MyMain {

	public static void main(String[] args) {
		
		Application app;
		
		FurnitureFactory factory = null;
		
		String furnitureType = "Rustic";
		
		if(furnitureType == "Mordern") {
			System.out.println("working");
			factory = new MordernFurnitureFactory();
		}
		else if(furnitureType == "Victorian") {
			factory = new VictorianFurnitureFactory();
		}
		else if(furnitureType == "Rustic") {
			factory = new RusticFurnitureFactory();
		}
		

		app = new Application(factory);
		
		app.furnitureFunction();
		
		
	

	}

}
