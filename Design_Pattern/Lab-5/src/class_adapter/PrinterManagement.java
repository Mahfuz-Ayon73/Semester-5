package class_adapter;

import java.util.ArrayList;
import java.util.List;

public class PrinterManagement {
     
	 private List<Printer> printers = new ArrayList<>();

	    public PrinterManagement() {
	        printers.add(new ModernPrinter()); 
	        printers.add(new Adapter()); 
	    }

	    public void print(String content) {
	        for (Printer printer : printers) {
	            printer.printDocument(content);
	        }
	    }
    
}
