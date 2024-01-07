package Class8;

public class T2 {
    public static void main(String[] args) {
        //to count how many numbers are divisible by 5 and how many divisible by 2

        int[] numbers = {101, 100, 25, 30, 25, 50, 300};
        int countdivby2 = 0;
        int countdivby5 = 0;
        for (int n : numbers) {
            if (n % 2 == 0) {
                countdivby2++;
            }
            if (n % 5 == 0) {
                countdivby5++;
            }
        }
            System.out.println("numbers divisibly by 2: " + countdivby2);
            System.out.println("numbers divisibly by 5: " + countdivby5);


    }
}