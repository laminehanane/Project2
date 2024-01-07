package Class5;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        double num1,num2;
        String operator;
        System.out.println("please enter Number1 :");
        num1=scan.nextDouble();
        System.out.println("please enter Number2 :");
        num2=scan.nextDouble();
        System.out.println("please enter the operator (+,-,/,*) :");
        operator=scan.next();
        if (operator.equals("+")){
            System.out.println("the result is: "+(num1+num2));
        } else if (operator.equals("-")) {
            System.out.println("the result is: "+(num1-num2));

        } else if (operator.equals("/")) {
            System.out.println("the result is: "+(num1/num2));

        } else if (operator.equals("*")) {
            System.out.println("the result is: "+(num1*num2));

        }


    }
}
