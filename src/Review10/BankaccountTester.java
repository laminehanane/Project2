package Review10;

public class BankaccountTester {
    public static void main(String[] args) {
        Bankaccount b=new Bankaccount(1200,"hanane","12345");
        b.setBalance(4000);
        System.out.println(b.getBalance());
    }
}
