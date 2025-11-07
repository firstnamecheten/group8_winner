package Task02;
import java.util.Scanner;

public class EvenAndGreater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.print("Enter 10 integers: ");

        for(int i=0; i<10; i++){
            num = scanner.nextInt();

            if(num>20 && num%2==0){
                System.out.println(num);
            }
        }
        scanner.close();
    }
}
