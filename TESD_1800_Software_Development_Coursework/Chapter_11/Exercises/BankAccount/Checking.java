
public class Checking extends Account11 {
    double overdraftLimit;

    public Checking() {
    }

    public Checking(int id, double balance, double overdraftLimit) {
        super(id, balance);
        this.overdraftLimit = overdraftLimit;
    }

    // return overdraftLimit
    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override 
    public void withdraw(double amount) {
        if (amount <= getBalance() + overdraftLimit) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal denied: insufficient funds.");
        }
    }

    @Override 
    public String toString() {
        return "Checking\n"
        + "----------\n"
        + "Account ID: " + getId() + "\n"
        + "Balance: " + getBalance() + "\n"
        + "Overdraft Limit: " + overdraftLimit;
    }
}
