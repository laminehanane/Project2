package replit;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you need a loan?");
        boolean loan = sc.nextBoolean();

        if (loan) {
            System.out.println("What is your credit score?");
            int score = sc.nextInt();

            if (score < 600) {
                System.out.println("Not eligible");
            } else if (score >= 600 && score <= 700) {
                System.out.println("Maybe eligible");
            } else if (score > 700 && score <= 800) {
                System.out.println("Eligible");
            } else if (score > 800) {
                System.out.println("Definitely eligible");
            }
        } else {
            System.out.println("Loan not needed");
        }
    }

}


















