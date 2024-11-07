package prototype;

public class Client {

	public static void main(String[] args) {
		
		Registry registry = new Registry();
		
		Clothing clothing = new Clothing("Shirt", "Clothing", 20.0, "Red", "XL");
		
		Electronics electronics = new Electronics("Lenovo", "Electronics", 40000.0, 24 , 5000);
		
		registry.registerProduct("Shirt", clothing);
		
		registry.registerProduct("laptop", electronics);
		
		Clothing newStyleClothing = (Clothing) registry.getProduct("Shirt");
		
		newStyleClothing.setColor("Blue");
		newStyleClothing.setSize("XL");
		
		Electronics newElectronics = (Electronics) registry.getProduct("laptop");
		
		newElectronics.setBatteryLife(6000);
		newElectronics.setStorageCapacity(25);
		
		if(clothing != newStyleClothing) {
			System.out.println("They are different objects");
			
			if(clothing.equals(newStyleClothing)) {
				System.out.println("They have same value");
			}
			else {
				System.out.println("They do not have same value");
			}
		}
		else {
			System.out.println("They are same objects");
		}
		
		System.out.println("Old Clothing:" + clothing.getName() + " " + clothing.getColor() + " " + clothing.getCategory() + " " + clothing.getSize());
		
		System.out.println("Old Clothing:" + newStyleClothing.getName() + " " + newStyleClothing.getColor() + " " + newStyleClothing.getCategory() + " " + newStyleClothing.getSize());
		
		
		if(electronics != newElectronics) {
			System.out.println("They are different objects");
			
			if(electronics.equals(newElectronics)) {
				System.out.println("They have same value");
			}
			else {
				System.out.println("They do not have same value");
			}
		}
		else {
			System.out.println("They are same objects");
		}
		
        System.out.println("Old Electronics:" + electronics.getName() + " " + electronics.getCategory() + " " + electronics.getBatteryLife() + " " + electronics.getStorageCapacity());
		
		System.out.println("New Electronics:" + newElectronics.getName() + " " + newElectronics.getCategory() + " " + newElectronics.getBatteryLife() + " " + newElectronics.getStorageCapacity());
		

		
	}

}
