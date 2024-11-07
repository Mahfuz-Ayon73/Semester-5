package factory;

public class MordernFurnitureFactory implements FurnitureFactory{

	private static volatile MordernFurnitureFactory instance;
    private int idCounter = 0;

    // Private constructor to prevent instantiation
    private MordernFurnitureFactory() {}

    // Thread-safe Singleton implementation using double-checked locking
    public static MordernFurnitureFactory getInstance() {
        if (instance == null) {
            synchronized (RusticFurnitureFactory.class) {
                if (instance == null) {
                    instance = new MordernFurnitureFactory();
                }
            }
        }
        return instance;
    }
    
    

	@Override
	public Chair createChair() {
		return new MordernChair(generateId());
	}

	@Override
	public Table createTable() {
		return new MordernTable(generateId());
	}

	@Override
	public Sofa createSofa() {
		return new MordernSofa(generateId());
	}
	
	private synchronized String generateId() {
        return "MOR" + (++idCounter);
    }


}
