package Object_adapter;

public class ModernPrinter implements Printer{

	@Override
	public void printDocument(String document) {
		
		System.out.println("Document printing from modern printer " + document);
		
	}

}
