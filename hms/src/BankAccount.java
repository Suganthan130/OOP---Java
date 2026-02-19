public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance; // (ii)

    // (iii) -> Constructor
    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance; // (iv)
    }

    // (v) -> Getter
    public double getBalance() {
        return balance; // (vi)
    }

    public void setBalance(double newBalance) {
        if (newBalance >= 0) {
            this.balance = newBalance; // (vii)
        } else {
            System.out.println("Invalid balance amount.");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount; // (viii)
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // (ix) -> withdraw
    public void withdraw(double amount) {
        // (x) -> amount
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
        } else {
            System.out.println("Invalid withdrawal.");
        }
    }
}
