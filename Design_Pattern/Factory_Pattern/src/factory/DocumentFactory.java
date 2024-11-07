package factory;

public class DocumentFactory {
	
	String fileType;
	
	public DocumentFactory(String fileType) {
		
		this.fileType = fileType;
	}
	
	Document getInstance() {
		if(fileType.equals("csv"))
			return new csv();
		else if(fileType.equals("pdf"))
			return new pdf();
		else
			return null;
	}
	
	
}
