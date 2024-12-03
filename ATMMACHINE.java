import java.util.Scanner;   /*CODE WRITEN BY MANOJ MALI */
class ATM {
    private BankAccount acc;

    public ATM(BankAccount acc) {
        this.acc = acc;
    }

    public void showMenu() {
        Scanner scann = new Scanner(System.in);
        int choice;
        System.out.println("!!! WELCOME TO USER !!!");
                     /*USING DO LOOP */
        do { 
            System.out.println("ATM MACHINE MENU:");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Please choose an option: ");
            choice = scann.nextInt();
                                 /*USING SWITCH STATEMENT */
            switch (choice) {
                case 1:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scann.nextDouble();
                    withdraw(withdrawAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scann.nextDouble();
                    deposit(depositAmount);
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM Machine!");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            } /*SWITCH END */
        } /* DO LOOP END*/while (choice != 4);

        scann.close();
    }

    public void withdraw(double amount) {
        if (acc.getBalance() >= amount) {
            acc.setBalance(acc.getBalance() - amount);
            System.out.println("Withdrawal successful! New balance: " + acc.getBalance());
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            acc.setBalance(acc.getBalance() + amount);
            System.out.println("Deposit successful! New balance: " + acc.getBalance());
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void checkBalance() {
        System.out.println("Current balance: " + acc.getBalance());
    }
}
/*ATM CLASS END */
/*USER BANK ACCOUNT CLASS START */
class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
/*USER BANK ACCOUNT END */
/*MAIN CLASS  START*/
public class ATMMACHINE{
    public static void main(String[] args) {
        // Create a bank account with an initial balance of $1000
        BankAccount userAccount = new BankAccount(1000);

        // Create the ATM and link it to the user account
        ATM atm = new ATM(userAccount);

        // Show the ATM menu and allow the user to interact
        atm.showMenu();
    }
} /*MAIN CLASS END */
/* !!! CODE IS FINISHED !!! */