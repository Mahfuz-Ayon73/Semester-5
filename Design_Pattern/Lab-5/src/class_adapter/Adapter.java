package class_adapter;

public class Adapter extends LegacyPrinter implements Printer{

	public void printDocument(String text) {
		
        super.printDocument(text); 
        
    }

}
