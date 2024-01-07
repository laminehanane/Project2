package replit;

import java.util.Scanner;

public class T64 {
    public static void main(String[] bars){

        Scanner scanner=new Scanner(System.in);
        int userInput=scanner.nextInt();

        for(int i=0;i< userInput*2; i++){
            System.out.print(i+" ");
        }

    }
}
