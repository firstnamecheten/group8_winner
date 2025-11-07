import java.util.Scanner;

public class AtmPinCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int correctPin = 1234;
        int attempts = 3;

        for (int i = 1; i <= attempts; i++) {
            System.out.print("Enter your PIN: ");
            int enteredPin = input.nextInt();

            if (enteredPin == correctPin) {
                System.out.println("Access Granted");
                return;
            } else {
                System.out.println("Incorrect PIN, try again");
            }
        }

        System.out.println("Account locked");
    }
}
