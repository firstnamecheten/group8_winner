// Question 7. Write a Java program that simulates an ATM PIN verification system.
// The program should have a correct PIN stored (for example, 1234) and allow the user up to three attempts to enter the correct PIN.
// If the user enters the correct PIN, print "Access Granted" and stop the program.
// If the user enters the wrong PIN, print "Incorrect PIN, try again".
// After three incorrect attempts, print "Account locked".

import java.util.Scanner;

public class ATMVerification {
    public static void main(String[] args) {
        int correctPin = 1234;
        Scanner sc = new Scanner(System.in);
        int attempts = 0;

        while (attempts < 3) {
            System.out.print("Enter PIN: ");
            int enteredPin = sc.nextInt();

            if (enteredPin == correctPin) {
                System.out.println("Access Granted");
                return;
            } else {
                System.out.println("Incorrect PIN, try again");
                attempts++;
            }
        }

        System.out.println("Account locked");
    }
}