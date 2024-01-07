package Class8;

public class E3Arrays {
    public static void main(String[] args) {
        int[] numbers = {10, 45,12,47,20,30};
        // add all the even numbers from the above array

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2!=0) {
                continue;
            }
            System.out.println(numbers[i]);
        }

    }
}
