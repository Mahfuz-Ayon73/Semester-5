package factory;

public class VictorianChair implements Chair{

	String id;
	@Override
	public void sitOnChair() {
		
		System.out.println("Sit on Victorian Chair");
		
	}

	@Override
	public String getID() {
		// TODO Auto-generated method stub
		return id;
	}

}
