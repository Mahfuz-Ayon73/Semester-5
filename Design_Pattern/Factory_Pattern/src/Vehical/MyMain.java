package Vehical;

public class MyMain {

	public static void main(String[] args) {
	
//		Car c1 = new BMW("BMW M6","Germany");
//		
//		Car c2 = new Porsche("Porsche Caymen","Germany");
//		
//		Car c3 = new Mercedes("Mercedes GLS 450","Germany");
		
		CarFactory car1 = new CarFactory();
		
		Car c1 = car1.getInstance("Mercedes");
        
        c1.engineStart();
//        
//        c2.engineStart();
//        
//        c3.engineStart();
//	
 }

}

