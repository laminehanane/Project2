package replit;

import java.util.Scanner;

public class T44 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your favorite car make");
        String carorigin= sc.nextLine();

        switch (carorigin){
            case "BMW":
            System.out.println("german car");
                break;
            case "Toyota":
                System.out.println("japanese car");
                break;
            case "Maserati":
                System.out.println("Italian car");
                break;
            default:
                System.out.println("unknown");
        }
    }
}
