package factory;

public class MordernTable implements Table{

	String id;
	
	public MordernTable(String id) {
		this.id = id;
	}
	@Override
	public void putOnTable() {
		
		System.out.println("Put on Mordern Table");
		
	}

	@Override
	public String getID() {
		// TODO Auto-generated method stub
		return id;
	}

}
