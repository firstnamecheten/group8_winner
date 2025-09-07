/* public class Voting {
    public static void main(String[] args){
        int age = 67;

        String result = (age > 18) ?"you are ready to vote" : "you are not";
        system.out.println(result);
    }
    
}
 */

/* import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System. in);
        System.out.println("enter the length")
        int length = sc. nextInt();
        System.out.println("enter the breadth");
        int breadth = sc.nextInt();
        int area = length * breadth;
        System.out.println(area);
        sc. close();

        String result = (area < 38) ? “You need bigger value ” : "You need smaller value " ;
        Systen. out.println(result);
    }
}    */ 

import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length=");
        int length= sc.nextInt();
        System.out.println("Enter breadth=");
        int breadth = sc.nextInt();
        int area= length*breadth;
        System.out.println(area);
        sc.close();
        String result= (area <38 )? "You need bigger value":"You need smaller value";
        System.out.println(result);
    }
}