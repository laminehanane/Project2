package Class8;

public class E1Arrays1 {
    public static void main(String[] args) {
        int[] numbers = {10, 25, 26, 30, 40, 45, 45};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 26) {

                System.out.println("number 26 is present");
             break;// so we are not wasting time and make computer exicut all the cases
            }
        }
    }
}