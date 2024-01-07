package Class7;

public class T4 {
    //Create an array of cars and store 6 elements into it.
    // Using 2 different loops print all values from the array.
    public static void main(String[] args) {
        String[] names = {"pruis", "camry", "accord", "sienna", "pilot", "corolla"};

        System.out.println(names[0] + " " + names[1] + " " + names[2] + " " + names[3] + " " + names[4] + " " + names[5]);
        System.out.println();


        System.out.println(names.length);// the totale of how many cars

        System.out.println();
        // second methode
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");
        }
    }
}
