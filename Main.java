package ATM_INTERFACE_TASK_ONE;

public class Main {
	public static void main(String[] args) {
        // Create a BankAccount object with an initial balance
        BankAccount account = new BankAccount(1000.0); // Initial balance: 1000

        // Create an ATM object and link it to the BankAccount
        ATM atm = new ATM(account);

        // Display the ATM menu
        atm.displayMenu();
    }
}
