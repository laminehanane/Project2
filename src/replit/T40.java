package replit;

import java.util.Scanner;

public class T40 {

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter name of the instructor");
            String name=sc.next();

            switch (name){
                case "Asghar":
                    System.out.println("Will take care of Java Assignment");
                    break;
                case "Moazzam":
                    System.out.println("Will take care of SDLC Assignment");
                    break;
                case "Weqas":
                    System.out.println("Will take care of Selenium");
                    break;
                case "Asel":
                    System.out.println("Will take care of every Assignment");
                    break;

                default:
                    System.out.println("invalid");

            }
        }
    }

