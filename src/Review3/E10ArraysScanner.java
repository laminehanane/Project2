package Review3;

import java.util.Arrays;
import java.util.Scanner;

public class E10ArraysScanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the size of the Array ");
        int size= scanner.nextInt();
        int [] numbers=new int [size];
        System.out.println(numbers.length);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("please enter the number "+(i+1));
            numbers[i]= scanner.nextInt();
        }
        System.out.println(Arrays.toString(numbers));

    }
}
