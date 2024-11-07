package facade;

public class BalanceSubSystem {
	 private double balance;

	    public BalanceSubSystem(double initialBalance) {
	        this.balance = initialBalance;
	    }

	    public boolean checkBalance(double amount) {
	       
	        System.out.println("Checking balance for amount: " + amount);
	        return balance >= amount;
	    }

	    public void deductAmount(double amount) {
	       
	        balance -= amount;
	        System.out.println("Deducting amount: " + amount);
	    }
}
