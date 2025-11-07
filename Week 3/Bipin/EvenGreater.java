import java.util.Scanner;

public class EvenGreater {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 integers:");

        for (int i = 1; i <= 10; i++) {
            int num = input.nextInt();
            if (num % 2 == 0 && num > 20) {
                System.out.println(num);
            }
        }
    }
}
