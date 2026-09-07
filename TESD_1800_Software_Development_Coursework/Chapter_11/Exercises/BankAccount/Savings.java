public class Savings extends Account11 {
    public Savings() {
    }

    public Savings(int newId, double newBalance) {
        super(newId, newBalance);
    }

    @Override 
    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal denied: insufficient funds.");
        }
    }

    @Override 
    public String toString() {
        return "Savings\n" 
        + "----------\n"
        + "Account ID: " + getId() + "\n" 
        + "Balance: " + getBalance();
    }
}
