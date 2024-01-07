package Class7;

public class T8 {
    //From an array of integer elements find the largest number.
    public static void main(String[] args) {
        int[] num =new int[3];
        num[0]=10;
        num[1]=50;
        num[2]=30;

        if ((num[0]>num[1]) && (num[0]>num[2])){
            System.out.println("the largest number is "+num[0]);
        } else if ((num[1]>num[0]) && (num[1]>num[2])) {
            System.out.println("the largest number is "+num[1]);

        }else {
            System.out.println("the largest number is "+num[2]);

    }

        }
    }
