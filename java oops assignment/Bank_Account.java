package basic;
class bankAccount {
	 int accNum;
	 String accHolderName;
	 double balance;
bankAccount(int accNum, String accHolderName, double balance) {
		this.accNum = accNum;
		this.accHolderName = accHolderName;
		this.balance = balance;
	}
void deposit(double amt) {
		balance += amt;
		System.out.println("Successfully deposited $:" + amt);
		System.out.println("New Balance: " + balance);
	}
void withdrawal(double amt) {
		balance -= amt;
		System.out.println("Successfully withdraw $:" + amt);
	}
void checkBalance() {
		System.out.println("Current balance for " + accHolderName + "$:" + balance);
	}
}
class SavingsAccount extends bankAccount {
    double interestRate;
    public SavingsAccount(int accNum, String accHolderName, double balance, double interestRate) {
        super(accNum, accHolderName, balance);  
        this.interestRate = interestRate;
    }
  public void applyInterest() {
        double interest = balance * (interestRate / 100);
        balance += interest;
        System.out.println("Interest of $" + interest + " applied. New Balance: $" + balance);
    }
}
public class Bank_Account {
	public static void main(String[] args) {

		bankAccount b = new bankAccount(121, "Gayu", 20000);
		SavingsAccount sa =new SavingsAccount (234, "Gayu", 5000.00, 3.5);
		b.deposit(20000.00);
		b.withdrawal(1000);
        b.checkBalance();
        sa.applyInterest();
        sa.checkBalance();
		
	}
}
