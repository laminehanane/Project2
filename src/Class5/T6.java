package Class5;

import java.util.Locale;
import java.util.Scanner;

public class T6 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter you country :");
        String country= scan.nextLine();

        switch (country.toLowerCase()){
            case "usa":
                System.out.println("English");
                break;
            case "morocco":
                System.out.println("arabic");
                break;
            case "france":
                System.out.println("french");
                break;
            case "Spain":
                System.out.println("Spanish");
                break;
            default:
                System.out.println("Invalid country");
        }

    }
}
