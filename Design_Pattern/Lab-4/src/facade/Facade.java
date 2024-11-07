package facade;

public class Facade {
   
    private AccountSubSystem accountSubSystem;
    
    private SecurityPinSubSystem securityPinSubSystem;
    
    private BalanceSubSystem balanceSubSystem;
    
    private LedgerSubSystem ledgerSubSystem;
    
    private NotificationSubSystem notificationSubSystem;

    public Facade(String cardNumber, String securityPin, double initialBalance) 
	 {
		    this.accountSubSystem = new AccountSubSystem(cardNumber);
		    this.securityPinSubSystem = new SecurityPinSubSystem(securityPin);
		    this.balanceSubSystem = new BalanceSubSystem(initialBalance);
		    this.ledgerSubSystem = new LedgerSubSystem();
		    this.notificationSubSystem = new NotificationSubSystem();
    }
    
    
    public boolean Payment(double amount , double initialBalance) {
        
        if (!accountSubSystem.verifyAccount()) {
            System.out.println("Account verification failed.");
            return false;
        }
        if (!securityPinSubSystem.verifyPin()) {
            System.out.println("Security PIN verification failed.");
            return false;
        }
        
        if (!balanceSubSystem.checkBalance(initialBalance)) {
            System.out.println("Insufficient balance.");
            return false;
        }
        
        balanceSubSystem.deductAmount(amount);
        
        ledgerSubSystem.makeEntry(accountSubSystem.getCardNumber(), amount);
        
        notificationSubSystem.sendNotification("Payment of " + amount + " successful.");
        
        System.out.println("Payment processed successfully.");
        
        return true;
    }
	
	
    
    
    
}
