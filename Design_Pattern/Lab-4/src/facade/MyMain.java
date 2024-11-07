package facade;

public class MyMain {

	public static void main(String[] args) {
		
		 String cardNumber = "7885-3333-4444";
	     String securityPin = "1234";
	     double initialBalance = 1000;
  
	     Facade facade = new Facade(cardNumber, securityPin, initialBalance);

	     double paymentAmount = 200;
	     
	     facade.Payment(paymentAmount , initialBalance);

	}

}
