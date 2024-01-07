package Class4;

import java.util.Scanner;
/*
Create a Java program that will ask
user to input city and temperature. Your program should
convert Fahrenheit into celsius and print “The temperature
is the city __ is __”
 */

public class T3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your city:");
        String city=scan.nextLine();
        System.out.println("please enter temperature:");
        double temp=scan.nextDouble();
        double tempInCelsius=(temp-32)/1.8;
        System.out.println(" Temperature in "+city+" is "+tempInCelsius+"C");






    }
}
