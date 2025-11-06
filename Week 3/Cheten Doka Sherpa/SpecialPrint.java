// Write a Java program using a for loop that prints numbers from 1 to 30, but:
// 1. Prints “skip” instead of 15,
// 2. Doubles any number divisible by 4 before printing,
// 3. And prints “done” at the end.

public class SpecialPrint {
    public static void main(String[] args) {
        for (int i = 1; i <= 30; i++) {
            if (i == 15) {
                System.out.println("skip");
            } else if (i % 4 == 0) {
                System.out.println(i * 2);
            } else {
                System.out.println(i);
            }
        }
        System.out.println("done");
    }
}