package replit;

import java.util.Scanner;

public class T102 {
    //Write a for loop that will loop through every character of a word
    //and print out each character, each on a separate line
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("in:");
        String sc=scan.nextLine();
        for (int i = 0; i < sc.length(); i++) {
            System.out.println(sc.charAt(i));

        }
    }
}
