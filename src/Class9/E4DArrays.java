package Class9;

public class E4DArrays {
    public static void main(String[] args) {
        int [][] matrix={
                {10,20,50},
                {25,35,66},
                {80,90,78,45},
                {45,55,66}
        };
        //entire one d array from the 2d array
        int [] row=matrix[0];
        System.out.println(row.length);// the size is 3.
        for (int n:row){
            System.out.print(n+" ");
        }
        System.out.println();
        //accessing individual element from the 2d array
        System.out.println(matrix[2][2]);
    }
}
