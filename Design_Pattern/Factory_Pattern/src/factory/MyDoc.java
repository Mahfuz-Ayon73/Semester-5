package factory;

public class MyDoc {

	public static void main(String[] args) {
		
		DocumentFactory obj = new DocumentFactory("pdf");
		
		Document doc = obj.getInstance();
		
		doc.createDocument();
		

	}

}
