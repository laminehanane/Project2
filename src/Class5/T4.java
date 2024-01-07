package Class5;

import java.util.Scanner;

public class T4 {
    public static void main(String[] args) {
        /*
Write a program for user to enter his/hers birth month. Based on the month define the season.
Example: if user is born in March, April, May → season =”Spring”
if user is born in June, July, August →
season =”Summer”  etc …
At the end of the program we should see 1 output as “You were born is season __”.

 */
        Scanner scan=new Scanner(System.in);
        System.out.println(" Please tell us which month you are born in ?");
        String month=scan.next();
        if (month.equalsIgnoreCase("march")||month.equalsIgnoreCase("april")||month.equalsIgnoreCase("may")) {

            System.out.println(" you were born in season Spring .");

        } else if (month.equalsIgnoreCase("jun")||month.equalsIgnoreCase("july")||month.equalsIgnoreCase("august")||month.equalsIgnoreCase("sept")) {
            System.out.println("you were born in season Summer ");

        } else if (month.equalsIgnoreCase("oct")||month.equalsIgnoreCase("nov")) {
            System.out.println(" you were born in season fall");

        }else {

            System.out.println("you were born in season winter");
        }
    }
}
