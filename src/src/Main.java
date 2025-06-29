import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        AtmOperationInterface op = new AtmOperationImpl();
        int atmnumber = 12345;
        int atmpin = 123;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Atm machine!");
        System.out.print("Enter atm number: ");
        int atmnum = input.nextInt();
        System.out.print("Enter the pin number:");
        int pin = input.nextInt();
        if ((atmnumber == atmnum) && (atmpin == pin)) {
            while (true) {
                System.out.println("1. View Availiable Balance\n2. Withdraw Amount\n3. Deposit Amount\n4. View ministatement\n5. Exit");
                System.out.println(" ");
                System.out.println("Enter your choice: ");
                int choice = input.nextInt();
                if (choice == 1) {
                    op.viewBalance();


                } else if (choice == 2) {
                    System.out.println("Enter amount to withdraw: ");
                    double withdrawAmount = input.nextDouble();
                    op.withdrawAmount(withdrawAmount);

                } else if (choice == 3) {
                    System.out.println("Enter Amount to deposit: ");
                    double deposit = input.nextInt();
                    op.depositAmount(deposit);

                } else if (choice == 4) {
                    op.viewMinistatement();

                } else if (choice == 5) {
                    System.out.println("Collect your Atm card!\n Thank you!");
                    System.exit(0);
                } else {
                    System.out.println("Please enter a valid choice");
                }
            }

        } else {
            System.out.println("Invalid atm number or pin!");
        }


    }
}