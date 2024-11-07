package Vehical;

public class BMW extends Car implements EngineStart{

	public BMW(String name, String country) {
		super(name, country);
	}

	@Override
	public void engineStart() {
		
		System.out.println("Press Break and Clutch");
		
	}

}
