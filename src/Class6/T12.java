package Class6;

public class T12 {
    public static void main(String[] args) {
        for (int i = 20; i <= 50; i++) {
            if (i % 2 != 0) {

                System.out.print(i + " ");

            }
        }
        //second methode
        System.out.println();
        int i = 20;
        while (i <= 50) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            i++;

        }
    }
}