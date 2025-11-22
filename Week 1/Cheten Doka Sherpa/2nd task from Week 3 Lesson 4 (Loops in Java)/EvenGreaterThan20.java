// Write a Java program that asks for 10 integers and prints only those that are even and greater than 20 using if and for loops.

import java.util.Scanner;

public class EvenGreaterThan20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[10];

        System.out.println("Enter 10 integers:");

        for (int i = 0; i < 10; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Even numbers greater than 20: ");
        for (int i = 0; i < 10; i++) {
            if (nums[i] % 2 == 0 && nums[i] > 20) {
                System.out.print(nums[i] + " ");
            }
        }
    }
}