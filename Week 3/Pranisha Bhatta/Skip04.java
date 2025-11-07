package Task02;
import java.util.Scanner;

public class Skip04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int user_input = scanner.nextInt();

        for(int i=1; i<=user_input; i++){
            if(i%4==0){
                continue;
            }
            System.out.print(i + " ");
        }
        scanner.close();
    }
}