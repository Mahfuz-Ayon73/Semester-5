package factory;

public class VictorianSofa implements Sofa{

	String id;
	@Override
	public void sitOnSofa() {
		
		System.out.println("Sit on Victorian Sofa");
		
	}

	@Override
	public String getID() {
		// TODO Auto-generated method stub
		return id;
	}

}
