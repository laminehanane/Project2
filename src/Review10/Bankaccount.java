package Review10;

public class Bankaccount {
    private double balance;
    private String username;
    private String Password;

    public Bankaccount(double balance, String username, String password) {
        setPassword(password);
        setUsername(username);
        setBalance(balance);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance < 0) {
            System.out.println("Wrong Balance amount");
        } else {
            this.balance = balance;
        }
    }

    public void setUsername(String username){
        if (username.length()<4){
            System.out.println("Username should be more than 4 charecters");
        }else {
            this.username=username;
        }
    }

    public void setPassword(String password) {
        this.Password = password;
    }
    public void transferFunds(double anounttransf){
        balance=balance-anounttransf;
    }

}