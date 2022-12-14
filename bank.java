import java.util.Scanner;

public class bank {
    //declare variables
    private String firstName;
    private String lastName;
    private int balance;
    private int lastTransactionAmount;

    //create constructor for first and last name
    public bank() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        this.firstName = scan.nextLine();

        System.out.println("Enter your last name: ");
        this.lastName = scan.nextLine();



    }
    //check balance

    //make deposit

    //make withdrawal

    //view previous transactions

    //calculate interest

    //exit application

}
