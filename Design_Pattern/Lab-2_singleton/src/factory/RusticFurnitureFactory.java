package factory;

public class RusticFurnitureFactory implements FurnitureFactory{

	private static volatile RusticFurnitureFactory instance;
    private int idCounter = 0;

    // Private constructor to prevent instantiation
    private RusticFurnitureFactory() {}

    // Thread-safe Singleton implementation using double-checked locking
    public static RusticFurnitureFactory getInstance() {
        if (instance == null) {
            synchronized (RusticFurnitureFactory.class) {
                if (instance == null) {
                    instance = new RusticFurnitureFactory();
                }
            }
        }
        return instance;
    }

    
	@Override
	public Chair createChair() {
		return new RusticChair(generateId());
	}

	@Override
	public Table createTable() {
		return new RusticTable(generateId());
	}

	@Override
	public Sofa createSofa(){
		return new RusticSofa(generateId());
	}
	
	private synchronized String generateId() {
        return "RUS" + (++idCounter);
    }

}
