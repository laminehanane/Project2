package replit;

import java.util.Scanner;

public class T105 {
    //here is a code that takes input as a String.
    //Write a program that will print out only vowels of that string
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();

            String V = word.replaceAll("[^aeiouAEIOU]", " ");




            System.out.println(V);
        }

    }



