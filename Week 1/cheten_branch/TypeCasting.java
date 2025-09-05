public class TypeCasting {

    public static void main(String[] args) {
        int a = 7;
        int b = 9;
        System.out.println(a++);    // Output 7 value = 8
        System.out.println(b++);    // Output 9 value = 10
        System.out.println(a + ++b);   // Output (a8 + b11 = 19)
        System.out.println(++a + b-- + ++a + a + b--);    
        // 9 + 11 + 10 + 10 + 10 = 50 
        // a=10, b=9
        System.out.println(++a + ++b + ++a + a);
        // 11 + 10 + 12 + 12 = 45
        // a=12, b=10
        System.out.println(a);
        System.out.println(b);
    }
}
