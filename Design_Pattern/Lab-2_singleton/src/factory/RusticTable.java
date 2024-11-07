package factory;

public class RusticTable implements Table{

	String id;
	

	public RusticTable(String id) {
		this.id = id;
	}

	@Override
	public void putOnTable() {
		
		System.out.println("Put on Rustic Table");
	}

	@Override
	public String getID() {
		
		return id;
	}

}
