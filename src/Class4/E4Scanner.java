package Class4;

import java.util.Scanner;

public class E4Scanner {
    public static void main(String[] args) {
        System.out.println("please enter your name :");
        Scanner fetchName= new Scanner(System.in);
        String name=fetchName.next();
        System.out.println("your name is:"+name);
    }
}
