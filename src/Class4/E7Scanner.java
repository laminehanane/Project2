package Class4;

import java.util.Scanner;

public class E7Scanner {
    public static void main(String[] args) {
        Scanner SC=new Scanner(System.in);
        System.out.println("Please Enter your gender M/F :");
        char gender=SC.next().charAt(0);
        System.out.println(" Your gender is :"+gender);

    }
}
