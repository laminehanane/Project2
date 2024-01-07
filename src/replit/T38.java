package replit;

import java.util.Scanner;

public class T38 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Is it weekend?");
        String scan=sc.next();
        if (scan.equals("yes")){
            System.out.println("Today you will be learning manual testing");
        }else if(scan.equals("no")){
            System.out.println("Today you will be learning Java");
        }
    }
}
