package Day4;

public class BankAccount {
    private double balance;
    public BankAccount(double initialbalance){
        if (initialbalance < 0){
            System.out.println("Invalid Balance cant be negative" );
        }
        balance = initialbalance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
        }
    }
    //get
    public double getBalance() {
        System.out.println("Balance is: " + balance);
        return balance;
    }
}