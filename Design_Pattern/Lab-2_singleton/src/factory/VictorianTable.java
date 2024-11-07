package factory;

public class VictorianTable implements Table{

	String id;
	@Override
	public void putOnTable() {
		
		System.out.println("Put on Victorian Table");
		
	}
	@Override
	public String getID() {
		// TODO Auto-generated method stub
		return id;
	}

}
