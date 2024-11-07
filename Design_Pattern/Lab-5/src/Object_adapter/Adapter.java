package Object_adapter;

public class Adapter implements Printer{
	
	private LegacyPrinter legacyPrinter;
	
	@Override
	public void printDocument(String document) {
		
		legacyPrinter.printDocument(document);
	}

	public Adapter(LegacyPrinter legacyPrinter) {
	
		this.legacyPrinter = legacyPrinter;
	}

	

}
