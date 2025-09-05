public class BankAccount {
    String accountHolderName;  // Creating instance variable
    static String bankName = "Bank of America";    // Creating static variable with value assigned

    void showAccount(int balance) {         // balance is now a method parameter (creating local variable)
        System.out.println("Bank name: " + bankName);
        System.out.println("Account holder name: " + accountHolderName + " | balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount s1 = new BankAccount();    // Creating object (instance)
        s1.accountHolderName = "John";    // Assigning vlaue in instance variable
        s1.showAccount(10000);

        BankAccount s2 = new BankAccount();    // Creating object (instance)
        s2.accountHolderName = "Bill";    // Assigning vlaue in instance variable
        s2.showAccount(25000);

        BankAccount s3 = new BankAccount();    // Creating object (instance)
        s3.accountHolderName = "Paul";    // Assigning vlaue in instance variable
        s3.showAccount(50000);
    }
    
}
