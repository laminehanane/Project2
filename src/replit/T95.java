package replit;

import java.util.Scanner;

public class T95 {
    //Using Scanner class input string value.
    //Print out the following: "The first 3 letters of \_\_\_ is ___"
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("your input:");
        String sc=scan.nextLine();
        System.out.println(sc.substring(0,3));
    }
}
