package bankingManagementSystem;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class bankOperations {

	private List<customer> CS = new ArrayList<>();
	private Random random = new Random();
	//method for creating an account
	public String createAccount(String name, String accountType, double initialDeposit) {
		String accountNumber = "AC" + random.nextInt(100000);
		  customer newCustomer = new customer(name, accountNumber, accountType, initialDeposit);
	        CS.add(newCustomer);
		return accountNumber;
	}
	//method to deposit
	public boolean deposit(String accountNumber, double amount) {
		for(customer r:CS) {
		      if (r.getAccountNumber().equals(accountNumber)) {
		    	  r.deposit(amount);
	                return true;
		      }
		}
		 return false; 
	}
	//method to withdraw
	public boolean withdraw(String accountNumber, double amount) {
		for(customer r:CS) {
		      if (r.getAccountNumber().equals(accountNumber)) {
		    	  r.withdraw(amount);
	                return true;
		      }
		}
		 return false; 
	}
	//method to view balance
	public double viewBalance(String accountNumber) {
		for(customer r:CS) {
		      if (r.getAccountNumber().equals(accountNumber)) {
		    	 
	                return r.getBalance();
		      }
		}
		 return -1; 
	}
	//method to displayingAccount 
	 public void displayAllAccounts() {
	        if (CS.isEmpty()) {
	            System.out.println("No accounts found.");
	            return;
	        }
	        for (customer r : CS) {
	            System.out.println(r);
	        }
	    }
	}
