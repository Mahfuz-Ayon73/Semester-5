//package Interfaces;
//
//import SingleTon.Printer;
//import SingleTon.Registrar;
//
//public class PrinterFactory {
//	
//    public String department;
//
//	public PrinterFactory(String department) {
//		
//		this.department = department;
//	}
//	
//	Printer printer = Registrar.getPrinter(department);
//	
//	
//     
//     
//}

package Interfaces;

import SingleTon.Printer;
import SingleTon.Registrar;

public class PrinterFactory {
    String department;

    // Constructor to initialize the department
    public PrinterFactory(String department) {
        this.department = department;
        getPrinterForDepartment();  // Get the printer for this department
    }

    // Method to retrieve the printer using the Registrar
    private void getPrinterForDepartment() {
        Printer printer = Registrar.getPrinter(department);
        System.out.println("Factory retrieved: " + printer + " for department: " + department);
    }
}

