package Review7;

public class E1 {
    /*
Create a method which will take an array of ints as
input and going to return the sum of all the numbers
from the input array
 */


        public static int sumArray ( int[] Arr){
            int sum = 0;
            for (int i = 0; i < Arr.length; i++) {
                sum = sum + Arr[i];
            }

            return sum;
        }

    public static void main(String[] args) {
        int [] ar=new int[]{10,20,30};
        System.out.println(sumArray(ar));
    }

}