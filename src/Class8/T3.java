package Class8;

public class T3 {
    public static void main(String[] args) {
        int[] numbers = {10, 15, 20, 18, 9, 60, 22, 30};
        // show  the sum of even and odd number
        int sumOdd = 0;
        int sumEven=0;
        for (int num:numbers) {
            if (num%2==0){
                sumEven=sumEven+num;
            }else{
                sumOdd=sumOdd+num;
            }
        }
        System.out.println("Sum of Even Numbers is "+sumEven);
        System.out.println("Sum of Even Numbers is "+sumOdd);

    }
}