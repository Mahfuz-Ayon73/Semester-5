package factory;

public class MordernSofa implements Sofa{

	String id;
	public MordernSofa(String id1) {
		this.id = id;
	}

	@Override
	public void sitOnSofa() {
		
		System.out.println("Sit on Mordern Sofa");
		
	}

	@Override
	public String getID() {
		// TODO Auto-generated method stub
		return id;
	}

}
