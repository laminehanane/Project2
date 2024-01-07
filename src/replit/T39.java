package replit;

import java.util.Scanner;

public class T39 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your mark");
        int marks=scan.nextInt();

        if (marks<25){
            System.out.println("Your grade is F");
        }
        if (marks>=25 && marks<=45){
            System.out.println("Your grade is E");
        } else if (marks>45 && marks<=50) {
            System.out.println("Your grade is D");

        } else if (marks>50 && marks<=60) {
            System.out.println("Your grade is C");

        } else if (marks>60 && marks<=80) {
            System.out.println("Your grade is B");

        }else{
            System.out.println("Your grade is A");
        }
    }
    }

