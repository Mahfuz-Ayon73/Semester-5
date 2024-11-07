package facade;

public class AccountSubSystem {
	private String cardNumber;

    public AccountSubSystem(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public boolean verifyAccount() {
       
        System.out.println("Verifying account for card number: " + cardNumber);
        return true;
    }
    
    public String getCardNumber() {
        return cardNumber;
    }
    
    
}
