package Class9;

public class E2DArrays {
    public static void main(String[] args) {
        int [][] matrix={
                {10,20,50},
                {25,35,66},
                {80,90,78,45},
                {45,55,66}
        };
        System.out.println(matrix[1][1]);//35
        System.out.println(matrix[0][2]);//50
       // System.out.println(matrix[4][2]);//Error
        System.out.println(matrix[3][2]);//66

    }
}
