public class Variable {
    String name;   // Instance variable 
    int age;
    static int data = 3;   // Static variable with assigned value

    void displayName() {
        String vote = "Voted";
        System.out.println("Student Name: " +name +" | Age: " +age + " | Vote: "+vote); 
    }

    public static void main(String[] args) {
        Variable s1 = new Variable();   // Creating object (instance)
        s1.name = "Cheten";    // Assigning value to instance variable 
        s1.age = 21;
        s1.displayName();
        
        Variable s2 = new Variable();   // Creating second object (instance)
        s2.name = "Peter";   // Assigning value to instance variable
        s2.age = 35;
        s2.displayName();

        Variable s3 = new Variable();    // Creating 3rd object (instance)
        s3.name = "John";
        s3.age = 59;
        s3.displayName();
        
        System.out.println("Total number of people that voted: "+Variable.data);


    }
}
