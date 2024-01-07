package Class4;

import java.util.Scanner;
/*
You are a loan specialist and you need to ask
user what is the amount of loan is needed.
If loan is less or equal to 200,000 then you would
lend the money otherwise you would reject the client.
 */

public class T1 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println(" How much the loan you asking for: ");
        double loan=scan.nextDouble();
        if (loan<=200000)             {
            System.out.println("you are approved");

        }else {
            System.out.println("you are denied.");
        }




    }
}
