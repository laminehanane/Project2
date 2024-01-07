package Class5;

import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {
        /*Write a program that will prompt the user for
Day number and print whether it is a weekend or weekday.
If any day from 1-5 → output “It is a weekday”, anyday
from 6-7 → output “It is a weekend”, any other day → output
“Invalid day”*/
        Scanner sc=new Scanner(System.in);
        System.out.println(" Please enter a number from 1 to 7 :");
        int daynumber=sc.nextInt();
        if (daynumber>=1 && daynumber<=5){
        System.out.println("Weekday");
    } else if (daynumber>=6 || daynumber<=7) {
            System.out.println(" Weekend");
        }else {
            System.out.println("Invalid day");
        }

        }
    }
