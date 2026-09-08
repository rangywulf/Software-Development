/**
 * Author: Jess
 * Date: 9/8/2026 
 * Description: Test checking and savings account rules.
 */

public class BankAccountTest {
    public static void main(String[] args) {

        // Create Account
        Account11 account = new Account11(2, 0);

        // Set annual insterest rate
        account.setAnnualInterestRate(5);

        // Create Checking Account
        Checking checking = new Checking(2, 5, 100);

        // Create Savings account
        Savings savings = new Savings(2, 500);

        // Create withdrawal amount for checking
        checking.withdraw(50);
        System.out.println(checking);
        System.out.println();

        // test rule for checking overdraft
        checking.withdraw(200);
        System.out.println(checking);
        System.out.println();

        // Create withdrawal amount for savings
        savings.withdraw(100);
        System.out.println(savings);
        System.out.println();

        // test rule that savings cannot be overdrawn:
        savings.withdraw(500);
        System.out.println(savings);
        System.out.println();

        // print account information
        System.out.println("-----------");
        System.out.println(account);
        System.out.println("------------");
    }
}
