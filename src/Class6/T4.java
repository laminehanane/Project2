package Class6;
/*
    Print even numbers from 20 to 100
	 Expected output 20 22 24 26….. 100

 */
public class T4 {
    public static void main(String[] args) {
        //can be done also with x=x+2 instead of if condition (x%2==0).

        int x=20;
        while (x<=100){
            if (x%2==0)

                System.out.println(x);
            x++;

        }int i=20;
        while(i<=100){
            System.out.print(i+" ");
            i=i+2;// increments the value of the i by 23
        }
        System.out.println();


    }
}
