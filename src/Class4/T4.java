package Class4;

import java.util.Scanner;

public class T4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Dou have Credit card:");
        String CC= scan.nextLine();
        if (CC.equals("no")){
            System.out.println("Let me offer you one .");
        } else if (CC.equals("yes")) {
            System.out.println(" whats your balance:");
            double balance=scan.nextDouble();
            if (balance<1000){
                System.out.println("you can spend more.");
            }else {
                System.out.println("you have to pay it off.");
            }
        }
    }
}
