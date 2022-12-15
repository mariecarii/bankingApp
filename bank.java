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

        menu();

    }

        //make deposit
        private void deposit () {
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
        private void withdraw () {
            //ask user how much they want to withdraw
            System.out.println("Enter amount to withdraw: ");

            Scanner scan = new Scanner(System.in);
            int withdrawalAmount = scan.nextInt();

            //transaction amount
            lastTransactionAmount = withdrawalAmount;
            //subtract this amount from balance
            balance -= withdrawalAmount;

        }
        //check balance
        private void balanceCheck () {
            System.out.println("BALANCE: $" + balance);
        }

        //view previous transactions
        private void viewPreviousTransaction () {
            if (lastTransactionAmount > 0) {
                System.out.println("LAST TRANSACTION: $" + lastTransactionAmount + " was deposited.");
            } else if (lastTransactionAmount < 0) {
                System.out.println("LAST TRANSACTION: $" + lastTransactionAmount + " was withdrawn.");

            } else if (lastTransactionAmount == 0) {
                System.out.println("No previous transaction.");
            } else {
                System.out.println("ERROR");
            }
        }

        //calculate interest
        private void calculateInterest() {
            System.out.println("Your investment rate is: 8% ");

            System.out.println("How much of your balance (" + balance + ") would you like to invest?");
            Scanner scan = new Scanner(System.in);
            int amountToInvest = scan.nextInt();

            System.out.println("For how many years?");
            Scanner scan2 = new Scanner(System.in);
            int years = scan2.nextInt();

            double amountEarned = (amountToInvest * .08 * years);

            System.out.println("You would earn: $" + amountEarned);
        }

        //menu
        public void menu() {
            System.out.println("Welcome " + firstName + " " + lastName + ". Enter the letter that corresponds with what you'd like to do.\n 1. Make a Deposit\n 2. Withdraw\n 3. View Previous Transactions\n 4. Calculate Interest\n 5. View Balance\n 6. Exit");

            Scanner scan = new Scanner(System.in);
            int choice = scan.nextInt();

            if(choice == 1) {
                deposit();
                System.out.println();
                menu();
            }
            else if (choice == 2) {
                withdraw();
                System.out.println();
                menu();
            }
            else if (choice == 3) {
                viewPreviousTransaction();
                System.out.println();
                menu();
            }
            else if (choice == 4) {
                calculateInterest();
                System.out.println();
                menu();
            }else if (choice == 5) {
                balanceCheck();
                System.out.println();
                menu();
            }else if (choice == 6) {

            }else {
                System.out.println("ERROR");
            }

        }

    }
