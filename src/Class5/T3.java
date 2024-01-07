package Class5;

import java.util.Scanner;

public class T3 {
    public static void main(String[] args) {
        /*
Write a program that will ask user to  inputs
the current time (use 24 hour format).
Based on the given time define:
if hour is between 1-11 --> Morning
if hour between 12-15 --> Afternoon
if hour between 16-20 --> Evening
if hour between 21-24 --> Night
If anything else print invalid

 */
        Scanner scan=new Scanner(System.in);
        System.out.println(" Please enter the Time :");
        double Time=scan.nextDouble();
        if (Time>=1 && Time<=11){
            System.out.println(" Its Morning time .");
        } else if (Time>=12 && Time<=15) {
            System.out.println("Its Afternoon");

        } else if (Time>=16 && Time<=20) {
            System.out.println(" Its Evening");

        }else if (Time>=21 && Time<=24){
            System.out.println(" Its Night .");
        }else {
            System.out.println(" Invalid ");
        }
    }
}
