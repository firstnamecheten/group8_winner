package Task02;

import java.util.Scanner;

public class Pin {
    public static void main(String[] args) {
        final int user_pin = 1234;
        Scanner scanner = new Scanner(System.in);
        int attempts = 0;
        boolean access_granted = false;

        while (attempts<3) {
            System.out.print("Enter your PIN: ");
            int entered_pin = scanner.nextInt();

            if (entered_pin==user_pin) {
                System.out.println("Access Granted!");
                access_granted = true;
                break;
            } else {
                attempts++;
                if (attempts<3) {
                    System.out.println("Incorrect PIN, try again!");
                }
            }
        }
        if (!access_granted) {
            System.out.println("Account locked!");
        }
        scanner.close();
    }
}