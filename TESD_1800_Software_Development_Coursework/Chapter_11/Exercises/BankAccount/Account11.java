import java.time.LocalDate;

class Account11 {
    /** Create data fields */
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private LocalDate dateCreated;

    /** Create default account */
    Account11() {    
        dateCreated = LocalDate.now();    
    }

    /** Create account with id and initial balance */
    Account11(int newId, double newBalance) {
        id = newId;
        balance = newBalance;
        dateCreated = LocalDate.now();
    }

    /** Get id */
    public int getId() {
        return id;
    }

    /** Get balance */
    public double getBalance() {
        return balance;
    }

    /** Get annualInterestRate */
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    /** get Date */
    public LocalDate getDateCreated() {
        return dateCreated;
    }

    /** Set Id */
    public void setId(int newId) {
        id = newId;
    }

    /** Set balance */
    public void setBalance(double newBalance) {
        balance = newBalance;
    }

    /** Set Interest rate */
    public void setAnnualInterestRate(double newAnnualInterestRate) {
        annualInterestRate = newAnnualInterestRate;
    }

    /** Get monthly interest rate */
    public double getMonthlyInterestRate() {
        return annualInterestRate / 100 / 12;
    }

    /** Get monthly interest */
    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    /** Withdraw a specified amount from the account */
    public void withdraw(double amount) {
        balance -= amount;
    }

    /** Deposit a specified amount to the account */
    public void deposit(double amount) {
        balance += amount;
    }
 
    @Override
    public String toString() {
        return "Account11\n"
                + "----------\n"
                + "Account ID: " + getId() + "\n"
                + "Balance: " + getBalance() + "\n"
                + "Annual Interest Rate: " + getAnnualInterestRate() + "\n"
                + "Date Created: " + getDateCreated();
    }
}
