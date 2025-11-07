package Task02;
import java.util.Scanner;

public class LoopDivide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pick 1 if you want to print number from 1 to 50 divisible by 3.");
        System.out.println("Pick 2 if you want to print number from 1 to 50 divisible by 5.");
        System.out.print("Pick 1 or 2: ");

        int user_input = scanner.nextInt();

        for(int i=1; i<=50; i++){
        
            if(user_input==1 && i%3==0 && i%5!=0){
                System.out.print(i + " ");

            }else if(user_input==2 && i%5==0 && i%3!=0){
                System.out.print(i + " ");
            }
        }
        scanner.close(); 
    }   
}