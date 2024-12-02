package ATM_INTERFACE_TASK_ONE;

public class BankAccount {
	 private double balance;

	    public BankAccount(double initialBalance) {
	        if (initialBalance >= 0) {
	            this.balance = initialBalance;
	        } else {
	            System.out.println("Invalid initial balance. Setting balance to 0.");
	            this.balance = 0;
	        }
	    }

	    public boolean withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            return true;
	        }
	        return false;
	    }

	    public boolean deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            return true;
	        }
	        return false;
	    }

	    public double checkBalance() {
	        return balance;
	    }
}
