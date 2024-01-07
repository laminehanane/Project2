package replit;

import java.util.Scanner;

public class T76 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[7];
        for (int i = 0; i < names.length; i++) {
            System.out.println("Please Enter day " +
                    ""+(i+1) +" of the week");
            names[i] = sc.nextLine();
        }
        System.out.println(" days of the week:");
        for (String day:names){
            System.out.println(day);
        }
    }

}
