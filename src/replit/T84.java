package replit;

public class T84 {
    public static void main(String[] args) {
        //Write a program that prints the total number of elements that are negative AND odd
        int[][] a = {
                {-5,-2,-3,7},
                {1,-5,-2,2},
                {1,-2,3,-4}
        };
        int count=0;

        for (int[] row : a) {
            for (int num : row) {
                if(num%2!=0 && num<0){
                    count++;
                }

            }
        }
        System.out.println("Total number of neg and odd :"+count);
    }
}
