import java.util.Scanner;

public class VotingClasswork2 {
    
    public static void main(String[] args) {
    
    java.util.Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length");
    int length = sc.nextInt();
    System.out.println("Enter the breadth");
    int breadth = sc.nextInt();
    int area = length * breadth;
    System.out.println(area);
    sc.close();


}
}