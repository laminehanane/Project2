package Class5;

import java.util.Scanner;

public class T5 {
    public static void main(String[] args) {
        /*
3. Write a program that will read three inputs of
scores (quiz, mid term, and final scores) from 0 to 100 and determine
the grade based on the following rules:
if the average score >=90 → grade=A
if the average score >= 70 and <90 → grade=B
if the average score>=50 and <70 → grade=C
if the average score<50 → grade=F

 */
        Scanner sc=new Scanner(System.in);

        double quizgrade,midterm,finalterm,avggrad;
        char grade;

        System.out.println("Please enter your quiz grade :");
        quizgrade=sc.nextDouble();

        System.out.println("Please enter your midterm grade :");
        midterm=sc.nextDouble();

        System.out.println("Please enter your finalterm grade :");
        finalterm=sc.nextDouble();
        avggrad=(quizgrade+midterm+finalterm)/3;
        if (avggrad>=90){
            grade='A';
        } else if (avggrad>=70) {
            grade='B';


        } else if (avggrad>=50) {
            grade='C';

        }else {
            grade='F';
        }
        System.out.println(grade);

    }
}
