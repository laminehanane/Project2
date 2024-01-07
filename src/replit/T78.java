package replit;

import java.util.Scanner;

public class T78 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];
        for (int i = 0; i < 5; i++) {
            num[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            int sum = 0;
            sum = num[i] * 10;
            System.out.println(sum);

        }
    }
}