package facade;

public class SecurityPinSubSystem {
	private String securityPin;

    public SecurityPinSubSystem(String securityPin) {
        this.securityPin = securityPin;
    }

    public boolean verifyPin() {
      
        System.out.println("Verifying security PIN.");
        return true;
    }
}
