package Class4;

import java.util.Scanner;
/*
You are DMV representative and
you need to ask customer their age.
If they are 18 or older you will
issue a driver license to them,
otherwise you will offer them to get a learners permit.
 */

public class T2 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("How Old are you :");
        int age = Sc.nextInt();

        if (age >= 18) {
            System.out.println(" you can have the Driver License.");

        } else {
            System.out.println("you can get just the learning permit.");
        }
    }
}