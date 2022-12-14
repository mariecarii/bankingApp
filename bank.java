import java.util.Scanner;

public class bank {
    //declare variables
    private String firstName;
    private String lastName;
    private int balance = 0;
    private int lastTransactionAmount;

    //create constructor for first and last name
    public bank() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        this.firstName = scan.nextLine();

        System.out.println("Enter your last name: ");
        this.lastName = scan.nextLine();

    }

    //make deposit
    private void deposit() {
        //ask user how much do they want to deposit
        System.out.println("Enter amount to deposit: ");

        Scanner scan = new Scanner(System.in);
        int depositAmount = scan.nextInt();

        //transaction amount
        lastTransactionAmount = depositAmount;
        //add amount deposited to balance
        balance += depositAmount;

    }
    //make withdrawal
    private void withdrawal() {
        //ask user how much they want to withdraw
        System.out.println("Enter amount to withdraw: ");

        Scanner scan = new Scanner(System.in);
        int withdrawalAmount = scan.nextInt();

        //transaction amount
        lastTransactionAmount = -(withdrawalAmount);
        //substract this amount from balance
        balance -= withdrawalAmount;
    }
    //check balance
    private int balanceCheck() {
        return balance;
    }

    //view previous transactions

    //calculate interest

    //exit application

}
