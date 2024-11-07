package factory;

public class MordernFurnitureFactory implements FurnitureFactory{

	@Override
	public Chair createChair() {
		return new MordernChair();
	}

	@Override
	public Table createTable() {
		return new MordernTable();
	}

	@Override
	public Sofa createSofa() {
		return new MordernSofa();
	}

}
