package factory;

public class Application {
    private Chair chair;
    private Table table;
    private Sofa sofa;
	public Application(FurnitureFactory factory) {
		chair = factory.createChair();
		table = factory.createTable();
		sofa = factory.createSofa();
	}
	
	public void furnitureFunction() {
		chair.sitOnChair();
		table.putOnTable();
		sofa.sitOnSofa();
	}
    
    
}
