package replit;

public class T80 {
    public static void main(String[] args) {
        double[][] numbers = {
                {1.4, 2.0, 3.3, 2.0},
                {4.0, 1.5, 6.1, 1.0},
                {1.2, 3.1, 4.0, 1.6}
        };
       for (double [] num:numbers){
           for (double n:num){
               double Doublenum=n*2;
               System.out.print(Doublenum+" ");
           }
           System.out.println();
       }




    }
}