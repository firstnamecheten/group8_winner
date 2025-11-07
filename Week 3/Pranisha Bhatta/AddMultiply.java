package Task02;

public class AddMultiply {
    public static void main(String[] args) {
        int even_sum = 0;
        int odd_multiply = 1;

        for (int i=1; i<=10; i++) {
            if (i%2 == 0) {
                even_sum += i; 
            } else {
                odd_multiply *= i; 
            }
        }
        System.out.println("Sum of even numbers between 1 and 10: " + even_sum);
        System.out.println("Product of odd numbers between 1 and 10: " + odd_multiply);
    }    
}
