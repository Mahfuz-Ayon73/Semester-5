package factory;

public class RusticChair implements Chair{

	String id;
	
	
	public RusticChair(String id) {
		this.id = id;
	}


	@Override
	public void sitOnChair() {
		
		System.out.println("Sit on Rustic Chair");
		
	}


	@Override
	public String getID() {
		
		return id;
	}

}
