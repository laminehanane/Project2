package Class22;

public class BankAccount {
    private double balance;
    private String username;
    private String password;

    public BankAccount(double balance, String username, String password) {
        this.balance = balance;
        this.username = username;
        this.password = password;
    }

    void login() {
        System.out.println("login to the bank ");
    }
    void setPassword() {
        System.out.println("set password");
    }
    void transferFunds(){
        System.out.println("resseting password");
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
