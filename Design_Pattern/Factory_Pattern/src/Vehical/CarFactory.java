package Vehical;

public class CarFactory {

	Car getInstance(String type) {
		if(type.equals("BMW")) return new BMW("BMW M6","Germany");
		
		else if(type.equals("Porsche")) return new Porsche("Porsche Caymen","Germany");
		
		else if(type.equals("Mercedes")) return  new Mercedes("Mercedes GLS 450","Germany");
		
		else return null;
	}
}
