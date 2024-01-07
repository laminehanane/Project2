package Class8;

public class T4 {
    public static void main(String[] args) {
        int[] numbers = {10, 15, 20, 18, 9, 60, 22, 30};
        boolean isSorted = true;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                break;
            }
        }
        System.out.println(" is the loop is not sorted ");


    }
}