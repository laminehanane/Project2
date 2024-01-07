package Class8;

import java.util.Scanner;

public class E5Arrays {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int [] numbers=new int[5];
        for (int i=0 ; i< numbers.length ; i++){
            System.out.println("Please Enter a number");
            numbers[i]=scanner.nextInt();
        }
        System.out.println("Here are all the numbers that you entred");
        for (int i=0 ; i < numbers.length ; i++){
            System.out.print(numbers[i]+" ");
        }

    }
}