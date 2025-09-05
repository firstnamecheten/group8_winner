public class Student {
    String name;   // instance variable
    static String schoolName = "Standford School";

    public static void main(String[] args) {
        Student s1 = new Student();   
        s1.name = "Cheten Musk";
        System.out.println("Hello " + s1.name);
       
        Student s2 = new Student();   
        s2.name = "Judy Hops";
        System.out.println("Hello " + s2.name);

        Student s3 = new Student();   
        s3.name = "Tom Trump";
        System.out.println("Hello " + s3.name);

        System.out.println("They are all from " + Student.schoolName);
    } 
}

