public class TestAccount {
    /** Main Method */
    public static void main(String[] args) {
        // Create an Account
        Account account = new Account(1122, 20000);

        // Set the interest rate
        account.setAnnualInterestRate(4.5);

        // Withdraw from the account
        account.withdraw(2500);

        // Deposit to the account
        account.deposit(3000);

        // Print the balance, monthly interest, and date created
        System.out.println("Balance: " + account.getBalance());
        System.out.println("Monthly Interest: " + account.getMonthlyInterest());
        System.out.println("Date Created: " + account.getDateCreated());
    }
}
