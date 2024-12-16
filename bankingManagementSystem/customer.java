package bankingManagementSystem;

public class customer {
	private String name;
	private String accountNumber;
	private String accountType;
	private double balance;

	public customer(String name, String accountNumber, String accountType, double balance) {
		super();
		this.name = name;
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.balance = balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return "customer [name=" + name + ", accountNumber=" + accountNumber + ", accountType=" + accountType
				+ ", balance=" + balance + "]";
	}

	public void deposit(double amount) {
		balance = balance + amount;
	}

	public boolean withdraw(double amount) {
		if (amount > balance) {
			return false;
		}
		balance -= amount;
		return true;
	}

}
