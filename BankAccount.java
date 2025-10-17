public class BankAccount {

    private double balance; // money in the account
    private String name;    // account owner's name


    public BankAccount(double iniBalance, String ownerName) {
        balance = iniBalance;
        name = ownerName;
    }

    public void deposit(double amount) { balance = balance + amount; }

    public void withdraw(double amount) { balance = balance - amount; }


    public double getBalance() { return balance; }
    
    public String getName() { return name; }
}