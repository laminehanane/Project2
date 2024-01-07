package replit;

import java.util.Scanner;

public class T77 {
    //Create an array of integers that will store 5 elements taken from a user
    //Don't print any prompt message for the user
    //Then print out all the elements you have created in
    // the first loop in reverse order.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }



        for (int i = 4; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}
