package Vehical;

public class Car implements EngineStart{

	String name;
	
	String country;

	public Car(String name, String country) {
		this.name = name;
		this.country = country;
	}
	
	void start(){
		System.out.println("Car started");
	}

	@Override
	public void engineStart() {
		
		System.out.println("Engine reving");
	}
	
	
}
