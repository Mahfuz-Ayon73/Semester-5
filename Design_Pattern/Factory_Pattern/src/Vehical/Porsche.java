package Vehical;

public class Porsche extends Car implements EngineStart{

	public Porsche(String name, String country) {
		super(name, country);
	}

	@Override
	public void engineStart() {
		
		System.out.println("Press Break only");
		
	}

}
