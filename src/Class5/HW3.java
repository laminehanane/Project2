package Class5;

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double num1,num2;
        String operator;
        System.out.println("please enter number1 :");
        num1=scan.nextDouble();
        System.out.println("please enter number2 :");
        num2=scan.nextDouble();
        System.out.println("please enter operator :");
        operator=scan.next();

     switch (operator) {
         case "+":
             System.out.println("the result is: "+(num1+num2));
             break;
         case "-" :
             System.out.println("the result is: "+(num1-num2));
             break;
         case "/" :
             System.out.println("the result is: "+(num1/num2));
             break;
         case "*" :
             System.out.println("the result is: "+(num1*num2));
             break;

     }
    }
}
