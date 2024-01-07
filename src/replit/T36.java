package replit;

import java.util.Scanner;

public class T36 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter two Strings");
        String word1=sc.next();
        String word2=sc.next();
        System.out.println("Please enter two numbers");
        int int1=sc.nextInt();
        int int2=sc.nextInt();
        if (word1.equals(word2)&& int1==int2){
            System.out.println("AND");
        } else if(word1.equals(word2)|| int1==int2) {
            System.out.println("OR");
        }else {
            System.out.println("NONE");
        }
    }
}
