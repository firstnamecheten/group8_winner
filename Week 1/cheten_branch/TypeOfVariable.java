public class TypeOfVariable {
    String num1;
    static int data = 30;

    void display() {
        String name = "hh";
        int age = 13;
        System.out.println("name" +num1 +"age" +age);
    }
    public static void main(String args[]) { 
       TypeOfVariable typeOfVariable = new TypeOfVariable();
        typeOfVariable.num1 = "Peter";

        TypeOfVariable typeOfVariable2 = new TypeOfVariable();
        typeOfVariable2.num1 = "John";

        typeOfVariable.display();
        
        System.out.println("Value of static variable data: " + TypeOfVariable.data);

    }
    
}
