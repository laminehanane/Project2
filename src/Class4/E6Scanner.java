package Class4;

import java.util.Scanner;

public class E6Scanner {
    public static void main(String[] args) {
        Scanner fetchweight= new Scanner(System.in);
        System.out.println("Please enter your weight in lbs: ");
        double weight=fetchweight.nextDouble();
        System.out.println("you have "+weight+" weight");
    }
}
