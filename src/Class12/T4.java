package Class12;

import java.util.Scanner;
//Write a program that reads two people's first
//names and if they expecting boy or girl?
//Based on the input suggests a name for a baby:
//Example Output:
//Mom’s first name? Mary
//Dad’s first name? Daniel
//Boy or Girl? boy
//Suggested baby name: DANRY

public class T4 {
    public static void main(String[] args) {
        String Momname = "Hanane";
        String Dadname = "Soufiane";
        boolean boy = false;
        if (boy) {
            String babyname = Dadname.substring(0,Dadname.length()/2) + Momname.substring(Momname.length()/2,Momname.length());
            System.out.println(babyname);


        }else {
            String babyname = Momname.substring(0,Momname.length()/2) +Dadname.substring(Dadname.length()/2,Dadname.length());
            System.out.println(babyname);

        }
    }
}