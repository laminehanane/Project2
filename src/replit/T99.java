package replit;

import java.util.Scanner;

public class T99 {
    //Write code that will take in
    // a String input and check to see if it is a palindrome or not.
    //A palindrome means that the characters are the same forwards and backwards,
    // **ignoring spaces.**
    //Your check should be case insensitive too.  For example, "Bob" is a palindrome,
    // despite the first B being capitalized.

        public static void main (String[]args){
            Scanner inp = new Scanner(System.in);
            System.out.print("In:");
            String givenString = inp.nextLine();
            String reverse="";

            for (int i = givenString.length()-1; i >=0 ; i--) {
                reverse=reverse+givenString.charAt(i);

            }
            if (givenString.equalsIgnoreCase(reverse)){
                System.out.println("true");
            }else {
                System.out.println("false");
            }

        }

}