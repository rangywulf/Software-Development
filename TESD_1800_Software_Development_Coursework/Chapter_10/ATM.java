/*
Author: Jess Stubbs
Date: 08/31/2026

Simulate an ATM machine.
*/

import java.util.Scanner;

public class ATM {
    /** Main Method */
    public static void main(String[] args) {
        // Create a scanner
        Scanner input = new Scanner(System.in);

        // Create an array of 10 Account objects, ids 0-9, each with a starting balance of $100
        Account[] accounts = new Account[10];
        for (int i = 0; i < 10; i++) {
            accounts[i] = new Account(i, 100);
        }

        // Loop forever (the system never stops)
        while (true) { 
            // Prompt for an id
            System.out.print("Enter account ID: ");
            int accountID = input.nextInt();

            // Loop until a valid id is entered:
            while (accountID < 0 || accountID > 9) {
                System.out.print("Invalid id, try again: ");
                accountID = input.nextInt();
            }
            
                // Loop until user chooses to exit:
            while (true) { 
                // Display menu
                System.out.println();
                System.out.println("Main Menu");
                System.out.println("1. View Balance");
                System.out.println("2. Withdraw");
                System.out.println("3. Deposit");
                System.out.println("4. Exit");
                System.out.print("Enter choice: "); // Prompt for choice
                int choice = input.nextInt();

                // if choice is 1: call getBalance() on that account, display result
                if (choice == 1) {
                    System.out.println("Balance: " + accounts[accountID].getBalance());
                }
                
                // if choice is 2: prompt for amount, call withdraw(amount)
                if (choice == 2) {
                    System.out.print("How much would you like to withdraw? ");
                    double withdraw = input.nextDouble();
                    accounts[accountID].withdraw(withdraw);
                }
                
                // if choice is 3: prompt for amount, call deposit(amount)
                if (choice == 3) {
                    System.out.print("How much would you like to deposit? ");
                    double deposit = input.nextDouble();
                    accounts[accountID].deposit(deposit);
                }

                // if choice is 4: exit this loop (go back to the id prompt)
                if (choice == 4) {
                    break;
                }

            }
        }    
            
    }
}
