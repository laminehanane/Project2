package replit;

public class T51 {
    //Using do while loop print numbers from 10 to 20

    //Must not include the number 20 in the output

    public static void main(String[] args) {
        int i=10;
        while (i<=20)
            if (i!=20){
                System.out.println(i);
                i++;
            }
    }
}
