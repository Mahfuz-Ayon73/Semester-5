public class MyMain {

    public static void main(String[] args) {
        
        FurnitureFactory factory = null;
        
        String furnitureType = "Modern";  // Use furniture type as needed
        
        if(furnitureType.equals("Modern")) {
            factory = ModernFurnitureFactory.getInstance();  // Singleton instance
        }
        else if(furnitureType.equals("Victorian")) {
            factory = VictorianFurnitureFactory.getInstance();  // Singleton instance
        }
        else if(furnitureType.equals("Rustic")) {
            factory = RusticFurnitureFactory.getInstance();  // Singleton instance
        }

        if(factory != null) {
            // Create furniture products with unique IDs
            Chair chair = factory.createChair();
            Table table = factory.createTable();
            Sofa sofa = factory.createSofa();

            // Display product IDs
            System.out.println("Chair ID: " + chair.getId());
            System.out.println("Table ID: " + table.getId());
            System.out.println("Sofa ID: " + sofa.getId());
        } else {
            System.out.println("Unknown furniture type.");
        }
    }
}
