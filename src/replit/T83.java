package replit;

public class T83 {
    public static void main(String[] args) {
        int [][] array={
                {1,1,2},
                {3,1,2},
                {3,5,3},
                {0,1,2}
        };
        int[] rowSums = new int[array.length]; // Array to store row sums

        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j]; // Calculate sum for each row
            }
            rowSums[i] = sum; // Store sum in the rowSums array
        }

        // Print the row sums
        for (int sum : rowSums) {
            System.out.println(sum);
        }
    }
}
