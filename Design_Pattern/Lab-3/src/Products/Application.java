package Products;

import Interfaces.PrinterFactory;

public class Application {
    public static void main(String[] args) {
        
        
        String department1 = "Accounts"; 
        PrinterFactory printerFactory1 = new PrinterFactory(department1);

       
        String department2 = "HR"; 
        PrinterFactory printerFactory2 = new PrinterFactory(department2);

        
        PrinterFactory printerFactory3 = new PrinterFactory(department1);
    }
}
