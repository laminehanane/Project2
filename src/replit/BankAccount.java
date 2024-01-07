package replit;

public class BankAccount {
    /*Banking System Task: Design a BankAccount class with subclasses SavingsAccount, CheckingAccount, and FixedDepositAccount.
Common attributes might include accountNumber, balance, and accountHolderName.
Override methods like withdraw and deposit in each subclass to handle specific rules.
Introduce unique methods like applyInterest in SavingsAccount.
Create objects of each type, store them in a list, and perform operations like depositing and withdrawing funds.*/
 private double accountNum;
 private double balance;
 private String accountholderName;

    public BankAccount(double accountNum, double balance, String accountholderName) {
        this.accountNum = accountNum;
        this.balance = balance;
        this.accountholderName = accountholderName;
    }
    void printInfo() {
        System.out.println("information: " + accountholderName + " " + accountNum + " " + balance);
    }
    void withdraw(double amount){
        balance= balance-amount;
        System.out.println("withdraw $"+amount+"new balance="+balance);}

    void deposit(double amount,double balance){
        balance=balance+amount;
        System.out.println("Deposit $"+amount+"new balance="+balance);
    }


}
class SavAccount extends BankAccount {
    double interest;

    public SavAccount(double accountNum, double balance, String accountholderName, double interest) {
        super(accountNum, balance, accountholderName);
        this.interest = interest;
    }

    @Override
    public void printInfo() {
        super.printInfo();
    }

    @Override
    void withdraw(double amount) {
        super.withdraw(amount);
    }



    public void setInterest(double interest, double balance) {
        double totalBalance = interest + balance;
        System.out.println("Total=" + interest + "+" + balance);
    }


    static class CheckAccount extends BankAccount {


        public CheckAccount(double accountNum, double balance, String accountholderName) {
            super(accountNum, balance, accountholderName);
        }


    }

    static class FixAccount extends BankAccount {

        public FixAccount(double accountNum, double balance, String accountholderName) {
            super(accountNum, balance, accountholderName);
        }

        @Override
        void withdraw(double amount) {
            super.withdraw(amount);
        }


    }

    static class BankAccountTester {
        public static void main(String[] args) {
            BankAccount[] arrBAcc = {new CheckAccount(1234, 500.25, "hanane"),
                    new SavAccount(12345, 5000000.09, "yannis",0.5),
                    new FixAccount(123456, 10000000.6778, "souf")};
            for (BankAccount account : arrBAcc) {
                account.printInfo();
                account.withdraw(100.50);
                account.deposit(200,5000);

            }

        }
    }
}