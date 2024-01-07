package Class22;

public class BankAccountTester {
    public static void main(String[] args) {
        BankAccount b=new BankAccount(1000,"hanane","yannis2023");
        System.out.println(b.getBalance());
        b.setBalance(2500);
        System.out.println(b.getBalance());
    }
}
