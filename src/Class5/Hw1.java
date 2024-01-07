package Class5;

import java.util.Scanner;

public class Hw1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your grade :");
        char grade=scan.next().charAt(0);
       switch (grade){
           case 'A':
               System.out.println("Excellent");
               break;
           case 'B':
               System.out.println("Good");
               break;
           case 'C':
               System.out.println("Average");
               break;
           case 'D':
               System.out.println("Bad");
               break;
           default:
               System.out.println(" invalid");
       }

    }
}
