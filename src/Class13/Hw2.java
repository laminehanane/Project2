package Class13;

public class Hw2 {
    //Write a method to return whether given number is prime or not?
    int isPrime(int num){
        int count=0;
        for (int i = 1; i <=num ; i++) {
            if (num%i==0){
                count++;
            }

        }
        if (count==2){
            System.out.println(num+" is prime");
        }else {
            System.out.println(num+" not prime");
        }
        return num;
    }





}
