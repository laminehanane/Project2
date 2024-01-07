package replit;

public class T82 {
    public static void main(String[] args) {
        int[][] a = {
                {-5, -2, -3, 7},
                {1, -5, -2, 2},
                {1, -2, 3, -4}
        };
        int sum = 0;

        for (int[] row : a) {
            for (int element : row) {
                sum += element; // Add each element to the sum
            }
        }
        System.out.println("The sum of all elements in the 2D array is: " + sum);
    }
    }

