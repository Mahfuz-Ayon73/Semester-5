package SingleTon;
//
//public class Printer {
// 
//	private static Printer instance;
//	
//	private Printer() {}
//	
//	public static Printer getInstance() {
////		if(instance == null) {
////			instance = new Printer();
////		}
//		
//		return new Printer();
//	}
//}

public class Printer {
    // Static variable to hold the single instance of Printer
    private static Printer instance;
    
    // Private constructor to prevent direct instantiation
    private Printer() {}

    // Method to get the single instance of Printer (Singleton)
    public static Printer getInstance() {
        if (instance == null) {
            instance = new Printer();
        }
        return instance;
    }
    
    // Override toString() for easier debugging and output readability
    @Override
    public String toString() {
        return "Printer instance";
    }
}
