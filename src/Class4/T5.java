package Class4;

import java.util.Scanner;

public class T5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("how many years you worked :");
        double yearsnum = scan.nextDouble();
        if (yearsnum < 5) {
            System.out.println(" you are not eligible for bonus .");
        } else if (yearsnum >= 5) {
            System.out.println(" you are eligible for bonus ");
            Scanner scan1 = new Scanner(System.in);
            System.out.println(" please enter your salary :");
            double salary = scan1.nextDouble();
            if (salary > 50000) {
                System.out.println(" you are eligible for 5000 bonus .");
            } else {
                System.out.println(" you are eligible for 3000 bonus .");
            }

        }
    }
}
