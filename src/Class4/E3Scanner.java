package Class4;


import java.util.Scanner;

public class E3Scanner {
    public static void main(String[] args) {
        System.out.println("Please enter your age:");
        /*Scanner is datatype
        scan is variable
        new is a keyword that we use want to read from keyboard
        */
        Scanner scan=new Scanner(System.in);
        // scan.nextINt() take the int number from the keyboard and store it inside age variable
        int age=scan.nextInt();
        System.out.println(" you are "+age+" years old.");


    }
}
