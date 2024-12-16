package bankingManagementSystem;

import java.util.Scanner;

public class BankMain_App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bankOperations bo = new bankOperations();
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("----------Banking Management System----------");
			System.out.println("1.Create Account");
			System.out.println("2.Deposit Money");
			System.out.println("3.Withdraw Money");
			System.out.println("4.View Balance");
			System.out.println("5.Displaying Accounts");
			System.out.println("6.Exit");
			System.out.println("----------------------------------------------");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter Name: ");
				String name = sc.next();
				System.out.println("Enter Account Type (current/savings): ");
				String accountType = sc.next();
				System.out.print("Enter Initial Deposit: ");
				double initialDeposit = sc.nextDouble();
				String accountNumber = bo.createAccount(name, accountType, initialDeposit);
				System.out.println("Account created successfully! Your Account Number is: " + accountNumber);
				break;

			case 2:
               System.out.println("enter Amount Number");
               String depositAccount = sc.next();
               System.out.println("Enter Amount to Deposit: ");
               double depositAmount = sc.nextDouble();
               if (bo.deposit(depositAccount, depositAmount)) {
                   System.out.println("Amount deposited successfully!");
               } else {
                   System.out.println("Account not found!");
               }
               break;
			case 3: // Withdraw Money
                System.out.print("Enter Account Number: ");
                String withdrawAccount = sc.next();
                System.out.print("Enter Amount to Withdraw: ");
                double withdrawAmount = sc.nextDouble();
                if (bo.withdraw(withdrawAccount, withdrawAmount)) {
                    System.out.println("Amount withdrawn successfully!");
                } else {
                    System.out.println("Insufficient funds or account not found!");
                }
                break;

            case 4: // View Balance
                System.out.print("Enter Account Number: ");
                String balanceAccount = sc.next();
                double balance = bo.viewBalance(balanceAccount);
                if (balance != -1) {
                    System.out.println("Current Balance: " + balance);
                } else {
                    System.out.println("Account not found!");
                }
                break;

            case 5: // Display All Accounts
                bo.displayAllAccounts();
                break;

            case 6: // Exit
                System.out.println("Thank you for using the Banking Management System. Goodbye!");
                break;

            default:
                System.out.println("Invalid choice! Please try again.");
        
               
               
			}
		} while (choice != 6);
		 sc.close();
	}

}
