package singleTon;

public class SingleTon {
   
	private static SingleTon instance;
	
	public String value;
	
	private SingleTon(String value) {
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) {
			System.out.println(e.getStackTrace());
		}
		
		this.value = value;
	}
	
	public static SingleTon getInstance(String value) {
		if(instance == null) {
			return new SingleTon(value);
		}
		return instance;
	}
}
