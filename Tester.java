import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the initial balance :(e.g. 1000)");
        double iniBalance = scanner.nextDouble();

        scanner.nextLine(); 

        System.out.print("Enter the account holder's name: ");
        String ownerName = scanner.nextLine();

        BankAccount myAccount = new BankAccount(iniBalance, ownerName);

        myAccount.deposit(505.22);

        System.out.println("Balance after depositing 505.22: " + myAccount.getBalance());

        myAccount.withdraw(100);

        System.out.println("The account balance is, $" + myAccount.getBalance());

        scanner.close();
    }
}