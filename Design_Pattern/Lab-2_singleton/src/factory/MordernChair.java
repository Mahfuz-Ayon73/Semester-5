package factory;

public class MordernChair implements Chair{

	String id;
	
	public MordernChair(String id) {
		this.id = id;
	}
	
	@Override
	public void sitOnChair() {
		
		System.out.println("Sit on Mordern Chair");
		
	}

	@Override
	public String getID() {
		// TODO Auto-generated method stub
		return id;
	}

}
