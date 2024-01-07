package replit;

import java.util.Scanner;

public class T104 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String [] name=new String[5];
        for (int i = 0; i < name.length; i++) {
            System.out.println("In:");
            name[i] = inp.nextLine();
        }
        for (int i = 0; i <= name[i].length(); i++) {
            System.out.println(name[i].substring(0,3));

        }

}
}