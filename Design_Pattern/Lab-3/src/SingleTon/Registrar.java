//package SingleTon;
//
//import java.util.HashMap;
//import java.util.Map;
//
////public class Registrar {
////    
////    public static Map<String, Printer> registry = new HashMap<>();
////
////    public static Printer getPrinter(String department) {
////    	
////    	System.out.println(department);
////        if (!registry.containsKey(department)) {
////            System.out.println("Creating new Printer for " + department);  
////
////            Printer instance = Printer.getInstance();
////            registry.put(department, instance);
////        } else {
////            System.out.println("Reusing printer for " + department);  
////        }
////        
////        for (Map.Entry<String, Printer> e : registry.entrySet())
////
////           
////            System.out.println(e.getKey() + " "
////                               + e.getValue());
////
////        return registry.get(department);
////    }
////}
//
//public class Registrar {
//    public static Map<String, Printer> registry = new HashMap<>();
//
//    public static Printer getPrinter(String department) {
//        if (!registry.containsKey(department)) {
//            System.out.println("Creating new Printer for " + department);
//            Printer instance = Printer.getInstance();  // Should return a valid instance
//            registry.put(department, instance);  // Store the instance in the registry
//        } else {
//            System.out.println("Reusing printer for " + department);
//        }
//        return registry.get(department);  // Return the correct instance
//    }
//}
//

package SingleTon;

import java.util.HashMap;
import java.util.Map;

public class Registrar {
    
    // Registry (map) to store Printer instances for each department
    public static Map<String, Printer> registry = new HashMap<>();

    // Method to get or create a Printer for a department
    public static Printer getPrinter(String department) {
        System.out.println("Request for printer from department: " + department);
        
        // Check if the printer already exists for the department
        if (!registry.containsKey(department)) {
            System.out.println("Creating new Printer for " + department);
            
            Printer instance = Printer.getInstance();  // Get the singleton instance of Printer
            registry.put(department, instance);  // Register the printer for the department
        } else {
            System.out.println("Reusing printer for " + department);
        }
        
        // Return the Printer for the department (whether new or existing)
        Printer retrievedPrinter = registry.get(department);
        System.out.println("Retrieved Printer: " + retrievedPrinter);
        
        // Print current registry contents for debugging
        System.out.println("Current registry state:");
        for (Map.Entry<String, Printer> entry : registry.entrySet()) {
            System.out.println("Department: " + entry.getKey() + ", Printer: " + entry.getValue());
        }

        return retrievedPrinter;
    }
}

