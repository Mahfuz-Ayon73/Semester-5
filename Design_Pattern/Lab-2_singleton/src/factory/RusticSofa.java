package factory;

public class RusticSofa implements Sofa{

	String id;
	
	
	public RusticSofa(String id) {
		this.id = id;
	}

	@Override
	public void sitOnSofa() {
		
		System.out.println("Sit on Rustic Sofa");
		
	}

	@Override
	public String getID() {
		return id;
	}

}
